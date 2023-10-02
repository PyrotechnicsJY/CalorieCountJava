// shows average calories burnt per day on a table
import java.util.Scanner;
public class CalorieCount { 
     public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    
    // getting inputs & declaring variables 
    int [] calVals = new int[7];
      calVals [0] = scnr.nextInt();
      calVals [1] = scnr.nextInt(); 
      calVals [2] = scnr.nextInt(); 
      calVals [3] = scnr.nextInt(); 
      calVals [4] = scnr.nextInt(); 
      calVals [5] = scnr.nextInt(); 
      calVals [6] = scnr.nextInt(); 
    int weeks = 1;
    int daycount = 1;
    int weekTotal= 0;
    int alltotal= 0;

// more variables and inputs for ec  
  int monthStart = scnr.nextInt();
  daycount = 1; 
  int holiday1 = scnr.nextInt();
  int holiday2 = scnr.nextInt();
  int holiday3 = scnr.nextInt();
  


    // showing inputs average each weekday and header 
    System.out.println ("Fall 2023 - CS1083 - Section 002 - Project 1 - CalorieCount - written by Christopher Delgado\n");
    System.out.println("Calories burnt on Monday: " + calVals[0]);
    System.out.println("Calories burnt on Tuseday: " + calVals[1]);
    System.out.println("Calories burnt on Wednesday: " + calVals[2]);
    System.out.println("Calories burnt on Thursday: " + calVals[3]);
    System.out.println("Calories burnt on Friday:  " + calVals[4]);
    System.out.println("Calories burnt on Saturday: " + calVals[5]);
    System.out.println("Calories burnt on Sunday: " + calVals[6]); 
    System.out.println("First day of the month (0-Mon, 1-Tue,2-Wed,3-Thurs,4-Fri,5-Sat,6-Sun): "+ monthStart);
    System.out.println("First holiday (day of the month): " +holiday1);
    System.out.println("Second holiday (day of the month): " + holiday2);
    System.out.println("Third  holiday (day of the month): " + holiday3+"\n");

    // computing values and printing values 
    System.out.println("Week\t"+"Monday\t"+"Tuseday\t"+"Wednesday"+"Thursday\t"+"Friday\t"+"Saturday\t"+"Sunday\t"+"Total/Week");

  // loops :3
    for (int i=0; i<=4;i++){ 
      for (int j= 0;j<=6; j++){
        if (j == 0){
          System.out.print(weeks +"\t");
        }
        if ((daycount == holiday1 || daycount == holiday2) || daycount== holiday3 ) {
          System.out.print( daycount+"-0\t ");
          daycount++; 
        }
        else if ((j< monthStart && weeks == 1) ){
          System.out.print( 0+"-0\t ");
          weekTotal = 0 + weekTotal;
        }
        else if (j<monthStart && weeks > 1){
            if (daycount<=30){  
              System.out.print(daycount + "-" +calVals[j]+ "\t ");
              daycount++;  
              weekTotal = weekTotal+ calVals[j]; 
          }
        }
        else if (j >= monthStart){
          if (daycount<=30){  
          System.out.print(daycount + "-" +calVals[j]+ "\t ");
            
          weekTotal = weekTotal+ calVals[j];
          daycount++;  
           }
          else {
          System.out.print(0+"-0\t ");
          }
        }
        if (j==6){
          System.out.print("W" +weeks+"-" +weekTotal); // total column
          }
      }
      weeks++; 
      alltotal = alltotal + weekTotal;
      weekTotal = 0;
      System.out.println("");
     }
     System.out.print("Total Calories: " +alltotal);

}
}
