package com.genspark.studentAssignmt;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Student {
    private int studentId;
    private String name;
    private List<String> contactNumbers;
    private Address address;

    public Student(int studentId, String name, List<String> contactNumbers, Address address) {
        this.studentId = studentId;
        this.name = name;
        this.contactNumbers = contactNumbers;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(List<String> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", contactNumbers=" + contactNumbers +
                ", address=" + address +
                '}';
    }
}
