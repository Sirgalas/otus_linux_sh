
package five.homework;

/**
 *
 * @author sergalas
 */
public class Five {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayForSorting = {25,41,46,56,35,78,1,65,59,53,42};
        
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for(int i = 1; i< arrayForSorting.length; i ++){
                if(arrayForSorting[i] < arrayForSorting[i - 1]){
                    int temp = arrayForSorting[i];
                    arrayForSorting[i] = arrayForSorting[i - 1];
                    arrayForSorting[i - 1] = temp;
                    isSorted = false;
                }
            }
            
            Five.arrayPrint(arrayForSorting);
        }
        
         Five.arrayPrint(arrayForSorting);
        
    }
    
    private static void  arrayPrint(int[] array) {
    StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0; i < array.length; i++){
            sb.append(array[i]);
            if(i != array.length - 1) sb.append(", ");
        }
        sb.append(']');
        
        System.out.println(sb);
    }
    
}
