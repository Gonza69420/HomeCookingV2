package security;

import model.Chef;
import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import repository.RepositoryChef;
import repository.RepositoryClient;

@Service
public class SecurityServiceChef implements UserDetailsService {

    @Autowired
    private RepositoryChef userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Chef chef = userRepository.findByEmail(email);
        if(chef ==null) {
            throw new UsernameNotFoundException("User Not Found");
        }
        return new CustomChefDetails(chef);
    }
}