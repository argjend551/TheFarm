public class Farmer extends Person {

    public int MilkCanCow = 0;
    public int MilkCanSheep = 0;
    Barn barn = new Barn();


    public Farmer(String name) {
        super(name);
    }


    public void MilkCow(String name) {

        Cow cow = (Cow) barn.getAnimals(name);
        MilkCanCow += cow.milkCow();
    }
    public void MilkSheep(String name) {

        Sheep sheep = (Sheep) barn.getAnimals(name);
        MilkCanSheep += sheep.milkSheep();
    }


    public void getMilkCanCow() {
        System.out.println("Your milkcan have been filled " + MilkCanCow + "L" + " of cow milk");

    }
    public void getMilkCanSheep() {
        System.out.println("Your milkcan have been filled " + MilkCanSheep + "L" + " of sheep milk");

    }
}