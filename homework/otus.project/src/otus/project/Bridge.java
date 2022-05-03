package otus.project;


public class Bridge {
    
    public  String bridge(Integer quantity) throws Exception{
        
        if(quantity > 1000 ){
            throw new Exception("Вы указали число выше деапозона значений");
        }
        
        if(quantity < 0 ){
            throw new Exception("Вы указали число ниже деапозона значений");
        }
        
        int discharge = quantity.toString().length();
        
        
        if(discharge == 3){
            return ( new Hundreds()).intToString(quantity);
        }
        
        if(discharge == 2 && quantity > 19){
            return (new Dozens()).intToString(quantity);
        }
        
        
        if(discharge == 2 && quantity <= 19){
            return (new Teenes()).intToString(quantity);
        }
        
        return (new Units()).intToString(quantity);
        
        
    }
    
       
    
}
