public class Plant {
    //Bad Practice
    public String name;

    //Acceptable practice --- it's final.
    public final static int ID = 8;

    private String type;

    protected String size

    public Plant() {
        this.name = "Freddy";
        this.type = "plant";
        this.size = "medium"
    }
}