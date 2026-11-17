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

    public void autoEsce(Auto autoCorrente){

        autoNelGarage.remove(autoCorrente);

        System.out.println("Auto uscita");
    }

    public void lavoraSuProssimaAuto(){

        Auto autoCorrente;

        if(autoNelGarage.isEmpty()){

            System.out.println("Garage vuoto");
        }
        else{

            autoCorrente = autoNelGarage.getFirst();
        }

        switch (autoCorrente.getOperazione()) {
            
            case Operazione.TAGLIANDO:
                
                this.eseguiTagliando(autoCorrente);
                break;
        
            case Operazione.RIPARAZIONI_MECCANICHE:

                this.riparazioneAuto(autoCorrente);
                break;

            case Operazione.DIAGNOSTICA_ELETTRONICA:

                this.diagnosticaEettronica(autoCorrente);
                break;

            case Operazione.PNEUMATICI:

                this.cambiaPneumatici(autoCorrente);
                break;

            default:
                break;
        }

        autoEsce(autoCorrente);
    }

    private void riparazioneAuto(Auto auto){

        System.out.println("Auto riparata");
    }

    private void cambiaPneumatici(Auto autoCorrente){

        System.out.println("Ruote cambiate");
    }
}
