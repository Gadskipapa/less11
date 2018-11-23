public class Mazda extends Car{

    public static final String COUNTRY = "Japan";
    private boolean isPraviRul = true;
    public Mazda (String colour, boolean isAutoKpp, int power) throws InvalidCarParametersException {
        super();
    }

    public boolean isPraviRul() {
        return isPraviRul;
    }

    public void setPraviRul(boolean praviRul) {
        isPraviRul = praviRul;
    }
    public void move() {
        System.out.println("Mazda isPraviRul = " + isPraviRul);
        System.out.println("Mazda gone");
    }
}
