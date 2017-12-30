package book.search.app.initializer;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import book.management.repository.UserRepository;

@SpringBootApplication
@EntityScan("book.management.model")
@EnableJpaRepositories("book.management.repository")
public class Application implements CommandLineRunner{
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) throws Exception {
    	System.out.println("####Application is started #######");
        SpringApplication.run(Application.class, args);
    }
	
	@Override
    public void run(String... args) throws Exception {
        System.out.println("Our DataSource is = " + dataSource);
        Iterable<book.management.model.Users> userlist = userRepository.findAll();
        for(book.management.model.Users model:userlist){
            System.out.println("Here is a user: " + model.toString());
        }         
 
    }

}
