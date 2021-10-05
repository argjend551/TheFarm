public class Farmer extends Person {
    // Farmer extendar från person

    // Milkcannan där man all mjölk ska hamna när man mjölkar
    public int MilkCanCow = 0;
    public int MilkCanSheep = 0;
    Barn barn = new Barn();

    // konstruktorn
    public Farmer(String name) {
        super(name);
    }


    public void MilkCow(String name) {
        // Castar en klass och omvandlar den till en COW och name värdet skickas till getAnimals metoden i Barn
        // där den kollar om det namnet du valt är en COW.

        Cow cow = (Cow) barn.getAnimals(name);
        MilkCanCow += cow.milkCow();
    }
    public void MilkSheep(String name) {
        // Castar en klass och omvanldar den till en Sheep och name värdet skickas till getAnimals metoden i Barn
        // där den kollar om det namnet du valt är en Sheep.
        Sheep sheep = (Sheep) barn.getAnimals(name);
        MilkCanSheep += sheep.milkSheep();
    }


    // getters för att hämta kannan du fyllt.
    public void getMilkCanCow() {
        System.out.println("Your milkcan have been filled " + MilkCanCow + "L" + " of cow milk");

    }
    public void getMilkCanSheep() {
        System.out.println("Your milkcan have been filled " + MilkCanSheep + "L" + " of sheep milk");

    }
}