package book.search.app.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) throws Exception {
    	System.out.println("####Application is called #######");
        SpringApplication.run(Application.class, args);
    }

}
