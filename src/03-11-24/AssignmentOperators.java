
class AssignmentOperators {
    public static void main(String[] args) {
        System.out.println("check");
        //110
        System.out.println("" + (20 + 20));
        // string + anything = string

        //it checks whether the object belongs to the same class
        Object object = new Object();
        object = null;
        System.out.println(object instanceof Object);

        // object / instance
        Object object1; // this is just an object
        object1 = new Object(); // instance

        int val = 10; // simple
        int val1 = +10; //val1 = val1+10; //complex

        //postfix and prefix + -
        //5 ---- 5
//int a = 5;
//a = a++;
//a =--a;
//        System.out.println(a);

        //ternary operator - ? :

        String result = (10 > 2) ? "True" : "False";
        System.out.println((10 > 2) ? "True" : "False");

        //Shifting
        System.out.println(12>>1);
        System.out.println(12<<1);
        System.out.println(12>>>1);


    }
}