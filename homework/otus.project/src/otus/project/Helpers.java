package otus.project;


public class Helpers {
    public static int remains(int dividend, int divider){
        return dividend % divider;
    }
    
    public static int rounding(int dividend, int divider)
    {
        return ((int) Math.round(dividend / divider)) * divider;
    }
    
    public static int  moreOrOne(Integer quentity){
        
       if((quentity % 100) == 11){
           return 2;
       } 
        
       int result = quentity % 10;
       
       if(result > 4 ){
           return 2;
       }
       
       if(result > 1){
           return 1;
       }
       
       return 0;
    }
}
