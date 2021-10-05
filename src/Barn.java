import java.util.ArrayList;

public class Barn {

    // ArrayLista med class objektet Animal

    private ArrayList<Animal> Animals = new ArrayList<>();



    // Konstruktorn lägger till djuren i arraylistan Animals
    public Barn(){

        Animals.add(new Cow("Rose"));
        Animals.add(new Cow("Daisy"));
        Animals.add(new Cow ("Eva"));
        Animals.add(new Sheep("John"));
    }


    // Foreachloop för att gå igenom varje element i ArrayListan Animals
    public Animal getAnimals(String name){
        for (Animal animal: Animals){
            // if sats om name är lika som getName metoden i animal kollar om namnet finns i listan.
            if(name.equals(animal.getName())){
                System.out.println("You have chosen to milk "+name);
                System.out.println("Milking......");
                                return animal;
            }
        }
        // Om det inte finns en COW/Sheep med namnen som är lagrade i arraylistan körs denna koden.

        System.out.println("could not found animal");
        return null;
    }





}
