package otus.project;

import java.util.HashMap;
import java.util.Map;

public class Dozens implements IntToStringInterface {
    
    Map<Integer, String> map = new HashMap<>();
    
    public Dozens (){
        map.put(20, "двадцать");
        map.put(30, "тридцать");
        map.put(40, "сорок");
        map.put(50, "пятьдесят");
        map.put(60, "шестьдесят");
        map.put(70, "семьдесят");
        map.put(80, "восемьдесят");
        map.put(90, "девяносто");
        
    }
    
    @Override
    public String intToString(Integer quantity) throws Exception {  
        
        StringBuilder returnString = new StringBuilder();
        returnString.append(map.get(Helpers.rounding(quantity, 10)));
        
        int remains = Helpers.remains(quantity, 10);
        
        returnString.append(" ");
        if (remains > 0) {
            returnString.append((new Bridge()).bridge(remains));
        }
        
        return returnString.toString();
    }
}
