package aips.search.informed;

import java.util.List;

import aips.search.ActionStatePair;
import aips.search.State;

public class runTruck {

   

    public static void main(String[] arg){
        double [] [] array1 = {{2.5, 7.5, 3},{8.5, 10, 0.0},{12, 0.0, 0.0}};
        truck tl = truck.CITYA;
    
        truckState truck_s = new truckState(array1, 80, 20, 50, 1, 4, 2,tl );

        System.out.println(truck_s.toString());



    }
    
}
