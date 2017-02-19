/*
Jemma Tiongson
Section #16031
App: Loops
Purpose: Demonstrate ability to use for, while, and do while loops
 */

import javax.swing.JOptionPane;
class Loops{
   public static void main (String [] args){
      JOptionPane pane = new JOptionPane();
      String one = JOptionPane.showInputDialog(null, "What is your first symbol?");
      String two = JOptionPane.showInputDialog(null, "What is your second symbol?");
      for(int i = 0; i < 10; i++){ // demonstrating for loops
         for(int j = 0; j < i; j++){ // out of curiousity I tried a nested for loop..
            System.out.print(one);
         }
         System.out.println(two);
      }
      int k = 0;
      while(k<10){ //while loop demo: will execute while the condition is true
         System.out.print("-");
         k++;
      }
      
      System.out.println("\nI am counting down from:"); //do while demo; will execute at least once and will continue to do so while the condition is true
      int start = 5;
      do{
         System.out.println(start);
         start--;
      }
      while(start != 0);
      System.out.println("THIS APP IS COMPLETED! YEEEEYYYY");
   }
}