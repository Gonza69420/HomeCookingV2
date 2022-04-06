package model;

public abstract class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String phone;

    public String getEmail() {return email;}

    public String getPassword() {return password;}

    public String getName() {return name;}

    public String getLastName() {return lastName;}

    public String getPhone() {return phone;}

    public void setEmail(String email) {this.email = email;}

    public void setName(String name) {this.name = name;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public void setPhone(String phone) {this.phone = phone;}
}
