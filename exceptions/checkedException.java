import java.io.IOException;



public class checkedException {

    
    public static void main(String[] args) {
        checkedException application = new checkedException();
        
        application.run();
    }
    
    private void run() {
        
        Machine machine = new Machine();
        
        try {
            machine.run();
        } catch (IOException e) {
            System.out.println("Caught the exception.");
        }
        
        System.out.println("Carry on and do other stuff ...");
    }
    
}

