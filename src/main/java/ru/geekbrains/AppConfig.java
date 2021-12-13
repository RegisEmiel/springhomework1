package ru.geekbrains;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.geekbrains")
public class AppConfig {
    @Bean(name = "patient")
    @Value("Петров")
    public Patient getPatient(String val){
        return new Patient(val);
    }

//    @Bean(name = "cardfile")
//    public CardFile getCardFile(){
//        return new CardFile();
//    }
//
//    @Bean(name = "timetable")
//    public TimeTable getTimetable(){
//        return new TimeTable();
//    }


    @Bean(name = "registrature")
    public Registrature getRegistrature(){
        Registrature registrature = new Registrature();

        return registrature;
    }
}
