package link.hiroshisprojects.springbasics.jdbc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOutNormalized;
public class JdbcTest {

    @Test void whenJdbcMain_thenPropertiesFileRead() throws Exception {
        String expected = "JDBC URL from properties file: http://localhost:5000\n";
        String actual = tapSystemOutNormalized(() -> JdbcMain.main(new String[]{}));
        assertEquals(expected, actual);
    }
}
