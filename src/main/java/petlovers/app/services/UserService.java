package petlovers.app.services;

import petlovers.app.dtos.UserDTO;
import petlovers.app.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(UserDTO userDTO);
    Optional<User> consultarUser(Integer cedula);
    List<User> consultarUsers();

}
