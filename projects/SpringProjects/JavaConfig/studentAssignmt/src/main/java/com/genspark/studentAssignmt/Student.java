package com.genspark.studentAssignmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Student {
    private int studentId;
    private String name;
    private List<String> contactNumbers;
    @Autowired
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

    public void config() {
        List<String> contactNumbers = new ArrayList<String>();
        contactNumbers.add("111 111 1111");
        contactNumbers.add("111 222 2222");
        contactNumbers.add("111 333 3333");
        address = new Address("Denver", "CO", "USA");
        Student stud1 = new Student(1, "Mark", contactNumbers, address);
        System.out.println(stud1.toString());
    }
}
