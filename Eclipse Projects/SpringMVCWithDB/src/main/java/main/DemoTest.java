package main;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com") //Spring by default scan all the classes in same package 
public class DemoTest {

	public static void main(String[] args) {
	SpringApplication.run(DemoTest.class, args);
	System.err.println("Server is runing");
	}

}
