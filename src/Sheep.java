public class Sheep extends Animal{
    int milkAmount = 5;
    int totalMilk = 10;

    public Sheep(String name) {
        super(name);
    }

    public int milkSheep(){
        if (totalMilk < milkAmount){
            System.out.println("not enough milk");
            return 0;
        }
        totalMilk -= milkAmount;
        return milkAmount;
    }




}
