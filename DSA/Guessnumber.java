import java.util.*; 
public class Guessnumber {
    public static void main(String[] args) {
        int mynumber = (int)(Math.random() * 100) ;
    int usernumber=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your guess number");
do{
   
    usernumber = sc.nextInt(); 
    if(usernumber==mynumber){
        System.out.println("woohoo you guessed the number");
        break;
    }
    else if(usernumber>mynumber){
        System.out.println("your number is too high");
    }
    else{
        System.out.println("your number is too low");
    }
}while(usernumber>=0);
    
       System.out.println("the number was:"+mynumber);

       sc.close();

    
}}
