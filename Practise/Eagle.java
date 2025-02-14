package Practise;

public class Eagle extends Bird {

    private boolean flying;

    public Eagle(String name) {
        super(name);
        this.flying = false;
    }

    @Override
    public String sing() {
        return "Scree!";
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }
}
