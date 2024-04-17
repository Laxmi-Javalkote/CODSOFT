import java.util.Scanner;

class Number_Game {

    public static void NumberGame(){
try (Scanner sc = new Scanner(System.in)) {
    //generate random number
        int lbound = 1;
        int upbound = 100;
        int range = upbound - lbound + 1;
        int randomNumber;
        randomNumber = (int) ((Math.random() * range)) + lbound;
        //System.out.println("Random Number is :" + randomNumber + " ");
    
            int k=5;
            
                System.out.println("-*-*-*-*-*-*-*-*-*-*-WELCOME TO LAXMI'S NUMBER GUESSING GAME-*-*-*-*-*-*-*-*-*-*");
                System.out.println(" ***** RULES TO PLAY THE GAME ***** ");
                System.out.println("..... 1.Enter any random number between 1 to 100 .....");
                System.out.println("..... 2.You have only 5 chances to win .....");
                System.out.println(".......... So Let's get Started ..........");
                int num;
    
                int i;
                for(i=0;i<k;i++)
                {
                System.out.println("Guess the number between 1 to 100");
                num = sc.nextInt();
                
            
        
              
                if (randomNumber==num) {
                    System.out.println("Yes you guessed the correct number");//Guessed Number matches with Random number
                    break;
                } else if (  randomNumber > num &&i!=k-1) {
                    System.out.println("Number is greater than" + num);
                    
                } else if(randomNumber<num&&i!=k-1) 
                {
                    System.out.println("number is less than"+ num);
                    
                }
            }
                if(i==k){
                    System.out.println("You have lost the chances");
                    System.out.println("The number was"+randomNumber);
                   }

  }
}

    public static void main(String[] args) {
        
        NumberGame();
    }

}