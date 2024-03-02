package com.student.manage.entities;


import jakarta.persistence.*;


@Entity


@Table(name = "student_details")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "fullName", nullable = false) // to do not null
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private int mobile;
    @Column(name = "address")
    private String address;

    public Student(String fullName, String email, int mobile, String address) {
        this.fullName = fullName;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
