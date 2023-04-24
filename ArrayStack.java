import java.util.Scanner;

public class ArrayStack {
   int[] stack;
  
   public ArrayStack(int size) {
      stack = new int[size];
   }
  
    // pop is remove element from top
   public boolean pop() {
      int temp = 1;
      while (temp <= stack.length) {
         if (!isEmpty()) {
            if (stack[stack.length - temp] == 0) {
               temp++;
            } else {
               int value = stack[stack.length - temp];
               stack[stack.length - temp] = 0;
               System.out.println("\n" + value + " removed from stack.");
               return true;
            }
         } else {
            System.out.println("\nStack is empty, cannot pop.");
            return false;
         }
      }
      return false;
   }

  // push is add element from top
   public boolean push(int value) {
      for (int i = 0; i < stack.length; i++) {
         if (!isFull()) {
            if (stack[i] == 0) {
               if (value != 0) {
                  stack[i] = value;
                  System.out.println("\n" + stack[i] + " added to stack.");
                  return true;
               } else {
               System.out.println("\nInvalid input, cannot push 0 to stack.");
               return false;
               }
            }
         } else {
           System.out.println("\nStack is full!");
           return false;
         }
      }
    return false;
   }

  // top is to display front of stack
   public boolean top() {
      int temp = 1;
      while (temp <= stack.length) {
         if (stack[stack.length - temp] == 0) {
            temp++;
         } else {
           System.out.println("\nThe element on top is: " + (stack[stack.length - temp]));
           return true;
         }
       }
       System.out.println("\nnull");
       return false;
   }

  // size is to display the array size
   public int size() {
      return stack.length;
   }

  // empty is checking if last of stack is empty
   public boolean isEmpty() {
      if (stack[0] != 0)
         return false;
      else
         return true;
   }

  // returns true if stack is full;
   public boolean isFull() {
      if (stack[stack.length - 1] != 0)
         return true;
      else
         return false;
   }

   public void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

  /*public void display() {
    System.out.print("\nThe elements of stack [ ");
    for (int i = 0; i < stack.length; i++) {
      if (stack[i] != 0) {
        System.out.print(stack[i] + " ");
      } else
        System.out.print("null ");
      if (i % 10 == 1)
        System.out.println();
    }
    System.out.print("]\n\n");
    menu();
  }*/
}