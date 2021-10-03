public class Cow extends Animal{
    int milkAmount = 10;
    int totalMilk = 30;

    public Cow(String name) {
        super(name);
    }


    public int milkCow(){
        if (totalMilk < milkAmount){
            System.out.println("not enough milk");
            return 0;
        }
        totalMilk -= milkAmount;
        return milkAmount;
    }



}
