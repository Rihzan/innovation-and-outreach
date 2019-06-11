public class whileLoops {
  public static void main(String[] args) {
    int value = 0;
    // Constantly changes the value and the condition to show infinite loops and failed loops
    while(value < 10) {
     System.out.println("Hello " + value);
     
     value = value + 1;
    }
  }
}