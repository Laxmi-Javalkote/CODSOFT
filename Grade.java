

//import java.sql.SQLOutput;
import java.util.Scanner;
public class Grade {
   // Scanner sc=new Scanner(System.in);
public static void main(String args[]){
   @SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
  
    System.out.println("Enter marks in 1st subject");
    int sub1=sc.nextInt();
    System.out.println("Enter marks in 2nd subject");
    int sub2=sc.nextInt();
    System.out.println("Enter marks in 3rd subject");
    int sub3=sc.nextInt();
    System.out.println("Enter marks in 4th subject");
    int sub4=sc.nextInt();
    System.out.println("Enter marks in 5th subject");
    int sub5=sc.nextInt();

    int Sum_marks=(sub1+sub2+sub3+sub4+sub5);
    int avgPercent=Sum_marks/5;
    char Grade=0;

    if(avgPercent<=100&&avgPercent>=90)
    {
        Grade='A';
    }
    else if(avgPercent<90&&avgPercent>=80){
        Grade='B';
    }
    else if(avgPercent<80&&avgPercent>=70){
        Grade='C';
    }
    else if(avgPercent<70&&avgPercent>=60){
        Grade='D';
    }
    else if(avgPercent<60&&avgPercent>=50){
        Grade='E';
    }
    else {
        System.out.println("You are Fail ");
    }

    System.out.println("**********The Result**********");
    System.out.println("Total marks: " + Sum_marks );
    System.out.println("Average Percentage: " + avgPercent+"%");
    if(Grade=='A'||Grade=='B'||Grade=='C'||Grade=='D'||Grade=='E')
    {System.out.println("Grade:"+Grade);}
    else{
        System.out.println("Fail");
    }
    }









}
