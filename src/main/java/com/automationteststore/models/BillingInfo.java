package com.automationteststore.models;

import com.github.javafaker.Faker;

public class BillingInfo {
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String fax;
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String zip;
    private String country;
    

    public BillingInfo() {
        Faker faker = new Faker();
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.telephone = faker.phoneNumber().cellPhone();
        this.fax = faker.phoneNumber().phoneNumber();
        this.company = faker.company().name();
        this.address1 = faker.address().streetAddress();
        this.address2 = faker.address().secondaryAddress();
        //Иногда выкидывает на этом месте из за пулла стран фейкера(несовпадают названия на сайте и в пулле)
        //надо захардкодить список стран
        this.city = faker.address().city();
        this.zip = faker.address().zipCode();
        this.country = faker.country().name();
        
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getTelephone() { return telephone; }
    public String getFax() { return fax; }
    public String getCompany() { return company; }
    public String getAddress1() { return address1; }
    public String getAddress2() { return address2; }
    public String getCity() { return city; }
    public String getZip() { return zip; }
    public String getCountry() { return country; }
    
}
