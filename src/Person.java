public class Person {
    // ny klass av Person där vi kan skapa en farmer som extendar från person för Farmer är en person.

    //konstruktor
    public Person(String name) {
        this.name = name;
        System.out.println("The farmers name is " + name);
    }

    private String name;
}
