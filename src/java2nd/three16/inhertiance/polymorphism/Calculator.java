package java2nd.three16.inhertiance.polymorphism;

public class Calculator {
    int calculate() {
        System.out.println("no paramter in method");
        return 10 + 20;
    }

    int calculate(int val1, int val2) {
        return val1 * val2;
    }

    int calculate(float fVal1, int iVal2) {
        return (int) fVal1 + iVal2;
    }

    int calculate(int iVal1, float fVal2) {
        return iVal1 + (int) fVal2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(
                calculator.calculate(100F, 90));
    }
}
