package foure;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Client {
    
    public int id;
    
    public String name;
    
    public int age;

    Client() {
        throw new UnsupportedOperationException("Client not find");     
    }


    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        return this.id == other.id;
    }
        
  

    public Client(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
   
    public ArrayList  getAccount(ArrayList<Account> acaunts){
        ArrayList <Account> allAcaunt = new ArrayList<>();
        for(Account acaunt: acaunts){
            if(acaunt.client_id == id){
                allAcaunt.add(acaunt);
            }
        }
            
        return allAcaunt;    
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    
    
}
