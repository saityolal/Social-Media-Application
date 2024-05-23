package springboot.webservices.restfulwebservices.User;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Integer Id;

    @Size(min=1, message="Definition should have at least 1 characters")
    private String definition;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;   // This will be created in database as private key's of this variable and hibernate will add suffix _{private key} -> {Entity}_{private key} // in this case it will be user_id

    public Post(Integer id, User user, String definition) {
        Id = id;
        this.user = user;
        this.definition = definition;
    }

    public Post() {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
