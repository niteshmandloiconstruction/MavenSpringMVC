package in.ster.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionHandleCtl {

	@RequestMapping("/seeException")
	public String seeException() {

		// String str = null;
		// str.length();

		Integer.parseInt("'");
		return "xxyz";
	}

	

	
	/*//handle multiple exception in one method
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerSare() {

		System.out.println("NumberFormat Exception Occur");
		return "abc";
	}*/
	
}
