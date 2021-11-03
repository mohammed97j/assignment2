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
public class employee extends person {
     String office;
    double salary;
    int date_hired;

    public employee() {
    }

    

    public employee(String office, double salary, int date_hired, String name, String address, int phone_number, String email_address) {
        super(name, address, phone_number, email_address);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }
    public String toString(){
        return name +"employee" ;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDate_hired(int date_hired) {
        this.date_hired = date_hired;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public int getDate_hired() {
        return date_hired;
    }
    
    
}
