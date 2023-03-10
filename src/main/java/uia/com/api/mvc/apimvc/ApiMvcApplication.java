package uia.com.api.mvc.apimvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/@SpringBootApplication/
@Configuration
@ComponentScan(basePackages = "uia.com.api")
@Import({AppMvcConfig.class})
@EnableAutoConfiguration
class ApiMvcApplication extends SpringBootServletInitializer {

    private static Class applicationClass = ApiMvcApplication.class;
    public static void main(String[] args) {SpringApplication.run(ApiMvcApplication.class, args); }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(applicationClass);
    }

}
