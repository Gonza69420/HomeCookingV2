package AccessingSQL;

import model.Client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientDAO {

    public static void createClient(Client client) {
        Conection.getConnection();
        PreparedStatement ps =null;
        try {
            String query = "INSERT INTO client (client_name, client_last_name, phone_number, email, client_DNI, password) VALUES (?,?,?,?,?,?)";
            ps = Conection.getConnection().prepareStatement(query);
            ps.setString(1, client.getFirstName());
            ps.setString(2, client.getLastName());
            ps.setString(3, client.getPhoneNumber());
            ps.setString(4, client.getMail());
            ps.setString(5, client.getDNI());
            ps.setString(6, client.getPassword());
            ps.executeUpdate();
            System.out.println("Client created");

        }catch (Exception e){
            System.out.println("Error at createClient");
            e.printStackTrace();
        }
    }

    public static void updateClient(Client client) {
        Conection.getConnection();
        PreparedStatement ps =null;
        try {
            String query = "UPDATE client SET firstname = ?, lastname = ?, phone = ?, email = ?, dni = ?, password = ? WHERE id = ?";
            ps = Conection.getConnection().prepareStatement(query);
            ps.setString(1, client.getFirstName());
            ps.setString(2, client.getLastName());
            ps.setString(3, client.getPhoneNumber());
            ps.setString(4, client.getMail());
            ps.setString(5, client.getDNI());
            ps.setString(6, client.getPassword());
            ps.setLong(7, client.getId());
            ps.executeUpdate();
            System.out.println("Client updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteClient(Client client) {
        Conection.getConnection();
        PreparedStatement ps =null;
        try {
            String query = "DELETE FROM client WHERE id = ?";
            ps = Conection.getConnection().prepareStatement(query);
            ps.executeUpdate();
            System.out.println("Client deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Client getClient(int id) {
        Conection.getConnection();
        PreparedStatement ps =null;
        try {
            String query = "SELECT * FROM client WHERE idclient = " + id;
            ps = Conection.getConnection().prepareStatement(query);
            ResultSet result = ps.executeQuery(query);
            System.out.println("Client found");
            result.next();
            Client client = new Client(result.getString("client_name"), result.getString("client_last_name"), result.getString("phone_number"), result.getString("email"), result.getString("client_DNI"), result.getString("password"));
            client.setId(result.getLong("idclient"));
            return client;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

}
