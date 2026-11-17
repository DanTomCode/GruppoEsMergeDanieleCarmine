package ProgettoGarage;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(4);

        Auto autoTagliando = new Auto(
                "AB123CD", "Fiat", "Panda", Operazione.TAGLIANDO);
        Auto autoRiparazione = new Auto(
                "EF456GH", "Ford", "Focus", Operazione.RIPARAZIONI_MECCANICHE);
        Auto autoDiagnostica = new Auto(
                "IJ789KL", "Toyota", "Yaris", Operazione.DIAGNOSTICA_ELETTRONICA);
        Auto autoPneumatici = new Auto(
                "MN012OP", "Volkswagen", "Golf", Operazione.PNEUMATICI);

        System.out.println(garage.autoEntra(autoTagliando));
        System.out.println(garage.autoEntra(autoRiparazione));
        System.out.println(garage.autoEntra(autoDiagnostica));
        System.out.println(garage.autoEntra(autoPneumatici));
        System.out.println(garage.autoEntra(autoPneumatici));
        
        for (int i = 0; i < 4; i++) {
            garage.lavoraSuProssimaAuto();
        }
    }
}
