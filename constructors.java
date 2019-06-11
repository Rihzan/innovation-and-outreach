class Machine {
 private String name;
 private int code;
 public Machine() {

//   Simplest way of configuring the object
//   name = "Arnie" ;
   
   this("Arnie", 0);// recall the constructor to assign values
   System.out.println("Constructor running!"); 
 }
 
 public Machine(String name) {
   this(name, 0);
   System.out.println("Second Constructor running");
   //this.name = name;
 }
 public Machine(String name, int code) {
  System.out.println("Third constructor running");
  this.name = name;
  this.code = code;
 }
}

public class constructors {
  public static void main(String[] args) {
    Machine machine1 = new Machine();
    
    Machine machine2 = new Machine("Bertie");
    
    Machine machine3 = new Machine("Chalky", 7);
  }
}