public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();


    public void performFly() {
        flyBehavior.fly();
    }
    
    void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜸니다. 가짜 오리도 뜨죠");
    }
}
