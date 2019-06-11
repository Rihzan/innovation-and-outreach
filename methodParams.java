class Robot {
  
  public void speak(String text) {
    System.out.println(text);
  }
  
  public void jump(int height) {
    System.out.println("Jumping: " + height);
  }
  
  public void move(String direction, double distance) {
   System.out.println("Moving " + distance + "meters in direction " + direction); 
  }
  
}


public class methodParams {
  public static void main(String[] args) {
    Robot sam = new Robot();
    
    sam.speak("Hi I'm Sam.");
    
    sam.jump(9);
    sam.move("West", 12.2);
    // not only can you put raw values in method parameters you can also pass in variables
    String greeting = "Hello there.";
    sam.speak(greeting);
    
    int value = 14;
    sam.jump(value);
  }
}