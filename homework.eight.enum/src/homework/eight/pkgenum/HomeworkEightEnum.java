
package homework.eight.pkgenum;

import java.util.Scanner;

public class HomeworkEightEnum {


    public static void main(String[] args) {
        
        Question[] arrayQuestion = {new OneQuestion(),new TwoQuestion(),new ThreeQuestion()};
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for( Question question : arrayQuestion) {
            sb.append(question.getFullWork(sc));
        }
        
        System.out.println(sb);
    }
    
}
