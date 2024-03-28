import java.util.Scanner;
class InvalidAgeException extends Exception  
{  
    public InvalidAgeException(String str)  
    {  
        super(str);  
    }  
}
  
public class UserException 
{ 
    static void validate(int age) throws InvalidAgeException{    
       if(age < 18){  
          throw new InvalidAgeException("age is not valid to vote");    
    }  
       else {   
        System.out.println("welcome to vote");   
        }   
     }    
  
    public static void main(String args[])  
    {  
        try  
        {  
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            validate(x);  
        }  
        catch (InvalidAgeException ex)  
        {  
            System.out.println("Caught the exception");  
            System.out.println("Exception occured: " + ex);  
        }  
    }
}  