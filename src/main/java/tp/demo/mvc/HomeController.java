package tp.demo.mvc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("home")
public class HomeController {

	/*
	 * // basic @PathVariable
	 * 
	 * @RequestMapping(value = "welcome/{fromTo}/{username}", method =
	 * RequestMethod.GET) public String home(Model model, @PathVariable("username")
	 * String name, @PathVariable("fromTo") String from) { model.addAttribute("msg",
	 * "hello " + name + " from to " + from);
	 * 
	 * return "home"; }
	 */

	// multiPath request URI
	@RequestMapping(value = "welcome/{fromTo}/{username}", method = RequestMethod.GET)
	public String home(Model model, @PathVariable Map<String, String> multiPath) {

		String username = multiPath.get("username");
		String fromTo = multiPath.get("fromTo");
		model.addAttribute("msg", "hello " + username + " from to " + fromTo);

		return "home";
	}

	@RequestMapping(value = "getAddForm", method = RequestMethod.GET)
	public String getAddForm(Model model) {

		return "form";
	}

	/*
	 * // basic @RequestParam
	 * 
	 * @RequestMapping(value = "submitAddForm", method = RequestMethod.POST) public
	 * String submitAddForm(Model model,
	 * 
	 * @RequestParam(value = "studentName", defaultValue = "anonymous") String name,
	 * 
	 * @RequestParam("studentHobby") String hobby) { model.addAttribute("msg",
	 * "submitted by you:: Name: " + name + ", Hobby: " + hobby); return "info"; }
	 */

	/*
	 * // multi @RequestParam
	 * 
	 * @RequestMapping(value = "submitAddForm", method = RequestMethod.POST) public
	 * String submitAddForm(Model model, @RequestParam Map<String, String>
	 * multiRequestParam) { String name = multiRequestParam.get("studentName");
	 * String hobby = multiRequestParam.get("studentHobby");
	 * model.addAttribute("msg", "submitted by you:: Name: " + name + ", Hobby: " +
	 * hobby); return "info"; }
	 */

	/*
	 * // bacsic bidding data
	 * 
	 * @RequestMapping(value = "submitAddForm", method = RequestMethod.POST) public
	 * String submitAddForm(Model model,
	 * 
	 * @RequestParam(value = "studentName", defaultValue = "anonymous") String name,
	 * 
	 * @RequestParam("studentHobby") String hobby) {
	 * 
	 * Student student = new Student(); student.setStudentName(name);
	 * student.setStudentHobby(hobby);
	 * 
	 * model.addAttribute("student",student); model.addAttribute("msg",
	 * "submitted by you:: Name: " + name + ", Hobby: " + hobby); return "info"; }
	 */

	/*
	 * @RequestMapping(value = "submitAddForm", method = RequestMethod.POST) public
	 * String submitAddForm(Model model,
	 * 
	 * @RequestParam("studentName") String name,
	 * 
	 * @RequestParam("studentHobby") String hobby,
	 * 
	 * @RequestParam("studentMobile") String mobile,
	 * 
	 * @RequestParam("studentDOB") String DOB,
	 * 
	 * @RequestParam("studentSkills") String[] studentSkills) {
	 * 
	 * Student student = new Student(); try {
	 * 
	 * student.setStudentName(name); student.setStudentHobby(hobby);
	 * 
	 * SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	 * 
	 * student.setStudentDOB(format.parse(DOB));
	 * student.setStudentMobile(Long.parseLong(mobile));
	 * 
	 * ArrayList<String> studentSkillsList = new ArrayList<String>();
	 * 
	 * for (int i = 0; i < studentSkills.length; i++) {
	 * 
	 * studentSkillsList.add(studentSkills[i]); }
	 * student.setStudentSkills(studentSkillsList); }catch (Exception e) { // TODO:
	 * handle exception }
	 * 
	 * model.addAttribute("student",student); model.addAttribute("msg",
	 * "submitted by you:: Name: " + student.getStudentName() + ", Hobby: " +
	 * student.getStudentHobby()); return "info"; }
	 */

	/*
	 * @RequestMapping(value = "submitAddForm", method = RequestMethod.POST) public
	 * String submitAddForm(Model model, @ModelAttribute("studentBidding") Student
	 * student) {
	 * 
	 * model.addAttribute("student", student); model.addAttribute("msg",
	 * "submitted by you:: Name: " + student.getStudentName() + ", Hobby: " +
	 * student.getStudentHobby()); return "info"; }
	 */
	
	@InitBinder
	public void innitBinder(WebDataBinder binder) {
		
		binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName" , new StudentNameEditor());
	}
	
	@RequestMapping(value = "submitAddForm", method = RequestMethod.POST)
	public String submitAddForm(Model model,@Valid @ModelAttribute("studentBidding") Student student , BindingResult result) {
		
		if(result.hasErrors()) {
			model.addAttribute("student", student);
			model.addAttribute("msg",
					"submitted by you:: Name: " + student.getStudentName() + ", Hobby: " + student.getStudentHobby());
			return "form";
		}
		model.addAttribute("student", student);

		return "info";
	}

}
