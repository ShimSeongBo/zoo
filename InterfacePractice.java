package zoo;

interface Flyable {
    void fly();
}

interface Jumpable {
    void jump();
}

class Bird implements Flyable, Jumpable {

    @Override
    public void fly() {
        System.out.println("Bird's Flying");
    }

    @Override
    public void jump() {
        System.out.println("Bird's Jumping");
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.jump();

        Flyable FlyingBird = new Bird();
        FlyingBird.fly();

        Flyable fly = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Anonymous Bird");
            }
        };
        fly.fly();
    }
}
