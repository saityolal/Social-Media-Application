package springboot.webservices.restfulwebservices.User;

import java.time.LocalDate;
import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

    public static List<User> users = new ArrayList<>();

    
    static {
        users.add(new User(1, "John", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Mary", LocalDate.now().minusYears(20)));
        users.add(new User(3, "Sam", LocalDate.now().minusYears(40)));

    }

    public List<User> findAll() {

        return users;
    }
    
    public User findById(int id) {
        try{
            return users.get(--id);
        }
        catch(Exception e){ 
            System.out.println("\n" +"Error: " + e+ "\n");
            throw new UserNotFoundException("The given id: '" + id + "' is not found");
        }
        
        
    }

    public User save(User user){
        user.setId(users.size()+1);
        users.add(user);
        return user;
    }

    public void deleteById(int id) {
        
        try{
            users.remove(id-1);

        }
        catch(Exception e){ 
            System.out.println("\n" +"Error: " + e+ "\n");
            throw new UserNotFoundException("The given id: '" + id + "' is not found");
        }
    }
}
