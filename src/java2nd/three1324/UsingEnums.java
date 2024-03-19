package java2nd.three1324;

public class UsingEnums {
    void checkMango() {
        System.out.println(Mango.Carrie);
        System.out.println(Mango.Fairchild.ordinal());
    }
    void iteratingEnum() {
        for (Mango mango : Mango.values()) {
            System.out.println(mango+"\t"+mango.getPrice());
        }
    }
    public static void main(String[] args) {
        UsingEnums usingEnums = new UsingEnums();
        //usingEnums.checkMango();
        usingEnums.iteratingEnum();
    }
}
