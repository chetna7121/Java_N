package java2nd.src0315.innerclasses;
interface Color{
    void paintColor();
}
public class AnonymousInnerClass/* implements  color */{
//
//    @Override
//    public void paintColor() {
//
//    }
public static void main(String[] args) {
    //anonymous class
    Color color = new Color() {
        @Override
        public void paintColor() {
            System.out.println("This is green color");
        }
    };
    color.paintColor();
}
}
