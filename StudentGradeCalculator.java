import java.util.*;

 public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //get the no. of subjects
        System.out.println("enter the number of subjects :");
        int nosubjects = sc.nextInt();
        
     //Initialize variables for total marks   
        //To store marks for each subjects 
              int totalmarks = 0;
              int[] marks = new int[nosubjects];
              
              //get the marks for each subjects
        for(int i =0; i< nosubjects ; i++){
           System.out.println("enter the marks for subjects :" + (i+1) + ":");
           marks[i] = sc.nextInt();
           
           // (1-100) valid marks
           if(marks[i] < 0 && marks[i] > 100){
               System.out.println("invalid marks you enter please enter the between 0 to 100 :");
               return ;
           }
           totalmarks += marks[i];
              }
              //Calculate the avrage percentage
              double averagePercenatge = (double) totalmarks / nosubjects;
              
              // calculate the grade 
              char grade = calculateGrade(averagePercenatge);
              
              // display the result
              System.out.println("Total marks is : " + totalmarks);
              System.out.println("Average percentage is : " + averagePercenatge);
              System.out.println("Grade is : " + grade);
              
              sc.close();
               }
              
              public static char  calculateGrade(double  averagePercenatge ){
                  if ( averagePercenatge >= 90 ){
                      return 'A';
                  }else if ( averagePercenatge >= 80){
                      return 'B';
                  }else if (  averagePercenatge >= 70){
                      return 'C';
                  }else if ( averagePercenatge >= 60){
                      return 'D';
                  }else {
                      System.out.println("fail");
                      return 'F';
                  }
              }
            }