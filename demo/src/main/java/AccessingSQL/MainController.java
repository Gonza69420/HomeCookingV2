package AccessingSQL;


import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repository.RepositoryClient;

import java.util.Optional;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private RepositoryClient clientRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewClient(@RequestParam String name, @RequestParam String surname, @RequestParam String email, @RequestParam String phone, @RequestParam String DNI, @RequestParam String password) {

        Client client = new Client(name, surname, email, phone, DNI, password);
        Optional<Client> clientOptional = Optional.ofNullable(clientRepository.findBymail(email));
        if (clientOptional.isPresent()) {
            throw new IllegalArgumentException("Client already exists");
        }
        clientOptional = Optional.ofNullable(clientRepository.findByDNI(DNI));
        if (clientOptional.isPresent()) {
            throw new IllegalArgumentException("Client already exists");
        }
        clientRepository.save(client);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Client> getAllClients() {
        // This returns a JSON or XML with the users
        return clientRepository.findAll();
    }

    @DeleteMapping(path="/student/delete/{id}")
    public @ResponseBody String deleteClient(@PathVariable("id") Long id) {
        boolean exists = clientRepository.existsById(id);
        if (!exists) {
            throw new IllegalArgumentException("Client does not exist");
        }

        clientRepository.deleteById(id);
        return "Deleted";
    }
}
