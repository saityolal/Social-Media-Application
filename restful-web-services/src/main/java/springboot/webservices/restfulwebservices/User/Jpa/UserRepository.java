package springboot.webservices.restfulwebservices.User.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.webservices.restfulwebservices.User.User;

public interface UserRepository extends JpaRepository<User,Integer> {


}
