/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2;

/**
 *
 * @author GeNDii
 */
public class my_date {
    private int year;
   private  int month;
    private int day;

    public my_date() {
    }

    public my_date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
