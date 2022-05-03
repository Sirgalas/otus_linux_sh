package otus.project;

import java.util.HashMap;
import java.util.Map;


public class Teenes implements IntToStringInterface{
    Map<Integer, String> map = new HashMap<>();
   
    
    public Teenes (){
        map.put(11, "одинадцать");
        map.put(12, "двенадцать");
        map.put(13, "тринадцать");
        map.put(14, "четырнадцать");
        map.put(15, "пятьнадцать");
        map.put(16, "шестьнадцать");
        map.put(17, "семьнадцать");
        map.put(18, "восемьнадцать");
        map.put(19, "девятьнадцать");
        
    }
    
    @Override
    public String intToString(Integer quantity) throws Exception {  
        
        StringBuilder returnString = new StringBuilder();
        returnString.append(map.get(quantity));
        return returnString.toString();
    }
}
