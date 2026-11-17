package ProgettoGarage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    
    private List<Auto> autoNelGarage;
    private int capacita;
    
    public Garage(int capacita) {
        
        this.capacita = capacita;
        this.autoNelGarage = new ArrayList<>();
    }

    public String autoEntra(Auto a){

        if(capacita > 0){

            autoNelGarage.add(a);

            return "Auto entrata";
        }
        else{

            return "Capacità massima raggiunta. Auto non entrata";
        }
    }

    public Auto autoEsce(){

        if(!autoNelGarage.isEmpty()){

            return autoNelGarage.removeFirst();
        }
        else{

            return null;
        }
    }

}
