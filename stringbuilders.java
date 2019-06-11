public class stringbuilders {
  public static void main(String[] args) {
   
    //Ineffecient
    String info = "";
    
    info += "My name is Bob.";
    info += " ";
    info += "I am a builder.";
    
    System.out.println(info);
    
    // Way more effecient
    StringBuilder sb = new StringBuilder("");
    
    sb.append("My name is Sue.");
    sb.append(" ");
    sb.append("I am a lion tamer");
    
    System.out.println(sb.toString());
    
    ///// Formatting Example //////////////////////
    
    System.out.print("Here is some text. \t That was a tab. \n That was a newline.");
    
    System.out.println(" More text");
    
    System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
    
    for(int i=0; i<20; i++){ 
     System.out.printf("%-2d: some text here\n", i);
    }
    // Formatting floating point value
    System.out.printf("Total value: %.2f\n", 5.6874);
    System.out.printf("Total value: %6.1f\n", 342.23452);
  }
  
}