package ProgettoGarage;

public enum Operazione {
        TAGLIANDO("Tagliando"),
        RIPARAZIONI_MECCANICHE("Riparazioni meccaniche"),
        DIAGNOSTICA_ELETTRONICA("Diagnostica elettronica"),
        PNEUMATICI("Pneumatici");

        private final String descrizione;

        Operazione(String descrizione) {
            this.descrizione = descrizione;
        }

        public String getDescrizione() {
            return descrizione;
        }
    }
