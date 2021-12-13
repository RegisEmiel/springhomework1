package ru.geekbrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Registrature registrature = context.getBean("registrature", Registrature.class);
        System.out.println(registrature.toString());

        registrature.printPatient();
    }
}