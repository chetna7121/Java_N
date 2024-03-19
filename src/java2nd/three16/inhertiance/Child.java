package java2nd.three16.inhertiance;

class Child1 extends Parent
{
    void privateJet()
    {
        System.out.println("This is private jet of Child1");
    }
}
public class Child extends Child1{
    //method overriding
    @Override
   protected void vintageCar() {
        System.out.println("changing color of that vintage car");
    }
    @Override
    void privateJet() {
        System.out.println("Using private jet for global trip");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.vintageCar();
        child.privateJet();
    }
}
