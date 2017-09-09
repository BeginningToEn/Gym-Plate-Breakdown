/**
 * Created by EG OLIVER RC on 9/8/2017.
 */
public class Main {
    public static void main(String[] args){
        int[] weights = {140, 155, 175, 165, 155, 150, 140, 130, 120};

        Breakdown myBreakdown = new Breakdown();

        for (int it : weights) {
            myBreakdown.runAndPrint(it);
        }
    }

}
