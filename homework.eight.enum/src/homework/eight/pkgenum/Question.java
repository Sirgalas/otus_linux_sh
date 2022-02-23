
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

        int userAnswer = this.scanerAnswer(sc, quetchions.length);

        return answerIsComparison(userAnswer,answerUserInt);
                   
    }
    
     public int scanerAnswer  (Scanner sc, int length) {
      
        String answer = sc.nextLine();
        try{
            int answerToInteger = Integer.parseInt(answer);

            if(answerToInteger > length - 1)  {
               System.out.println("вы ввели число вне диапазона ответов ведите заново"); 
               return this.scanerAnswer(sc,length);
            }

            return answerToInteger;
        } catch(NumberFormatException exeption) {
            System.out.println("вы ввели не число ответов ведите заново"); 
            return this.scanerAnswer(sc,length);
        }    
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
