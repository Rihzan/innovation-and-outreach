public class Oak{
    public Oak() {
        //wont work -- type is private
        //type = "tree";

        //this works --- size is protected, Oak is a subclass of plant.
        this.size = "large";
    }

}