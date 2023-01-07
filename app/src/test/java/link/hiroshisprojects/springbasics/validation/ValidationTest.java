package link.hiroshisprojects.springbasics.validation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemErrNormalized;

class ValidationTest {

	@Test void whenValidationMain_thenValidationError() throws Exception {
		String expected = "Middle initial should only be one character long\n";
		String actual = tapSystemErrNormalized(() -> ValidationMain.main(new String[]{}));
		assertEquals(expected, actual);
	}
}
