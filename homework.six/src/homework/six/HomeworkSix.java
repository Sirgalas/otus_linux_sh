
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
        String[][] questions = {
            {"США","СССР","Древний Рим","Великобритания","Италия"},
            {"ДеГоль","Патон","Монтгомери","Эзенхауер","Мартелл"},
            {"Воротынский","Жуков","Конев","Рокосовский","Ватутин"}
        };
        
        int[] answerCorrect = {2,4,0};
        
        String[] headings = {
            "Кто победил в первой Пунической войне",
            "Кто победил в битве при Пуатье",
            "Кто победил в битве при Молодях"
        };
        
        boolean[] userAnswersArray = new boolean[3];
        for(int i =0; i < questions.length; i++){
            System.out.println(headings[i]);
            String [] someQuestion = questions[i];
            for(int j = 0; j < someQuestion.length; j++){
                System.out.println("если " + someQuestion[j] + " выбирите "+ j);
            }
            int userAnsewerInt  = HomeworkSix.ScanerAnswer(new Scanner(System.in),someQuestion.length);
            userAnswersArray[i] =  userAnsewerInt == answerCorrect[i];
           
        }
         printResult(userAnswersArray,headings);
    } 
    
    
    public static int ScanerAnswer  (Scanner sc, int length) {
      
        
        Scanner scanner = new Scanner(sc.nextLine());
        if (!scanner.hasNextInt()) {
            System.out.println("вы ввели не число в ведите заново");
            return HomeworkSix.ScanerAnswer(sc,length);
        }
            
        int answer = scanner.nextInt();

        if(answer > length)  {
           System.out.println("вы ввели число вне диапазона ответов ведите заново"); 
           return HomeworkSix.ScanerAnswer(sc,length);
        }
           
        return answer;

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
