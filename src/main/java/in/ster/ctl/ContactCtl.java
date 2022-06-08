package in.ster.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.ster.model.User;

@Controller
public class ContactCtl {

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Header Via @ModelAttribute -- Hello, Nitesh");
		m.addAttribute("Footer", "Footer Via @ModelAttribute -- Khargone");
	}

	@RequestMapping("/contact")
	public String showFrom() {

		return "contact";
	}

	// if we are using @RequestParam, it is 1st way alternate is written below

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("uid") String email, @RequestParam("pwd")
	 * String password, Model model) {
	 * 
	 * System.out.println("email" + email); System.out.println("pwd" + password);
	 * 
	 * model.addAttribute("email", email); model.addAttribute("pwd", password);
	 * return "success"; }
	 */

	// if we are using @ModelAttribute, it is 2nd way alternate is above

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, BindingResult result) { // Create User class which has
																				// attributes same as field given
		// in from. it will fetch values from form automattically
		 	
		System.out.println("Entered in processform");
		
		//if any error or exception occur then from here return back to contact.jsp
		if (result.hasErrors()) {
			System.out.println("Returning back to contact");
			return "contact";
		}
		
		// and set in user attributes
		System.out.println(user);

		return "success";
	}

	@RequestMap
	
}
