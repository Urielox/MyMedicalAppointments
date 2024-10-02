package org.example;

import org.example.ui.UIMenu;

public class Main {
    public static void main(String[] args) {

        //UIMenu.showMenu();

        Doctor myDoctor = new Doctor("Uriel","Pedriatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient myPatient = new Patient("Alejandra", "alejandra@gmail.com");
        System.out.println(myPatient.getweight());

    }
}
