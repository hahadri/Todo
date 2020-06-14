package xyz.falsebit.todo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "xyz.falsebit.todo")
@EntityScan("xyz.falsebit.todo.data.domain")
@EnableJpaRepositories("xyz.falsebit.todo.data")
public class TodoMain extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TodoMain.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoMain.class, args);
    }

}
