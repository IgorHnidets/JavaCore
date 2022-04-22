package com.Homework_6.Task1;

public class Employee_hour implements Zarplata {
    private int per_hour;
    private int daysOfWork;

    public Employee_hour(int per_hour, int daysOfWork) {
        this.per_hour = per_hour;
        this.daysOfWork = daysOfWork;
    }


    public int getPer_hour() {
        return per_hour;
    }

    public void setPer_hour(int per_hour) {
        this.per_hour = per_hour;
    }

    public int getDaysOfWork() {
        return daysOfWork;
    }

    public void setDaysOfWork(int daysOfWork) {
        this.daysOfWork = daysOfWork;
    }

    @Override
    public String toString() {
        return "Employee_hour{" +
                "per_hour=" + per_hour +
                ", daysOfWork=" + daysOfWork +
                '}';
    }

    @Override
    public void employee_hour() {
        System.out.println("Solar per day 1st: " + per_hour*daysOfWork);
    }

    @Override
    public void employee_mounth() {

    }
}
