package java1st.scrpack316.innerclasses;

interface Calculate {
    int add(int val1, int val2);
}

public class AnonymousInnerClass /*implements Calculate*/ {
    //    @Override
//    public int add(int val1, int val2) {
//        return 0;
//    }
    public static void main(String[] args) {
        //anonymous inner class
        Calculate calculate = new Calculate() { //()=>{};
            @Override
            public int add(int val1, int val2) {
                return val1 + val2;
            }
        };
        System.out.println("result of addition is " + calculate.add(10, 20));
    }
}
