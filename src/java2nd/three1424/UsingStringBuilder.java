package java2nd.three1424;

public class UsingStringBuilder {
    void usingStringBuilder(){
        StringBuilder stringBuilder = new StringBuilder("Hello ");
        System.out.println(stringBuilder);
        stringBuilder.append(" team India !");
        System.out.println(stringBuilder);
        String name = "Rahul";
        System.out.println(name.concat(" Sharma"));
        System.out.println(name);
        stringBuilder.delete(6,11);
        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        UsingStringBuilder usingStringBuilder = new UsingStringBuilder();
        usingStringBuilder.usingStringBuilder();
    }
}
