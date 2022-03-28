package model;


import javax.persistence.*;

@Entity
public class Chef {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String mail;
    private String password;
    private String phoneNumber;
    private String address;
    private Boolean isActive;
    private String DNI;

    public Chef() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Chef(String fistName, String lastName, String mail, String password, String phoneNumber, String address, Boolean isActive, String DNI) {
        this.firstName = fistName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.isActive = isActive;
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s' , mail='%s', phoneNumber='%s', DNI='%s', isActive='%s', password='%s']",
                id, firstName, lastName, mail, phoneNumber, DNI, isActive, password);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fistName) {
        this.firstName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
