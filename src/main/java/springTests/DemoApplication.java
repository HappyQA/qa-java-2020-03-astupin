package springTests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(DemoApplication.class, args);

        System.out.println(context.getBean("getName"));

        MyInterface myInterface = context.getBean(MyInterface.class);
        System.out.println(myInterface.getNameOfClass());

        MyInterface myInterfaceTest = context.getBean("test", MyInterface.class);
        System.out.println(myInterfaceTest.getNameOfClass());

        System.out.println("\n");
        ClassA a = context.getBean(ClassA.class);
        a.somePrint();
    }
    @Bean
    public String getName () {
        return "My name is DemoApplication";
    }
}
