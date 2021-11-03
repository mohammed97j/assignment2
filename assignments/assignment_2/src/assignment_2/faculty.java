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
public class faculty extends employee {
     double office_houer;
    String rank;

    public faculty() {
    }

   

    public faculty(double office_houer, String rank, String office, double salary, int date_hired, String name, String address, int phone_number, String email_address) {
        super(office, salary, date_hired, name, address, phone_number, email_address);
        this.office_houer = office_houer;
        this.rank = rank;
    }

    public void setOffice_houer(double office_houer) {
        this.office_houer = office_houer;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public double getOffice_houer() {
        return office_houer;
    }

    public String getRank() {
        return rank;
    }
    public String tostring(){
        return name+"staff";
    }
}
