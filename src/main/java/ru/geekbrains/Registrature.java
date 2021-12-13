package ru.geekbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("registrature")
public class Registrature {

    Patient patient;

    @Autowired
    CardFile cardFile;

    @Autowired
    TimeTable timeTable;

    @Autowired
    Plan plan;

    @Autowired
    public void acceptPatient(Patient patient) {
        this.patient = patient;
    }

    public void printPatient() {
        System.out.println("Обратился пациент: " + patient.getName());

        System.out.println(cardFile.doIt());
        System.out.println(timeTable.doIt());
        System.out.println(plan.doIt());
    }


    @Override
    public String toString() {
        return "Регистратура";
    }
}
