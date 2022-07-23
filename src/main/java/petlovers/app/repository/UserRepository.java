package petlovers.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import petlovers.app.models.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
