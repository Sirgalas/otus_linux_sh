package otus.project;


import java.util.HashMap;
import java.util.Map;


public class Hundreds implements IntToStringInterface {
    
    Map<Integer, String> map = new HashMap<>();
   
    
    public Hundreds (){
        map.put(100, "cто");
        map.put(200, "двести");
        map.put(300, "тристо");
        map.put(400, "четыреста");
        map.put(500, "пятьсот");
        map.put(600, "шестьсот");
        map.put(700, "семьсот");
        map.put(800, "восемьсот");
        map.put(900, "девятьсот");
        
    }
    
    @Override
    public String intToString(Integer quantity) throws Exception {  
        
        StringBuilder returnString = new StringBuilder();
        returnString.append(map.get(Helpers.rounding(quantity, 100)));
        int remains = Helpers.remains(quantity, 100);
        if (remains > 0) {
            returnString.append(" ");
            returnString.append((new Bridge()).bridge(remains));
        }
        
        return returnString.toString();
    }
    
    
}
