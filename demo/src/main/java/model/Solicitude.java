package model;

public class Solicitude {
    private Client client;
    private Chef chef;
    private String date;
    private Menu[] menuItems;
    private boolean status;

    public Solicitude(Client client, Chef chef, String date, Menu[] menuItems, boolean status) {
        this.client = client;
        this.chef = chef;
        this.date = date;
        this.menuItems = menuItems;
        this.status = status;
    }

    public Client getClient() {return client;}

    public Chef getChef() {return chef;}

    public String getDate() {return date;}

    public Menu[] getMenuItems() {return menuItems;}

    public boolean getStatus() {return status;}

    public void setStatus(boolean status) {this.status = status;}
}
