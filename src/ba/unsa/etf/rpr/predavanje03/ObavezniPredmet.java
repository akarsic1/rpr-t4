package ba.unsa.etf.rpr.predavanje03;

public class ObavezniPredmet extends Predmet{
    boolean isRequired = true;

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }
}
