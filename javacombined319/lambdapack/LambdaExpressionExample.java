package javacombined319.lambdapack;

interface MyName {
    //    default void sayMyName(){
//        System.out.println("Every human has a name");
//    }
    //   void sayMyName();
    void sayYourName(String yourName);
}

interface Calculation {
    int add(int val1, int val2);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        //anonymous inner class
//      MyName name = new MyName(){
//          public void sayMyName(){
//              System.out.println("Hello Rahul");
//          }
//      };
//      name.sayMyName();

        //Lambda expression - here we will use abstract method rather than default one
        MyName name1 = (yourName) -> {
            System.out.println("Hello " + yourName);
        };
        name1.sayYourName("Bhuvan");

        //lambda with mulitple parameters
        Calculation calculation = (val1, val2) -> {
            return val1 + val2;
        };
        System.out.println("result is " + calculation.add(100, 23));
    }
}
