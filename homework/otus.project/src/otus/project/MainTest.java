package otus.project;

import java.util.Scanner;

public class MainTest {
   public static String[] currency = {"рубль","рубля","рублей"};

    public static void main(String[] args) {
        
        try{
            (new Bridge()).bridge(-1);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        try{
            (new Bridge()).bridge(1001);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    } 
}
