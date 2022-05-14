package otus.project;

import java.util.Scanner;

public class OtusProject {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое целое до 1000: ");
        try{
            int answer =  sc.nextInt();
            
            System.out.println(new ReturnString().returnString(answer) );
        } catch(NumberFormatException exeption) {
            System.out.println("вы ввели не число ответов ведите заново"); 
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
