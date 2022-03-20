package com.productDock.empMngr.model; //empMngr = employeeManager

import javax.persistence.*;
import java.io.Serializable;

//Emply = Employee
@Entity
public class Emply implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //whaterever Type is ok
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String imgURL;
    @Column(nullable = false, updatable = false)
    private String personalCode;

    public Emply() {} // default constructor

    //constructor with parameters
    public Emply(String name, String email, String phone, String imgURL, String personalCode)
    {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.imgURL = imgURL;
        this.personalCode=personalCode;
    }
    public Long getId() {  return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getImgURL() { return imgURL; }
    public void setImgURL(String imgURL) { this.imgURL = imgURL; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getPersonalCode() { return personalCode; }
    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode; }

    // In printout case: return printout, NOT location of object
    @Override
    public String toString() {
        return "Emply{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", imgURL='" + imgURL + '\'' +
                '}';
    }
}
