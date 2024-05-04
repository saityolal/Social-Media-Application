package springboot.webservices.restfulwebservices.HelloWorldController;

public class helloWorldBean {

    private String message;

    helloWorldBean(String message){

        this.message=message;
        
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "helloWorldBean [message=" + message + "]";
    }


     
}
