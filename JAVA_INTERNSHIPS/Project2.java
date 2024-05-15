import java.io.*;
import java.nio.file.Files;
import java.util.*;

class Student{
    public String name;
    public String roll;
    public String grade;
    public String regno;
    public String phno;
    public int age;
}
class StudentManagement extends Student{
    Scanner sc=new Scanner(System.in);
    String name;
    String roll;
    String grade;
    String regno;
    String phno;
    int age;

    public void addStudent(){
        System.out.print("ENTER THE NAME OF THE STUDENT:");
        String word=sc.next();
        String restString = sc.nextLine();
        name= word+restString;
        System.out.print("ENTER THE ROLL NUMBER OF THE STUDENT:");
        roll=sc.nextLine();
        
        
        System.out.print("ENTER THE GRADE OF THE STUDENT:");
        grade=sc.nextLine();
      
        System.out.print("ENTER THE REGISTRATION NUMBER OF THE STUDENT:");
        regno=sc.nextLine();
        
        System.out.print("ENTER THE PHONE NUMBER OF THE STUDENT:");
        phno=sc.nextLine();
        System.out.print("ENTER THE AGE OF THE STUDENT:");
        age=sc.nextInt();
        if(name!=null && roll!=null && grade!=null && regno!=null && phno!=null && age>16){
            File file=new File("C:/Users/HP/OneDrive/Desktop/java_practice/Students.txt");
            try{
                    
                if(file.length()==0){
                    
                    FileWriter fw = new FileWriter(file.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write("NAME:"+name);
                    bw.write("\t ROLL-NUMBER:"+roll);
                    bw.write("\t GRADE:"+grade);
                    bw.write("\t REGISTRATION NUMBER:"+regno);
                    bw.write("\t PHONE NUMBER:"+phno);
                    bw.write("\t AGE:"+age);
                    bw.write("\n");
                    bw.close();
                    
                    System.out.println("Done");
                }
                else{
                    
                    FileWriter fw = new FileWriter(file.getAbsolutePath(),true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write("NAME:"+name);
                    bw.write("\t ROLL-NUMBER:"+roll);
                    bw.write("\t GRADE:"+grade);
                    bw.write("\t REGISTRATION-NUMBER:"+regno);
                    bw.write("\t PHONE NUMBER:"+phno);
                    bw.write("\t AGE:"+age);
                    bw.write("\n");
                    bw.close();
                    
                    System.out.println("Done");
                    
                }
            
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("FILL THE EVERY INPUT FIELD");
        }
        

    }

    public void search()throws Exception{
        String str;
        File file = new File("C:/Users/HP/OneDrive/Desktop/java_practice/Students.txt");
        FileReader fr=null;
        System.out.print("ENTER THE STUDENT ROLL NUMBER YOU WANT TO FIND:");
        String srch=sc.next();
        try{
            fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            while((str=br.readLine())!=null){
                if(str.contains(srch)){
                    System.out.println(str);
                }
                
            }
            br.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        try{
            Thread.sleep(1200);
        }
        catch(InterruptedException e){}

    }
   

    public void ViewStudent() throws Exception{
        File file = new File("C:/Users/HP/OneDrive/Desktop/java_practice/Students.txt");
        BufferedReader br= new BufferedReader(new FileReader(file));
        String st;
        if(file.length()==0){
            System.out.println("THE FILE IS EMPTY.");
        }
        else{
            while ((st = br.readLine()) != null)
            System.out.println(st);
        }
        br.close();
        try{
            Thread.sleep(1200);
        }
        catch(InterruptedException e){}
    }

    public void edit() throws Exception{
        
        System.out.print("ENTER THE PRESENT ROLL NUMBER OF THE STUDENT WHICH YOU WANT TO EDIT:");
        String srch=sc.next();
        File file = new File("C:\\Users\\HP\\OneDrive\\Desktop\\java_practice\\Students.txt");
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.contains(srch)) {
                    lines.add(line);
                }
            }
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
       
        System.out.print("ENTER THE NEW NAME OF THE STUDENT:");
        String word=sc.next();
        String restString = sc.nextLine();
        name= word+restString;
        System.out.print("ENTER THE NEW ROLL NUMBER OF THE STUDENT:");
        roll=sc.nextLine();
        
        
        System.out.print("ENTER THE NEW GRADE OF THE STUDENT:");
        grade=sc.nextLine();
      
        System.out.print("ENTER THE NEW REGISTRATION NUMBER OF THE STUDENT:");
        regno=sc.nextLine();
        
        System.out.print("ENTER THE NEW PHONE NUMBER OF THE STUDENT:");
        phno=sc.nextLine();
        System.out.print("ENTER THE NEW AGE OF THE STUDENT:");
        age=sc.nextInt();
        if(name!=null && roll!=null && grade!=null && regno!=null && phno!=null && age>15){
          
            try{
                    
               
                    
                FileWriter fw = new FileWriter(file.getAbsolutePath(),true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("NAME:"+name);
                bw.write("\t ROLL-NUMBER:"+roll);
                bw.write("\t GRADE:"+grade);
                bw.write("\t REGISTRATION NUMBER:"+regno);
                bw.write("\t PHONE NUMBER:"+phno);
                bw.write("\t AGE:"+age);
                bw.write("\n");
                bw.close();
                    
                System.out.println("Done");
                    
                
            
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("FILL THE EVERY INPUT FIELD");
        }
        
    }

    public void remove() throws Exception{
        System.out.print("ENTER THE STUDENT ROLL NUMBER YOU WANT TO DELETE:");
        String srch=sc.next();
        File file = new File("C:\\Users\\HP\\OneDrive\\Desktop\\java_practice\\Students.txt");
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.contains(srch)) {
                    lines.add(line);
                }
            }
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
        try{
            Thread.sleep(1200);
        }
        catch(InterruptedException e){}
        
    }
}

public class Project2 {
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        StudentManagement sm=new StudentManagement();
        
        int choice;
        System.out.println("......WELCOME TO OUR STUDENT MANAGEMENT SYSTEM......\n.....LET'S START THE OPERATIONS......");
        try{
            Thread.sleep(1500);
        } catch(InterruptedException e){}
        do{
            System.out.println("1.PRESS 1 TO ADD STUDENTS  \n2.PRESS 2 TO VIEW STUDENT LIST \n3.PRESS 3 TO SEARCH STUDENT DETAILS \n4.PRESS 4 TO EDIT STUDENTS DETAILS \n5.PRESS 5 TO REMOVE STUDENTS DETAILS \n6.PRESS 6 TO EXIT THE APPLICATION.");
            System.out.print("ENTER YOUR CHOICE:");
            choice=sc.nextInt();
            switch(choice){ 
                case 1:
                    sm.addStudent();    
                    break;
                case 2:
                    sm.ViewStudent();
                    break;
                case 3:
                    sm.search();
                    break;
                case 4:
                    sm.edit();
                    break;
                case 5:
                    sm.remove();
                    break; 
                case 6:
                    break;
                
            }
            try{
                Thread.sleep(1200);
            }
            catch(InterruptedException e){}
            
        }while(choice!=6);
        sc.close();
    }
}
