package zoo;

public class ZooApplication {
    public static void main(String[] args) {
        Herbivores giraffe = new Giraffe();              //상위 인터페이스로 구현
        Predator tyrannosaurus = new Tyrannosaurus();    //상위 인터페이스로 구현

        Tyrannosaurus tyrannosaurus1 = new Tyrannosaurus();
        tyrannosaurus1.setSpeed(100);
        tyrannosaurus1.run();

        Apple apple = new Apple();      //이중 implements 이기때문에 Apple로 구현.
        Meat buffalo = new Buffalo();   //상위 인터페이스로 구현
        Vegetable leaf = new Leaf();    //상위 인터페이스로 구현

        buffalo.protein(" 물소 ");
        leaf.fiber(" 메이플 ");
        apple.protein(" 단백질 사과 ");

        //giraffe.eatVegetable(leaf.fiber("떡잎"));
        giraffe.eatVegetable(leaf); //leaf -> zoo.Leaf@372f7a8d 참조주소값..
        giraffe.eatVegetable(apple);
        tyrannosaurus.eatMeat(buffalo);
        tyrannosaurus.eatMeat(apple);


       // giraffe.eatVegetable(leaf2.greenFood("나뭇잎"););
    }
}
