import java.util.*;  
class Swapping {  
    public static void main(String[] args) {  
       int x, y, i;// x and y are to swap   
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = sc.nextInt();  
       y = sc.nextInt();  
       System.out.println("before : "+x +"  "+ y);  
       /*swapping */  
       i = x;  
       x = y;  
       y = i;  
       System.out.println("After : "+x +"   " + y);  
       System.out.println( );  
    }    
} 
