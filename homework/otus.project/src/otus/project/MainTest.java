package otus.project;

import java.util.Scanner;

public class MainTest {
   public static String[] currency = {"рубль","рубля","рублей"};

    public static void main(String[] args) {

     
       try{
           System.out.println(new ReturnString().returnString(55));
            if(!"пятьдесят пять рублей".equals(new ReturnString().returnString(55))){
                throw new TestException("не соответствует ");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
       
       
    } 
    
    
}
