package org.example.models;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //UIMenu.showMenu();

        Doctor myDoctor = new Doctor("Uriel","Pedriatria");
        myDoctor.addAvailableAppointment(new Date(), "4 pm");
        myDoctor.addAvailableAppointment(new Date(), "10 am");
        myDoctor.addAvailableAppointment(new Date(), "1 pm");
        System.out.println(myDoctor);

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " +aA.getTime());
        }

        Patient myPatient = new Patient("Alejandra", "alejandra@gmail.com");
        System.out.println(myPatient);

    }
}



