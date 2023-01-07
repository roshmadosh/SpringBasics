package link.hiroshisprojects.springbasics.classpath;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

class ClasspathMain {

	public static void main(String[] args) {

		// classpath resource in a Gradle project is rooted at the src/main/resources directory.
		Resource example = 
			new ClassPathResource("classpath/example.txt");
		System.out.println(System.getProperty("java.class.path").replace(':', '\n'));
		if (!example.exists()) {
			System.out.println("Resource could not be found.");
		}

		try {
			InputStream stream = example.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println("Input stream could not be obtained.");
		}

	}
}
