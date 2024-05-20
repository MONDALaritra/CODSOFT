import java.lang.Math;
import java.util.Scanner;
class Project1{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Project1 p=new Project1();
        int wish;
        System.out.println("TOTAL NUMBER OF ATTEMPTS YOU CAN PERFORM IS 3");
        System.out.println(">>>>>>SCORE RULE<<<<<< ");
        System.out.println("SUCCESSFULL IN FIRST ATTEMPT:100 POINTS \n SUCCESSFULL IN SECOND ATTEMPT:50 POINTS \n SUCCESSFULL IN THIRD ATTEMP:25 POINTS");
        do{
            
            p.RandomGen();
            System.out.print("DO YOU WANT TO CONTINUE THE GAME? PRESS 1 TO CONTINUE : ");
            wish=sc.nextInt();
            
        }while(wish==1);
    }

    public void RandomGen(){
        Scanner sc=new Scanner(System.in);
        int max=100;
        int min=1;
        int range= (max-min)+1;
        int rand= (int)(Math.random() * range) + min;
        for(int i=1;i<=3;i++){
            
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
                    if(i==1){
                        System.out.println("EXCELLENT, YOUR SCORE IS 100.");
                    }
                    else if(i==2){
                        System.out.println("GOOD, YOUR SCORE IS 50.");
                    }
                    else{
                        System.out.println("NOT BAD, YOUR SCORE IS 25.");
                    }
                    
                    break;
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
