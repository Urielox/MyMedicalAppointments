package org.example.models;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    String speciality;

    //Doctor(){
      //  System.out.println("Construyendo el objeto Doctor");
       // id++;
    //}

    Doctor(String name, String email){
        super(name, email);
        System.out.println("El doctor asignado es: "+name);
        this.speciality = speciality;
    }
    public String getSpeciality(){
        return speciality;
    }
    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }
        public int getId(){
            return id;
        }
        public Date getDate(){
            return date;
        }
        public String getTime(){
            return time;
        }
        public void setId(int id){
            this.id = id;
        }
        public void setDate(Date date){
            this.date = date;
        }
        public void setTime(String time){
            this.time = time;
        }
        @Override
        public String toString(){
            return "AvailableAppointments \nDate: "+date+" \nTime: "+time;
        }
