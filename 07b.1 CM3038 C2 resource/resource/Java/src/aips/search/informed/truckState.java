package aips.search.informed;

import java.util.List;

import aips.search.ActionStatePair;
import aips.search.State;

public class truckState implements State  {

public double [] []  city_cargo;
public double fcost_AB;
public double fcost_BC;
public double fcost_CA;
public double vcost_AB;
public double vcost_BC;
public double vcost_CA; 
public truck truckLocation;
public String [] cities = {"A", "B", "C"};
    

public truckState(double [][] cargo, double f_AB, double f_BC, double f_AC,double v_AB, double v_BC, double v_AC, truck truckL ){

    this.fcost_AB = f_AB;
    this.fcost_BC = f_BC;
    this.fcost_CA = f_AC;
    this.vcost_AB = v_AB;
    this.vcost_BC = v_BC;
    this.vcost_CA = v_AC;
    this.truckLocation = truckL;
    city_cargo = new double [3] [] ;
    for (int row = 0; row<city_cargo.length; row++){
        for (int col = 0; col < city_cargo[1].length; col++)
        {
            this.city_cargo[row][col] = cargo[row][col];

        }
    }
}
public String toString(){
    String result = "";

    for (int row = 0; row<city_cargo.length ; row++){
        result += "The cargo in a city " + cities[row];
        for (int col = 0; col<city_cargo[0].length ; col++){

            result +=  " " + this.city_cargo[row][col];
            
            


        }
        result += "\n";
    
    
    
    
    
    
    
    }






    

    
    
    
    return result;
}

public truckState applyAction(truckAct action){

    truckState nexState = new truckState(this.city_cargo, this.fcost_AB, this.fcost_AB, this.fcost_AB, this.fcost_AB, this.fcost_AB, this.fcost_AB, this.truckLocation);
    nexState.city_cargo[action.to_city][0] = action.cargo_am; 
    nexState.city_cargo[action.from_cityR][action.from_cityC] = 0;
    
    
    
    return nexState;
   




}

public boolean equals (Object state){
    truckState truckState = (truckState)state;
    for (int row = 0; row<city_cargo.length; row++){
        for (int col = 0; col < city_cargo[1].length; col++)
        {
            if (this.city_cargo[row][col] != truckState.city_cargo[row][col]){
                return false;
            }

        }

    }

    return true;
}







@Override
    public List<ActionStatePair> successor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'successor'");
    }
    
}
