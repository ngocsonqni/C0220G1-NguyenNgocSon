package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;


@Entity
@Table(name="user")
public class User {
    @Id
    @NotEmpty(message = "Ho khong duoc de trong")
    @Size(min=5,max=45,message = "Ten phai gom tu 5-45 ki tu")
    @Pattern(regexp = "^\\b[A-Z][a-z]*([A-Z][a-z]*)*$",message = "ho phai viet thuong, viet hoa chu cai dau, khong duoc nhap so")
    private String firstName;

    @NotEmpty(message = "Ten khong duoc de trong")
    @Size(min=5,max=45,message = "Ten phai gom tu 5-45 ki tu")
    @Pattern(regexp = "^\\b[A-Z][a-z]*([A-Z][a-z]*)*$",message = "ten phai viet thuong, viet hoa chu cai dau, khong duoc nhap so")
    private String lastName;

    @Min(value=18,message = "tuoi phai lon hon 18")
    @Max(value = 50,message = "tuoi phai nho hon 50")
    private int age;

    @NotEmpty(message = "Email khong duoc de trong")
    @Email(message = "Email khong dung dinh dang")
    public String email;

    public  User(){}
    public User(String firstName, String lastName, int age, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

