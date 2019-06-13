import java.io.IOException;


public class Machine {
    public void run() throws IOException {
        
        boolean malfunction = false;
        
        System.out.println("Running ....");
        
        /*
         * Imagine that here there's some
         * code that determines the machine
         * is malfunctioning.
         */
        malfunction = true;
        
        if(malfunction) {
            throw new IOException();
        }
        
        System.out.println("Everything OK");
    }
}

