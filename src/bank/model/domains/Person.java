/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.model.domains;

/**
 *
 * @author Stian
 */
public abstract class Person {
    
    private int id;
    private String firstname;
    private String lastname;
    private String address;
    private String zip;
    private String city;

    public Person() {}
    
    public Person(String firstname, String lastname, String address, 
            String zip, String city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.zip = zip;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s%nAddress:%n%s, %s %s%n", getFirstname(),
                getLastname(), getAddress(), getZip(), getCity());
    }
}