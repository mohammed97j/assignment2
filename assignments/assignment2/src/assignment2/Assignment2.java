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
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

subject s1=new subject(11234,"math",3);
adress ad1=new adress(12,"minia","egypt");

student std=new student("mohamed",55778,2.8,s1,ad1);

std.display();
    }
    
}
