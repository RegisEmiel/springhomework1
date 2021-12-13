package ru.geekbrains;

import org.springframework.stereotype.Component;

@Component("cardfile")
public class CardFile implements IDoIt{
    public String doIt() {
        return "Вот ваша карта";
    }
}
