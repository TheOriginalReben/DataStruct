import java.util.Scanner;

public class TowerofHanoi {

   ArrayStack tower1;
   ArrayStack tower2;
   ArrayStack tower3;
   int optimalMoves = 2;
   int moves;

   public TowerofHanoi() {}
   
   public void startMenu() {
      System.out.print("Insert number of discs: ");
      int nod = new Scanner(System.in).nextInt();
      for(int i = 0; i < nod; i++) {
         optimalMoves += optimalMoves -1;
      }
      tower1 = new ArrayStack(nod);
      tower2 = new ArrayStack(nod);
      tower3 = new ArrayStack(nod);
      displayDiscs();
      System.out.println()
   }
   
   public void choose() {
      switch(selectionOne()) {
         case 1:
            System.out.println()
      }
   }
   
   public int selectionOne() {
      System.out.println("Select disc to move. \n1. tower 1 disc\n2. tower 2 disc\n3. tower 3 disc");
      int discS = new Scanner(System.in).nextInt();
      choose();
   }
   
   public int selectionTwo() {
      System.out.print("Select the tower to insert the disc into. \n1. tower 1\n tower 2\n3. tower 3\nPlease select your option. ");
      int towerS = new Scanner(System.in).nextInt();
   }
   
   public void displayDiscs() {
      if(tower1.isEmpty())
         System.out.println("Tower 1 is empty.");
      else System.out.println("Tower 1 has "+tower1.size()+" discs.");
      if(tower2.isEmpty())
         System.out.println("Tower 2 is empty.");
      else System.out.println("Tower 2 has "+tower2.size()+" discs.");
      if(tower3.isEmpty())
         System.out.println("Tower 3 is empty.");
      else System.out.println("Tower 3 has "+tower3.size()+" discs.");
   }
   
   public void displayOM() {
      System.out.println("The optimal number of moves is: "+optimalMoves);
   }

}

class main {
   public static void main(String[] args) {
      new TowerofHanoi().startMenu();
   }
}