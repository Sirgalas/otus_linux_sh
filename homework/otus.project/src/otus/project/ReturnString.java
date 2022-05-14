package otus.project;


public class ReturnString {
    
    public static String[] currency = {"рубль","рубля","рублей"};
    
    
    public String returnString(Integer quantity) throws Exception {
        
       String returnStringAnswer = (new Bridge()).bridge(quantity);
       return returnStringAnswer + " " + currency[Helpers.moreOrOne(quantity)];
    }
}
