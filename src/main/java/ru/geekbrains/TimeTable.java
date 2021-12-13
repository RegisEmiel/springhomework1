package ru.geekbrains;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component("taimtable")
public class TimeTable implements IDoIt {
    public String doIt() {
        return "Прием с 12:30";
    }
}
