import java.util.*;
public class TesterCalculator{
/**
@param args
*/
    public static void main(String[] args) {
    Calendar cl = new Calendar();
    double a,b;
    String operation;
    
    System.out.println(" * is for multiplaing");
    System.out.println(" / is for devision");
    System.out.println(" + is for adding ");
    System.out.println(" - is for substraction");
    
     Scanner sc = new Scanner(System.in);
     
    
     System.out.print("Plese enter  firts number");
     a = sc.nextDouble();
     
     
     System.out.print("Plese enter  secund number");
     b = sc.nextDouble();
     
     System.out.print("Plese enter operator");
     operation = sc.next();
     sc.nextLine();
     
     switch (operation){
      case "+":
         System.out.println(" your number is: " + cl.getAdding(a,b));
                
         break;
         
      case "-":
         System.out.println(" your number is:"+  cl.getSubtracting(a,b));
         
         break;
         
      case "*":
         System.out.println(" your number is:"+   cl.getMultiplaing(a,b));
         
         break;
         
      case "/":
        
         System.out.println(" your number is:"+   cl.getMultiplaing(a,b));
        
         break;


         
            
     
     
     
     }

     
     
     
     

      
    
    
    
       
   
   
   }//main



}