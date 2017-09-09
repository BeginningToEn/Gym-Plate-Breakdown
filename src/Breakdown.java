/**
 * Created by EG OLIVER RC on 9/8/2017.
 */
public class Breakdown {
    private int plate45;
    private int plate35;
    private int plate25;
    private int plate10;
    private int plate5;
    private int plate2_5;
    private int totalWeight;
    private int remainderWeight;


    public Breakdown() {
    }

    //Since we are only looking at one side of the bar all weights are doubled
    //So one 45 lb plate on each of the two sides of the bar gives 90 lbs total
    private void run(int totalWeight) {
        if (totalWeight > 0) {
            this.totalWeight = totalWeight;
            remainderWeight = totalWeight - 45;  //account for the weight of the bar

            plate45 = getNumberPlates(45);
            remainderWeight = getRemainderWeight(45);

            plate35 = getNumberPlates(35);
            remainderWeight = getRemainderWeight(35);

            plate25 = getNumberPlates(25);
            remainderWeight = getRemainderWeight(25);

            plate10 = getNumberPlates(10);
            remainderWeight = getRemainderWeight(10);

            plate5 = getNumberPlates(5);
            remainderWeight = getRemainderWeight(5);

            plate2_5 = getNumberPlates(2.5);
            remainderWeight = getRemainderWeight(2.5);
        }
    }

    //calculates how many times a plate should be used per side
    private int getNumberPlates ( double plateWeight ) {
        return (int) (remainderWeight / (plateWeight * 2));
    }

    //calculates how much weight remains after plateWeight has been used
    private int getRemainderWeight ( double plateWeight ) {
        return (int) (remainderWeight % (plateWeight * 2));
    }

    private void printResults() {
        System.out.println(totalWeight + ":");
        System.out.println(plate45 + " x 45");
        System.out.println(plate35 + " x 35");
        System.out.println(plate25 + " x 25");
        System.out.println(plate10 + " x 10");
        System.out.println(plate5 + " x 5");
        System.out.println(plate2_5 + " x 2_5");
        System.out.println();
    }

    public int getPlate45() {
        return plate45;
    }

    public int getPlate35() {
        return plate35;
    }

    public int getPlate25() {
        return plate25;
    }

    public int getPlate10() {
        return plate10;
    }

    public int getPlate5() {
        return plate5;
    }

    public int getPlate2_5() {
        return plate2_5;
    }

    public void runAndPrint(int totalWeight) {
        this.run(totalWeight);
        this.printResults();
    }
}
