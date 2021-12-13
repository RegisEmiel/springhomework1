package ru.geekbrains;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("patient")
@Scope("Prototype")
public class Patient {
    private String Name;

    public Patient() {
    }

    public Patient(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
