
import java.util.Scanner;

import static java.lang.System.exit;

public class ATM {
    public float Balance = 50000;
    final int accNo = 12345;
    Scanner sc = new Scanner(System.in);

    void Verify(int AccNo) {
        if (AccNo == accNo) {
            System.out.println("Verified account");
        }
        }

        void Withdraw () {
            System.out.println("Enter amount which you want to withdraw");
            float with_amt = sc.nextFloat();
            if (with_amt < Balance) {
                System.out.println("transaction successfully!");
                System.out.println("Collect your amount");
                Balance = Balance - with_amt;
            } else {
                System.out.println("Transaction failed !");
            }
        }
        void Deposit ()
        {
            System.out.println("Enter amount to be deposited");
            float Dep_amt = sc.nextFloat();
            Balance = Balance + Dep_amt;
            System.out.println("Amount successfully deposited");
        }
        void Check_Balance ()
        {
            System.out.println("Your current balance is :" + Balance);
        }


    }

    class User_Account {
        static Scanner sc = new Scanner(System.in);
        //static final int accNo = 12345;
        static ATM a = new ATM();

       // public static float Balance = 50000;

        public static void main(String[] args) {
            System.out.println("-----------ATM Interface-----------");

            System.out.println("Enter your Bank Account Number");
            int AccNo = sc.nextInt();

            a.Verify(AccNo);
            //System.out.println("Your current balance is :" + Balance);
            char choice;
            do {
                System.out.println("Select Banking options");

                System.out.println("1.Withdraw");
                System.out.println("2.Deposit");
                System.out.println("3.Check Balance");
                System.out.println("4.Go Back to Homepage");

                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        a.Withdraw();
                        break;
                    case 2:
                        a.Deposit();
                        break;
                    case 3:
                        a.Check_Balance();
                        break;
                    case 4:
                        exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");

                }
                System.out.println("Do you want to continue ?");
                choice = sc.next().charAt(0);

            } while (choice == 'y');
        }
    }






