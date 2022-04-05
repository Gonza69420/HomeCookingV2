package model;


import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;
    private String firstName;
    private String lastName;
    private String mail;
    private String phoneNumber;
    private String DNI;
    private boolean isActive;
    private String password;

    public Client(String firstName, String lastName, String mail, String phoneNumber, String DNI, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.DNI = DNI;
        this.isActive = false;
        this.password = password;
    }

    protected Client() {}

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s' , mail='%s', phoneNumber='%s', DNI='%s', isActive='%s', password='%s']",
                id, firstName, lastName, mail, phoneNumber, DNI, isActive, password);
    }

    public Solicitude createSolicitude(Chef chef, String date, Menu[] menuItems, boolean status){return new Solicitude(this, chef, date, menuItems, status);}

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
