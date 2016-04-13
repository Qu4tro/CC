import java.util.ArrayList;
import java.util.HashMap;


enum RegisterType {
    IN,
    OUT
}

public class Server {

    HashMap<String, User> users;
    ArrayList<Server> otherServers;

    public void registerUser(String id, String ip, int port, RegisterType type){

        if (type == RegisterType.IN) {
            User usr = new User(id, ip, port);
            users.put(id, usr);
        } else {
            users.remove(id);
        }
    }

    public void registerServer(){

    }

    public void consultRequest(){


    }

    public void consultResponse(){


    }





    
}
