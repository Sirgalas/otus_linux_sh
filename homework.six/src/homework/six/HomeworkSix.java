
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
        String[][] quetchions = {
            {"США","СССР","Древний Рим","Великобритания","Италия"},
            {"ДеГоль","Патон","Монтгомери","Эзенхауер","Мартелл"},
            {"Воротынский","Жуков","Конев","Рокосовский","Ватутин"}
        };
        int[] answerForQuestion = {2,4,0};
        String[] headings = {
            "Кто победил в первой Пунической войне",
            "Кто победил в битве при Пуатье",
            "Кто победил в битве при Молодях"
        };
        Scanner sc = new Scanner(System.in);
        boolean[] answerUser = new boolean[3];
        for(int i =0; i < quetchions.length; i++){
            System.out.println(headings[i]);
            String [] someQuestion = quetchions[i];
            for(int j = 0; j < someQuestion.length; j++){
                System.out.println("если " + someQuestion[j] + " выбирите "+ j);
            }
            int userAnswer = Integer.parseInt(sc.nextLine());
            
            answerUser[i] = comparison(userAnswer,answerForQuestion[i]);
        }
        
        printResult(answerUser,headings);
    } 
    
    public static boolean comparison(int userAnswer, int answerForQuestion){
       
        return userAnswer == answerForQuestion;
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
