package zoo;

public class Leaf implements Vegetable{

    //method 명명 - 동사로 해야한다.
    @Override
    public String fiber(String name) {
        return "매우 푸른 " + name;
    }
}
