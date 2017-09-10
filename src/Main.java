/**
 * Created by EG OLIVER RC on 9/8/2017.
 */
public class Main {
    public static void main(String[] args){
        int[] weights = {140, 155, 175, 165, 155, 150, 140, 130, 120};

        for (int it : weights) {
            System.out.println(new PlateBreakdown(it));
        }
    }

}
