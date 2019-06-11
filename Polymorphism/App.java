public class App {
    public static void main(String[] args){
        Plant plant = new Plant();
        Tree tree1 = new Tree();

        // Plant plant2 = plant1; changes to tree to show since tree is a child of plant plants can be still reference a tree
        Plant plant2 = tree1;

        plant2.grow();
        tree1.shedLeaves();

        Plant plant3;

        // plant2.shedLeaves();

    }
    public static void doGrow(){
        plant.grow();
    }
}