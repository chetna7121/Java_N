package javacombined319.usinggenerics;

public class GenericMethodDemo {

    //generic method
    public <T> T display(T t)
    {
        return t;
    }
    public static void main(String[] args) {
        GenericMethodDemo genericMethodDemo = new GenericMethodDemo();
        System.out.println(genericMethodDemo.display("Rahul Sharma"));
        System.out.println(genericMethodDemo.display(100.90F));
        System.out.println(genericMethodDemo.display(false));
        System.out.println(genericMethodDemo.display(98776L));
    }
}
