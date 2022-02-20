
package homework.eight.pkgenum;

import java.util.Scanner;


public abstract class Question {
    
    protected String[] quetchions;
   
    protected int answerUserInt;
   
    protected String headings;
       
    private boolean[] answerUserArray = new boolean[3];
    
    public String getFullWork(Scanner sc){
        
        System.out.println(headings);
            
        printQuestion(quetchions);

        int userAnswer = this.ScanerAnswer(sc, quetchions.length);

        return answerIsComparison(userAnswer,answerUserInt);
                   
    }
    
     public int ScanerAnswer  (Scanner sc, int length) {
      
        
        Scanner scanner = new Scanner(sc.nextLine());
        if (!scanner.hasNextInt()) {
            System.out.println("вы ввели не число в ведите заново");
            return this.ScanerAnswer(sc,length);
        }
            
        int answer = scanner.nextInt();

        if(answer > length)  {
           System.out.println("вы ввели число вне диапазона ответов ведите заново"); 
           return this.ScanerAnswer(sc,length);
        }
           
        return answer;

    }
    
    private void printQuestion(String[] someQuestion){
        for(int i = 0; i < someQuestion.length; i++) { 
                System.out.println("если " + someQuestion[i] + " выбирите "+ i);
        }
    }
    
    
    private String answerIsComparison(int userAnswer, int answerForQuestion){
       
        if(userAnswer == answerForQuestion) return "В вопросе " + headings + " ответ верен\n";
        
        return "В вопросе " + headings + " ответ неверен\n";
    }

     
    
}
