package in.ster.ctl;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CentralizedExcptionHandler {

	//Handle exception in mvc using @Exception Handler
	
		@ExceptionHandler(value = NullPointerException.class)
		public String exceptionHandlerNull() {

			System.out.println("Null pointer Exception Occur");
			return "abc";
		}

		@ExceptionHandler(value = NumberFormatException.class)
		public String exceptionHandlerNumber() {

			System.out.println("NumberFormat Exception Occur");
			return "about";
		}
		
		@ExceptionHandler(value = ClassNotFoundException.class)
		public String exceptionHandlerClassNotFound() {

			System.out.println("NumberFormat Exception Occur");
			return "about";
		}
}
