package zoo;

public class Apple implements Meat, Vegetable{

    @Override
    public String protein(String meatType) {
        return "싱싱한" + meatType;
    }

    @Override
    public String fiber(String name) {
        return "매우 푸른 " + name;
    }

//    @Override
//    public void fiber(String vegetableType) {
//        System.out.println("야채맛 애플");
//    }
}
