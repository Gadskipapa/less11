public abstract class Car {

    public static final int NUMBER_OF_WHEELS = 4;
    private String colour;
    private boolean isAutoKpp;
    private int powerOfEngine;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) throws InvalidCarParametersException {
        if (colour == null || colour.isEmpty()) {
            System.out.println("");
            return;
        }
        this.colour = colour;
    }


    public Car(String colour, boolean isAutoKpp, int powerOfEngine) throws InvalidCarParametersException {
        if (colour == null || colour.isEmpty()) {
            throw new InvalidCarParametersException("colour cant be enpty String");
        }
        if (powerOfEngine<0 || powerOfEngine>1000) {
            throw new InvalidCarParametersException("power must be 0 - 1000");
        }
        this.colour = colour;
        this.isAutoKpp = isAutoKpp;
        this.powerOfEngine = powerOfEngine;

        public abstract void move();
        public final getColour() {
            return this.colour;
        }
    }
}
