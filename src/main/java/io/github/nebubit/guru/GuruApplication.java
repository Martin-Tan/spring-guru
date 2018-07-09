package io.github.nebubit.guru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import io.github.nebubit.guru.controllers.ConstructorInjectedController;
import io.github.nebubit.guru.controllers.SetterInjectedController;
import io.github.nebubit.guru.controllers.PropertyInjectedController;

@SpringBootApplication
public class GuruApplication {

    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(GuruApplication.class, args);

        System.out.println("==Spring Framework DI==");
        System.out.println(app.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(app.getBean(SetterInjectedController.class).sayHello());
        System.out.println(app.getBean(PropertyInjectedController.class).sayHello());
        System.out.println("==Spring Framework DI==\n");


    }
}
