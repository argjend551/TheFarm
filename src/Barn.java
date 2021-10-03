import java.util.ArrayList;

public class Barn {

    public Cow cow;

    private ArrayList<Animal> Animals = new ArrayList<>();

    public Barn(){

        Animals.add(new Cow("Rose"));
        Animals.add(new Cow("Daisy"));
        Animals.add(new Cow ("Eva"));
        Animals.add(new Sheep("John"));
    }

    public Animal getAnimals(String name){
        for (Animal animal: Animals){
            if(name.equals(animal.getName())){
                System.out.println("You have chosen to milk "+name);
                System.out.println("Milking......");
                                return animal;
            }
        }

        System.out.println("could not found animal");
        return null;
    }





}
