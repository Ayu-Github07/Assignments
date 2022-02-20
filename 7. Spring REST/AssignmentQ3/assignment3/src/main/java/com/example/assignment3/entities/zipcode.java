package com.example.assignment3.entities;

// Sample Input: 99501
// Sample output: {"state": "AK", City: "ANCHORAGE", "country: "US"}
public class zipcode {
    private int zipcode;
    private String state;
    private String city;
    private String country;

    public zipcode() {
        super();
    }

    public zipcode(int zipcode, String state, String city, String country) {
        this.zipcode = zipcode;
        this.state = state;
        this.city = city;
        this.country = country;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "zipcode [city=" + city + ", country=" + country + ", state=" + state + ", zipcode=" + zipcode + "]";
    }

}
