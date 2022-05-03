package otus.project;

import java.util.HashMap;
import java.util.Map;


public class Units implements IntToStringInterface {
    Map<Integer, String> map = new HashMap<>();
   
    
    public Units (){
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        
    }
    
    @Override
    public String intToString(Integer quantity) throws Exception {  
        
        StringBuilder returnString = new StringBuilder();
        returnString.append(map.get(quantity));
        return returnString.toString();
    }
}
