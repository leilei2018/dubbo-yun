package dubbo.user.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.PropertySources;

@SpringBootApplication
public class UserMain {
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(UserMain.class)
                .run(args);
    }
}
