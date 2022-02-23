
package homework.six;

import java.util.Scanner;

/**
 *
 * @author sergalas
 */
public class HomeworkSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] variants = {
            {"США","СССР","Древний Рим","Великобритания","Италия"},
            {"ДеГоль","Патон","Монтгомери","Эзенхауер","Мартелл"},
            {"Воротынский","Жуков","Конев","Рокосовский","Ватутин"}
        };
        
        int[] correct = {2,4,0};
        
        String[] question = {
            "Кто победил в первой Пунической войне",
            "Кто победил в битве при Пуатье",
            "Кто победил в битве при Молодях"
        };
        
        boolean[] allAnswer = new boolean[3];
        for(int i =0; i < variants.length; i++){
            System.out.println(question[i]);
            String [] variant = variants[i];
            for(int j = 0; j < variant.length; j++){
                System.out.println("если " + variant[j] + " выбирите "+ j);
            }
            int ansewer  = HomeworkSix.scanerAnswer(new Scanner(System.in),variant.length-1);
            allAnswer[i] =  ansewer == correct[i];
           
        }
         printResult(allAnswer,question);
    } 
    
    
    public static int scanerAnswer  (Scanner sc, int length) {
      
        String answer = sc.nextLine();
        try{
            int answerToInteger = Integer.parseInt(answer);

            if(answerToInteger > length - 1)  {
               System.out.println("вы ввели число вне диапазона ответов ведите заново"); 
               return HomeworkSix.scanerAnswer(sc,length);
            }

            return answerToInteger;
        } catch(NumberFormatException exeption) {
            System.out.println("вы ввели не число ответов ведите заново"); 
            return HomeworkSix.scanerAnswer(sc,length);
        }    
       
    }

    
    public static void printResult(boolean[] answerUser, String[] headings){
        for(int i =0; i < answerUser.length; i++){
            if(answerUser[i]){
                System.out.println("В вопросе " + headings[i] + " ответ верен");
            }else{
                System.out.println("В вопросе " + headings[i] + " ответ неверен");
            } 
        
        }       
    }
}
