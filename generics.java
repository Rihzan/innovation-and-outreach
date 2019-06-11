import java.util.ArrayList;

public class generics {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);

        System.out.println(animal);

        //////////////////// There can be more than one type of argument ///////////////

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        ///////// Java 7 ////////////////////////////
        ArrayList<Animal> someList = new ArrayList<>();
        
    }
}