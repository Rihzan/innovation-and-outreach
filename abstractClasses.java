// The Machine class is declare abstract
// because it has an abstract method.
// It now can't be instantiated.
abstract class Machine {
    private String name;
    
    public Machine(String name) {
        this.name = name;
    }
    
    public String toString() {
        return "Machine name: " + name;
    }

    // The abstract method must be overridden
    // in child classes, or else they too
    // must be declared abstract and you can't
    // create objects from them.
    abstract public void start();
}

class Car extends Machine {
    public Car(String name) {
        super(name);
    }
    
    @Override
    public void start() {
        System.out.println("Starting the car.");
    }
}

public class abstractClasses {
    public static void main(String[] args) {
        
        // We cannot do the following, because
        // Machine is abstract.
        //Machine machine = new Machine("A machine");
        
        Car car = new Car("A car");
        
        car.start();
        
    }
}

