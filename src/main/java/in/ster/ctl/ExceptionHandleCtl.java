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

	//Handle exception in mvc using @Exception Handler
	
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandlerNull() {

		System.out.println("Null pointer Exception Occur");
		return "abc";
	}

	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerNumber() {

		System.out.println("NumberFormat Exception Occur");
		return "abc";
	}

	
	//handle multiple exception in one method
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerSare() {

		System.out.println("NumberFormat Exception Occur");
		return "abc";
	}
	
}
