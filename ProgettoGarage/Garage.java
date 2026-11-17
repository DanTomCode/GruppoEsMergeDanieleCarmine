package ProgettoGarage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public void eseguiTagliando(Auto auto) {
        Objects.requireNonNull(auto, "L'auto è obbligatoria.");
         System.out.println("TagliandoEffettuato");
         
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
