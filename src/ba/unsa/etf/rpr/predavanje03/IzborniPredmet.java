package ba.unsa.etf.rpr.predavanje03;

public class IzborniPredmet extends Predmet {
    boolean isRequired = false;
    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }
}
