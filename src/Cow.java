public class Cow extends Animal{
    // milkAmount vad farmer kommer mjölka från Kon
    int milkAmount = 10;
    // totala mjölken som fåret har
    int totalMilk = 30;

    // konstruktorn där initierar name
    public Cow(String name) {
        super(name);
    }


    public int milkCow(){
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
