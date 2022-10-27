package org.example;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Student_Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressID")
    private int id;

    @Column(length = 50, name = "STREET")
    private String street;

    @Column(length = 100, name = "CITY")
    private String city;

    @Column(name = "is_Open")
    private boolean isOpen;

    @Transient
    private double x;

    @Temporal(TemporalType.DATE)
    private Date addedDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", isOpen=" + isOpen +
                ", x=" + x +
                ", addedDate=" + addedDate +
                '}';
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

}
