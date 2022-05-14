package otus.project;


import java.util.HashMap;
import java.util.Map;


public class Hundreds implements IntToStringInterface {
    
    Map<Integer, String> map = Map.of(
            100, "cто", 
            200, "двести", 
            300, "тристо", 
            400, "четыреста", 
            500, "пятьсот", 
            600, "шестьсот",
            700, "семьсот",
            800, "восемьсот",
            900, "девятьсот"
            );
   
       
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
