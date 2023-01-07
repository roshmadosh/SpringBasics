package link.hiroshisprojects.springbasics.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
class PersonValidator implements Validator {
	private final NameValidator nameValidator;

	public PersonValidator(NameValidator nameValidator) {
		this.nameValidator = nameValidator;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return Person.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Person person = (Person) target;
		try {
			errors.pushNestedPath("name");
			ValidationUtils.invokeValidator(this.nameValidator, person.getName(), errors);
		} finally {
			errors.popNestedPath();
		}
	}

}
