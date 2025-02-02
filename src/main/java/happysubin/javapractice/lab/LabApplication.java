package happysubin.javapractice.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(
        basePackages = {"happysubin.javapractice.lab.spring.state_machine.order"}
)
@EnableJpaRepositories(
        basePackages = {"happysubin.javapractice.lab.spring.state_machine.order"}
)
@ComponentScan(basePackages = {
        "happysubin.javapractice.lab.spring.state_machine.order",
        "happysubin.javapractice.lab.security"
})
@SpringBootApplication
public class LabApplication {
    public static void main(String[] args) {
        SpringApplication.run(LabApplication.class, args);
    }
}

