/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author GeNDii
 */
public class student{
     String sname;
     int s_id;
     double s_GPA;
     
subject sub;
adress adr;

    public student(String sname, int s_id, double s_GPA, subject sub, adress adr) {
        this.sname = sname;
        this.s_id = s_id;
        this.s_GPA = s_GPA;
        this.sub = sub;
        this.adr = adr;
    }

   
     
    public void display(){
    System.out.println("student name :"+ sname+"student id"+s_id);
    System.out.println("student subject : "+ sub.sub_id+ " " + sub.sub_name + " "+ sub.sub_hours);
    System.out.println("student adress : "+adr.st_name+" "+adr.city+" "+adr.country);
    }
}
