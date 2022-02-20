package com.example.assignment3.services;

import java.util.ArrayList;
import java.util.List;

import com.example.assignment3.entities.zipcode;

import org.springframework.stereotype.Component;

@Component
public class zipcodeService {

    private static List<zipcode> list = new ArrayList<zipcode>();

    // zipcode Zip = new zipcode(99501, "AK", "ANCHORAGE", "US");
    static {
        list.add(new zipcode(99501, "AK", "ANCHORAGE", "US"));
    }

    public zipcode getzipcodeByzipcode(int zipcode) {

        return list.stream().filter(z -> z.getZipcode() == zipcode).findFirst().get();
    }

    public List<zipcode> getAll() {
        return list;
    }

}
