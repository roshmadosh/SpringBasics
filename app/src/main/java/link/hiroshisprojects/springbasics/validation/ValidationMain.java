package link.hiroshisprojects.springbasics.validation;

import java.util.List;
import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

class ValidationMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
			new AnnotationConfigApplicationContext();

		ctx.register(ValidationConfig.class);
		ctx.refresh();

		PersonValidator personValidator = ctx.getBean(PersonValidator.class);
		Person michael = new Person("Michael", "Gary", "Scott");
		DataBinder dataBinder = new DataBinder(michael);
		dataBinder.addValidators(personValidator);
		dataBinder.validate();

		if (dataBinder.getBindingResult().hasErrors()) {
			ResourceBundleMessageSource messageSource = 
				new ResourceBundleMessageSource();
			messageSource.setBasename("validation/ValidationMessages");

			List<ObjectError> errors = dataBinder.getBindingResult().getAllErrors();
			errors.stream()
				.forEach(e -> {
					String message = messageSource.getMessage(e, Locale.US);
					System.err.println(message);
				});
		} else {
			System.out.println("NO ERRORS TO REPORT");
		}
	}
}
