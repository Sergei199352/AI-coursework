package aips.search.informed;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
    city_cargo = new double [3] [6] ;
    for (int row = 0; row<this.city_cargo.length; row++){
        for (int col = 0; col < this.city_cargo[0].length -1; col++)
        {
            this.city_cargo[row][col] = cargo[row][col];

        }
    }
}
public String toString(){
    String result = "";

    for (int row = 0; row<this.city_cargo.length ; row++){
        result += "The cargo in a city " + cities[row];
        for (int col = 0; col<this.city_cargo[0].length -1; col++){

            result +=  " " + this.city_cargo[row][col];
            
            


        }
        result += "\n";
        
    
    
    
    
    
    
    
    }






    

    
    
    
    return result;
}

public truckState applyAction(truckAct action){

    truckState nexState = new truckState(this.city_cargo, this.fcost_AB, this.fcost_AB, this.fcost_AB, this.fcost_AB, this.fcost_AB, this.fcost_AB, this.truckLocation);
    
        
        for (int col = 0; col<3 ; col++){

            if (nexState.city_cargo[action.to_city][col] == 0){
                nexState.city_cargo[action.to_city][col] = action.cargo_am;
                
                
            }
            
            // System.out.println(action.from_cityC);
             System.out.println(action.from_cityR);
            
            


        };
        nexState.city_cargo[action.from_cityR][action.from_cityC] = 0;
        double [ ] n = nexState.city_cargo[action.from_cityR];
        System.out.println(Arrays.toString(n));
        
       
    
    
    
    
    
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
        List<ActionStatePair> result = new ArrayList<ActionStatePair>();
        if (this.truckLocation == truck.CITYA){

            Double cargo; //cargo amount 
            int row= 0; // thirst row city A

            int col = 0; // returns the first element oif the array

            int torow = row +1; // next row in line
            

           if (this.city_cargo[row][col] == 0){ // checks if the cargo amount is zero
            col +=1; // if it is then 
            cargo = this.city_cargo[row][col];

           }else{
            cargo = this.city_cargo[row][col];
           }
        


           truckAct action = new truckAct(cargo, row, col, torow, truckLocation);
           truckState nexState = this.applyAction(action);
           ActionStatePair actionStatePair = new ActionStatePair(action, nexState);
           result.add(actionStatePair);
           

                
                    
        }
        if (this.truckLocation == truck.CITYB){

            Double cargo;


            int row= 1; 

            int col = 0;

            int torow = row +1;
            

           if (this.city_cargo[row][col] == 0){
            col +=1;
            cargo = this.city_cargo[row][col];

           }else{
            cargo = this.city_cargo[row][col];
           }
        


           truckAct action = new truckAct(cargo, row, col, torow, truckLocation);
           truckState nexState = this.applyAction(action);
           ActionStatePair actionStatePair = new ActionStatePair(action, nexState);
           result.add(actionStatePair);

                
                    
        }
        if (this.truckLocation == truck.CITYC){

            Double cargo;


            int row= 2; 

            int col = 0;

            int torow = 0;
            

           if (this.city_cargo[row][col] == 0){
            col +=1;
            cargo = this.city_cargo[row][col];

           }else{
            cargo = this.city_cargo[row][col];
           }
        


           truckAct action = new truckAct(cargo, row, col, torow, truckLocation);
           truckState nexState = this.applyAction(action);
           ActionStatePair actionStatePair = new ActionStatePair(action, nexState);
           result.add(actionStatePair);

                
                    
        }

        

        
        
        
        
        
        
        
       
        
        return result;
        




    }
    
    
}
