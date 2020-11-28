package main;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com") //Spring by default scan all the classes in same package 
@EntityScan(basePackages = "com")		// packages contains entity class. 
public class DemoTest {

	public static void main(String[] args) {
	SpringApplication.run(DemoTest.class, args);
	System.err.println("Server is runing");
	}

}
