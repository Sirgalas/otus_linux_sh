package foure;

import java.util.ArrayList;

public class Account {

    @Override
    public String toString() {
        return "Account{" + "gold=" + gold + "}";
    }
    
    public int gold;
    
    public int client_id;

    public Account(int gold, int client_id) {
        this.gold = gold;
        this.client_id = client_id;
    }
    
    
    public Client getClient(ArrayList<Client> clients){
        
        for(Client client: clients){
            if(client.id == client_id){
                return client;
            }
        }
        return new Client();
    }
    
}
