class Person {
  String name;
  int age; 
 //two Basic Methods with no return statement 
  void speak() {
    for(int i=0; i<3; i++){
     System.out.println("My name is: " + name + " and I am" + age + "years old");
    }
  }
 
  void sayHello() {
    System.out.println("Hello There");
  }
}

public class methods {
  public static void main(String[] args){
    //Create a Person Object using the Person class
    Person person1 = new Person();
    person1.name = "Joe Bloggs";
    person1.age = 37;
    person1.speak();
  }
}