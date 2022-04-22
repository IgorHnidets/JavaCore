package com.Lesson6_interface.Task1;


public class Employee_mounth implements Zarplata{
    private int per_mouth;
    private int days_ofWork;

    public Employee_mounth(int per_mouth, int days_ofWork) {
        this.per_mouth = per_mouth;
        this.days_ofWork = days_ofWork;
    }

    public int getPer_mouth() {
        return per_mouth;
    }

    public void setPer_mouth(int per_mouth) {
        this.per_mouth = per_mouth;
    }

    public int getDays_ofWork() {
        return days_ofWork;
    }

    public void setDays_ofWork(int days_ofWork) {
        this.days_ofWork = days_ofWork;
    }

    @Override
    public String toString() {
        return "Employee_mounth{" +
                "per_mouth=" + per_mouth +
                ", days_ofWork=" + days_ofWork +
                '}';
    }

    @Override
    public void employee_hour() {

    }

    @Override
    public void employee_mounth() {
        System.out.println("Solar per day 2st:"+per_mouth/days_ofWork);
    }

}