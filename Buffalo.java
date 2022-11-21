package zoo;

public class Buffalo implements Meat{

    @Override
    public String protein(String meatType) {

        return " 싱싱한 " + meatType ;
    }
}
