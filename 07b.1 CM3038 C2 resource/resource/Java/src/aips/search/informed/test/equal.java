package aips.search.informed.test;

import aips.search.informed.truckState;

public class equal {


    public static void main(String[] args) {
        double num1[][]={{0,1,2},{3,4,5},{6,7,8}};
        double num2[][]={{0,1,2},{3,4,5},{6,7,8}};	//same values as num1
        double num3[][]={{8,7,6},{5,4,3},{2,1,0}};	//different from num1 and num2  

        truckState t1 = new truckState(num1, 0, 0, 0, 0, 0, 0, null);
        truckState t3 = new truckState(num2, 0, 0, 0, 0, 0, 0, null);
        truckState t4 = new truckState(num3, 0, 0, 0, 0, 0, 0, null);


        System.out.println("State 1:\n"+t1.toString());
        System.out.println("State 2:\n"+t3.toString());
        System.out.println("State 3:\n"+t4.toString());

        System.out.println("State 1 equals State 2: "+t1.equals(t3));		//should be true (as arrays have the same values)
        System.out.println("State 2 equals State 3: "+t3.equals(t4));

    }


    
}
