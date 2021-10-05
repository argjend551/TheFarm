public class Sheep extends Animal{
    // milkAmount vad farmer kommer mjölka från fåret
    int milkAmount = 5;
    // totala mjölken som fåret har
    int totalMilk = 10;

    // konstruktorn där initierar name
    public Sheep(String name) {
        super(name);
    }

    public int milkSheep(){
        // om totalMilk är mindre än MilkAmount så skrivs "Not enough milk ut"
        if (totalMilk < milkAmount){
            System.out.println("not enough milk");
            return 0;
        }
        // MilkAmount dras av från totalMilk
        totalMilk -= milkAmount;
        return milkAmount;
    }




}
