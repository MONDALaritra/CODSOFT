import java.util.Scanner;


class User {
    public String accno="34200121059";
	public String name="Aritra Mondal";
	public String acc_type="savings";
	public double balance = 50000.55;
    public int PIN=1059;
  
}
class ATM extends User{
    Scanner sc=new Scanner(System.in);
    public String accno= super.accno;
	public String name=super.name;
	public String acc_type=super.acc_type;
	public double balance=super.balance;
    public double PIN=super.PIN;
    public void deposit(){
		double amt;
        int pin;
        System.out.print("ENTER YOUR PIN NUMBER:");
        pin=sc.nextInt();
        if(pin==PIN){
            System.out.print("ENTER THE AMOUNT YOU WANT TO DEPOSIT:");
		    amt=sc.nextDouble();
            balance=balance+amt;
            System.out.println("BALANCE AFTER DEPOSIT:"+balance);
        }
        else{
            System.out.println("!!!!!YOU HAVE ENTERED WRONG PIN NUMBER!!!!");
        }
		
	}

	public void withdraw(){
		double amt;
        int pin;
        System.out.print("ENTER YOUR  PIN NUMBER:");
        pin=sc.nextInt();
        if(pin==PIN){
            System.out.print("ENTER THE AMOUNT YOU WANT TO WITHDRAW:");
		    amt=sc.nextDouble();
            if(balance>=amt){
                balance=balance-amt;
                System.out.println("YOUR TRANSACTION IS SUCCESSFULL.");
                System.out.println("BALANCE AFTER WITHDRAWAL :"+balance);
            }
            else{
                System.out.println("YOUR BALANCE IS LESS THAN " +amt+ "\tTRANSACTION FAILED!!!!");
            }
        }
        else{
            System.out.println("!!!!!YOU HAVE ENTERED WRONG PIN NUMBER!!!!");
        }
		
	}
    public void showAccount(){
        int pin;
        System.out.print("Enter your PIN:");
        pin=sc.nextInt();
        if(pin==PIN){
            System.out.println("NAME OF THE ACCOUNT HOLDER:" +name);
		    System.out.println("ACCOUNT NUMBER:" +accno);
		    System.out.println("ACCOUNT TYPE:" +acc_type);
 		    System.out.println("BALANCE:" +balance);
        }
        else{
            System.out.println("!!!!!YOU HAVE ENTERED WRONG PIN NUMBER!!!!");
        }
		
	}
}

class Project2{
    public static void main(String args[]){
        ATM atm=new ATM();
        Scanner sc=new Scanner(System.in);
        int choice;
		do {
			System.out.println("\n ***WELCOME TO OUR ATM***");
			System.out.println("1.PRESS 1 TO DISPLAY YOUR DETAILS \n2.PRESS 2 TO DEPOSIT AMOUNT\n3.PRESS 3 TO WITHDRAW AMOUNT\n4.EXIT");
			System.out.print("ENTER YOUR CHOICE:");
			choice=sc.nextInt();
			switch(choice){ 
				case 1:
					atm.showAccount();
					break;
				case 2:
					atm.deposit();
					break;
				case 3:
					atm.withdraw();
					break;
				case 4:
					System.out.println("HAVE A NICE DAY......SEE YOU SOON");
					break;
			}
		}
		while(choice!=4);
    }
}