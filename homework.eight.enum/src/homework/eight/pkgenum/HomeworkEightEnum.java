
package homework.eight.pkgenum;

import java.util.Scanner;

public class HomeworkEightEnum {


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        Question question = new Question();
        question.getFullWork(sc);
        
        System.out.println(question.toString());
    }
    
}
