package petlovers.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import petlovers.app.dtos.UserDTO;
import petlovers.app.models.User;
import petlovers.app.services.UserService;

import java.util.List;
import java.util.Optional;

@RestController //controlador de tipo REST(GET,PUT,DELETE ETC)
@RequestMapping("/user/v1")
@CrossOrigin(origins="*") //peticiones del front al back
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok(userService.createUser(userDTO));
    }
    @GetMapping(value="/{cedula}")
    public ResponseEntity<Optional<User>> consultarUser(@PathVariable Integer cedula){
        return ResponseEntity.ok(userService.consultarUser(cedula));
    }
    @GetMapping()
    public ResponseEntity<List<User>> consultarUsers(){
        return ResponseEntity.ok(userService.consultarUsers());
    }


}
