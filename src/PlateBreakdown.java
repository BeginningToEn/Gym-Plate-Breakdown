/**
 * Created by EG OLIVER RC on 9/8/2017.
 */
public class PlateBreakdown {
    private int plate45;
    private int plate35;
    private int plate25;
    private int plate10;
    private int plate5;
    private int plate2_5;
    private int totalWeight;
    private int remainderWeight;

    //Since we are only looking at one side of the bar all weights are doubled
    //So one 45 lb plate on each of the two sides of the bar gives 90 lbs total
    public PlateBreakdown(int totalWeight) {
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
        } else {
            this.plate45 = 0;
            this.plate35 = 0;
            this.plate25 = 0;
            this.plate10 = 0;
            this.plate5 = 0;
            this.plate2_5 = 0;
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

    @Override
    public String toString() {
        return totalWeight + ":\n" +
                plate45 + " x 45\n" +
                plate35 + " x 35\n" +
                plate25 + " x 25\n" +
                plate10 + " x 10\n" +
                plate5 + " x 5\n" +
                plate2_5 + " x 2_5\n";
    }

}
