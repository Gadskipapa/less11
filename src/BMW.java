public class BMW extends Car {

    public static final String COUNTRY = "Germany";
    private int numberOfSpoilers;
    public BMW(String colour, boolean isAutoKpp, int power, int numberOfSpoilers) throws InvalidCarParametersException {
        super(colour, isAutoKpp, power);
        if (numberOfSpoilers <0 || numberOfSpoilers > 10) {
            throw InvalidCarParametersException;
        }
    }

    public void move() {
        System.out.println("BMW moves");
    }

    public void setNumberOfSpoilers(int number) {
        if (number<0 || number>10){
            }

    }
}
