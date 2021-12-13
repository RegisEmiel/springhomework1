package ru.geekbrains;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("plan")
public class Plan implements IDoIt {
    public String doIt() {
        return "Врач принимает на втором этаже";
    }
}
