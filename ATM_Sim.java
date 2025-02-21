import java.util.Scanner;
public class ATM_Sim {
    float availBalance = 0;
    float withdrawal = 0;
    float deposit = 0;
    Scanner sc = new Scanner(System.in);
    void deposit(){
        System.out.println("Enter Deposit Amount: ");
        deposit = sc.nextFloat();
        availBalance +=deposit;
    }

    void withdrawal(){
        System.out.println("Enter Withdrawal amount: ");
        withdrawal = sc.nextFloat();
        availBalance -= withdrawal;
    }

    void balance(){
        System.out.println("Available balance is: "+availBalance);
    }

    public static void main(String[] args) {
        ATM_Sim obj = new ATM_Sim();
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("1 Deposit: ");
            System.out.println("2. Withdrawal");
            System.out.println("3. check Balance");
//            System.out.println("4. Exit");
            System.out.print("Enter Number: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    obj.deposit();
                    obj.balance();
                    break;
                case 2:
                    obj.withdrawal();
                    obj.balance();
                    break;
                case 3:
                    obj.balance();
                    break;
                default:
                    System.out.println("Enter correct value");
            }
        }
    }
}
