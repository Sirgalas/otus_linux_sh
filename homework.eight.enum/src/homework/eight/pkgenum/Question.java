
package homework.eight.pkgenum;

import java.util.Scanner;


public class Question {
    
    private String[][] quetchions = {
        {"США","СССР","Древний Рим","Великобритания","Италия"},
        {"ДеГоль","Патон","Монтгомери","Эзенхауер","Мартелл"},
        {"Воротынский","Жуков","Конев","Рокосовский","Ватутин"}
    };
    
    private int[] answerForQuestion = {2,4,0};
    
    private String[] headings = {
        "Кто победил в первой Пунической войне",
        "Кто победил в битве при Пуатье",
        "Кто победил в битве при Молодях"
    };
    
    private boolean[] answerUser = new boolean[3];
    
    public void getFullWork(Scanner sc){
      
        for(int i =0; i < quetchions.length; i++){
            
            System.out.println(headings[i]);
            
            printQuestion(quetchions[i]);
            
            int userAnswer = Integer.parseInt(sc.nextLine());
            
            answerUser[i] = isComparison(userAnswer,answerForQuestion[i]);
           
        }
        
    }
       
    
    private void printQuestion(String[] someQuestion){
        for(int i = 0; i < someQuestion.length; i++) { 
                System.out.println("если " + someQuestion[i] + " выбирите "+ i);
        }
    }
    
    
    private boolean isComparison(int userAnswer, int answerForQuestion){
       
        return userAnswer == answerForQuestion;
    }

    @Override
    public String toString() {
        String printString = "";
        for(int i =0; i < answerUser.length; i++){
            if(answerUser[i]){
                printString += "В вопросе " + headings[i] + " ответ верен\n";
            }else{
                printString +="В вопросе " + headings[i] + " ответ неверен\n";
            } 
        }   
        return printString;
    }
    
    
}
