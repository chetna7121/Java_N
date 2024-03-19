package java1st.srcpack314;

//static polymorphism - method overloading
public class StaticPolymorphism {
//method signature
    /*
    1) Number of parameters
    2)Type of parameters
    3) Sequence of parameters
     */
    public void calculate()
    {
        System.out.println("calculate method");
    }
    public void calculate(int val1 , int val2)
    {
        System.out.println("result is -> "+(val1+val2));
    }
    public void calculate(float fVal1,float fVal2)
    {
        System.out.println("result is -> "+(fVal1+fVal2));
    }
    public void calculate(int iVal1,float fVal2)
    {
        System.out.println("result is -> "+(iVal1+fVal2));
    }
    public void calculate(float fVal1,int iVal2)
    {
        System.out.println("result is -> "+(fVal1+iVal2));
    }
    public void calculate(int iVal1,int iVal2,int iVal3)
    {
        System.out.println("result is -> "+(iVal1+iVal2+iVal3));
    }
    public static void main(String[] args) {
        StaticPolymorphism staticPolymorphism = new StaticPolymorphism();
        staticPolymorphism.calculate();
        staticPolymorphism.calculate(20,20);
        staticPolymorphism.calculate(30,45F);
        staticPolymorphism.calculate(12.3F,34.5F);
        staticPolymorphism.calculate(23.4F,600);
        staticPolymorphism.calculate(12,34,45);
    }
}
