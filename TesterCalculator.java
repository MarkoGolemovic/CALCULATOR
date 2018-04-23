import java.util.*;
public class TesterCalculator{
/**
@param args
*/
    public static void main(String[] args) {
    Calendar cl = new Calendar();
    double a,b;
    
    System.out.println(" * is for multiplaing");
    System.out.println(" / is for devision");
    System.out.println(" + is for adding ");
    System.out.println(" - is for substraction");
    
     Scanner sc = new Scanner(System.in);
     
     a = sc.nextDouble();
     System.out.println("Plese enter  firts number");
     
     b = sc.nextDouble();
     System.out.println("Plese enter  secund number");
     
     Scanner op = new Scanner(System.in);
     System.out.println("Plese enter operator");
     
     switch (operation){
      case "+";
         System.out.println(" your number is:");
         cl.getAdding();         
         break;
         
      case "-";
         System.out.println(" your number is:");
         cl.getSubtracting();
         break;
         
      case "*";
         System.out.println(" your number is:");
         cl.getMultiplaing();
         break;
         
      case "/";
        
         System.out.println(" your number is:");
         cl.getMultiplaing();
         break;


         
            
     
     
     
     }

     
     
     
     

      
    
    
    
       
   
   
   }//main



}