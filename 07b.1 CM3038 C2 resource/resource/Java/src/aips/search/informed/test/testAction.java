package aips.search.informed.test;

import aips.search.informed.truck;
import aips.search.informed.truckAct;

public class testAction {

    public static void main(String[] args) {
        truck tr = truck.CITYA;

        truckAct truck = new truckAct(2, 0, 1, 1, tr);

        System.out.println(truck);
        
    }
    
}
