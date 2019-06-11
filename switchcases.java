import java.util.Scanner;

public class switchcases {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter a command: ");
    String texts = input.nextLine();
    
    switch(texts) {
      case "start":
        System.out.println("Machine started!");
        break;
      case "stop":
        System.out.println("Machine stopped");
        break;
      default : 
        System.out.println("Command not recognized");
    }
  }
}