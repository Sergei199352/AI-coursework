package aips.search.informed.test;

import java.util.Arrays;

import aips.search.informed.truck;
import aips.search.informed.truckState;

public class testSuccess {
    

    public static void main(String[] args) {
        double[][] num1={{8,7,0,0,0,0},{5,4,0,0,0,0},{2,1,0,0,0,0}};
        truck  tr = truck.CITYC;
        truckState s = new truckState(num1, 0, 0, 0, 0, 0, 0, tr);
        System.out.println("State:\n"+s.toString());
        System.out.println("All action-state:\n"+s.successor().toString());
        
        
        

        
    }
}
