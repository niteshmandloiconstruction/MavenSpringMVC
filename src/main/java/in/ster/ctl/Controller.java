package in.ster.ctl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping("/first")
public class Controller {

	@RequestMapping("/home")  //ye home() kab chalega - jab aap /home fire kroge
	public String home(Model model){

		System.out.println("Hello, this is HOME url");
		model.addAttribute("name", "Nitesh Mandloi");
		
		return "index"; //name of page for b/w prefix and suffix
	}
	
	@RequestMapping("/about")
	public String about() {
		
		System.out.println("this is about url");
		return "about";
	}
	
	//Sending data to view by using ModelAndView 
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView mav=new ModelAndView();
		
		
		mav.addObject("name", "Nit Man"); //Setting the DATA
		mav.setViewName("help");		//Setting the VIEW
		
		LocalDateTime currentDateAndTime = LocalDateTime.now();
		mav.addObject("dateTime", currentDateAndTime);
		
		return mav;
	
	}
}
