import java.lang.Math;
import java.util.Scanner;
class Project1{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Project1 p=new Project1();
        int wish;
        do{
            System.out.println("TOTAL NUMBER OF ATTEMPTS YOU CAN PERFORM IS 3");
            p.RandomGen();
            System.out.print("DO YOU WANT TO CONTINUE? PRESS 1 TO CONTINUE : ");
            wish=sc.nextInt();
            
        }while(wish==1);
    }

    public void RandomGen(){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++){
            int max=100;
            int min=1;
            int range= (max-min)+1;
            int rand= (int)(Math.random() * range) + min;
            int score=0;
            System.out.println("......ATTEMPT "+i+".....");
            System.out.print("GUESS THE NUMBER BETWEEN 1 TO 100:");
            int num=sc.nextInt();
            try{
                Thread.sleep(1500);
            }
            catch(InterruptedException e){}
            if(num>=1 && num<=100){
                if(num==rand){
                    System.out.println("Its Correct....");
                    score++;
                }
                else if(num>rand){
                    System.out.println("Too High");
                }
                else{
                    System.out.println("Too low");
                }
                try{
                    Thread.sleep(1500);
                }
                catch(InterruptedException e){}
                System.out.println("The actual number is:"+rand);
                System.out.println("YOUR SCORE IS "+score+" OUT OF 3");
            }
            else{
                try{
                    Thread.sleep(1500);
                }
                catch(InterruptedException e){}
                System.out.println("VALUE MUST BE BETWEEN 1 TO 100");
            }
           
        }
    }
}
