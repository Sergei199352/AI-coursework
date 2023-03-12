package aips.search.informed;

import aips.search.Action;

public class truckAct extends Action {


   public double cargo_am; // the amount of cargo moved

   public int from_cityR; // which sity it comes from

   public int to_city; // which city it goes to

   public truck truck_loc; // location of the truck

   public int from_cityC;


   public truckAct (double am, int frR, int frC, int to, truck tLoc){

    this.cargo_am = am; // yhe amount of the cargo  

    this.from_cityR = frR; // the city of departure cargo array row 
    this.from_cityC = frC; // the city of departure array column

    this.to_city = to; // the destination variable
    this.truck_loc = tLoc; // the location of the truck


   }


   
    
   




    @Override
    public String toString() {
        String result = "";


        switch(truck_loc){

            case CITYAB: result += "Moving cargo between A and B";
                         result += "the cargo amount is "+ this.cargo_am;


            case CITYBC:result += "Moving cargo between B and C";
                        result += "the cargo amount is "+ this.cargo_am;

            case CITYCA:result += "Moving cargo between C and A";
                        result += "the cargo amount is "+ this.cargo_am;

            case CITYAC:result += "Moving cargo between A and C";
                        result += "the cargo amount is "+ this.cargo_am;
                    }





        return result;
    }
    
}
