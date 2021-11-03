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
public class student extends person {
    
    final String sta1 ="freshman";
    final String sta2 ="sophomor";
    final String sta3 ="Junior";
    final String sta4 ="Senior";

    public student() {
    }

    public student(String name, String address, int phone_number, String email_address) {
        super(name, address, phone_number, email_address);
        
    }
      @Override
    public String toString(){
        return name  +"student";
        
    }
   
}
