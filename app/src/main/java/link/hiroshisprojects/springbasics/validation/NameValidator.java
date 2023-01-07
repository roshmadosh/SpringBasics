package link.hiroshisprojects.springbasics.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class NameValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Name.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "first", "name.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "last", "name.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "middleInitial", "name.empty");
		Name name = (Name) target;

		if(name.getMiddleInitial().length() > 1) {
			errors.rejectValue("middleInitial", "middle.initial.length");
		}
	}

}
