package model;


import javax.persistence.*;

@Entity
public class Chef {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private int id;
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



    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Menu createMenu(String name, String description, int price, String category){ //TODO: Pensar como meter imagenes
        return new Menu(name, description, price, category);
    }
    public void acceptSolicitude(Solicitude solicitude){solicitude.setStatus(true);}
    public void denySolicitude(Solicitude solicitude){solicitude.setStatus(false);}

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public String getMail() {return mail;}

    public String getPassword() {return password;}

    public String getPhone() {return phoneNumber;}

    public String getAddress() {return address;}

    public Boolean getActive() {return isActive;}

    public String getDNI() {return DNI;}

    private void setPassword(String password) {this.password = password;} //To be used only by the system when the user forgets the password

}
