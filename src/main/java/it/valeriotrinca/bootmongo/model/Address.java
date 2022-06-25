package it.valeriotrinca.bootmongo.model;

import lombok.Data;

@Data
public class Address {
    private String city;
    private String zip;
    private String street;
    private String number;
}
