package ProgettoGarage;

import java.util.Locale;
import java.util.Objects;

public class Auto {
    private final String targa;
    private final String marca;
    private final String modello;
    private final Operazione operazione;

    public Auto(String targa, String marca, String modello, Operazione operazione) {
        this.targa = normalizzaTarga(targa);
        this.marca = validaTesto(marca, "La marca");
        this.modello = validaTesto(modello, "Il modello");
        this.operazione = Objects.requireNonNull(operazione, "L'operazione è obbligatoria.");
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public Operazione getOperazione() {
        return operazione;
    }

    private static String normalizzaTarga(String targa) {
        return validaTesto(targa, "La targa").toUpperCase(Locale.ROOT);
    }

    private static String validaTesto(String valore, String nomeCampo) {
        Objects.requireNonNull(valore, nomeCampo + " è obbligatoria.");
        String testo = valore.trim();
        if (testo.isEmpty()) {
            throw new IllegalArgumentException(nomeCampo + " non può essere vuota.");
        }
        return testo;
    }

    @Override
    public String toString() {
        return "Auto{targa='" + targa + "', marca='" + marca + "', modello='"
                + modello + "', operazione='" + operazione.getDescrizione() + "'}";
    }
}
