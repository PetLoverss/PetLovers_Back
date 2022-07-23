package petlovers.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petlovers.app.dtos.UserDTO;
import petlovers.app.models.User;
import petlovers.app.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplement implements UserService{

    @Autowired //inyeccion del repositorio usuario, solo los metodos
    private UserRepository userRepository;

    @Override
    public User createUser(UserDTO userDTO) {
        return userRepository.save(new User(userDTO));
    }

    @Override
    public Optional<User> consultarUser(Integer cedula) {
        return userRepository.findById(cedula);
    }

    @Override
    public List<User> consultarUsers() {
        return userRepository.findAll();
    }
}
