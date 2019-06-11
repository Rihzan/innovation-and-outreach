class Frog {
 private String name;
 private int age;
 
 public void setName(String name){
   this.name = name;
 }
 
 public void setAge(int age){ 
   this.age = age; // "this" represents the objects variable. Seperates the local variable and the instance
 }
 public String getName() {
  return name; 
 }
 
 public int getAge() {
  return age; 
 }
 
 public void setInfo(String name, int age) { //Even bettter to call this
  setName(name);
  setAge(age);
 }
}

public class settersAndThis {
 
  public static void main(String[] args){
   
    Frog frog1 = new Frog();
    
    //frog1.name = "Bertie"; <---- Old way not good practice
    //frog1.age = 1;
    
    frog1.setName("Bertie");
    frog1.setAge(1);
    
    System.out.println(frog1.getName());
  }
}