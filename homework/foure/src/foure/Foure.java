
package foure;

import java.util.ArrayList;

public class Foure {

    public static void main(String[] args) {
        
        ArrayList<Client> clientList = new ArrayList();
        clientList.add(new Client (1,"Serge",18));
        clientList.add(new Client (2,"Petr",22));
        clientList.add(new Client (3,"Ivan",28));
        clientList.add(new Client (4,"Mike",30));
        
        ArrayList<Account> accountList = new ArrayList();
        accountList.add(new Account(18,1));
        accountList.add(new Account(0,1));
        accountList.add(new Account(222,2));
        accountList.add(new Account(222,2));
        accountList.add(new Account(28,3));
       
        clientList.forEach((Client client) -> {
            System.out.println(client);
            System.out.println(client.getAccount(accountList));
            System.out.println("------------");
        });
        System.out.println("/---------/");
        accountList.forEach((Account account) -> {
            System.out.println(account.getClient(clientList));
            System.out.println(account);
            System.out.println("------------");
        
        });
        
    }
    
}
