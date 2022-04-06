package security;

import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import repository.RepositoryClient;

@Service
public class SecurityServiceClient implements UserDetailsService {

    @Autowired
    private RepositoryClient userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Client client = userRepository.findByEmail(email);
        if(client ==null) {
            throw new UsernameNotFoundException("User Not Found");
        }
        return new CustomClientDetails(client);
    }

    public UserDetails loadUserByEmail(String email) throws UsernameNotFoundException {

        Client client = userRepository.findByEmail(email);
        if(client ==null) {
            throw new UsernameNotFoundException("User Not Found");
        }
        return new CustomClientDetails(client);
    }
}