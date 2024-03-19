package java1st.src0313.inhertiance;

public class Main {
    public static void main(String[] args) {
//        Father father = new Father();
//        father.whatICanUseFromMyFather();
//        Son son = new Son();
//        son.whatSonCanUseFromHisFather();
//        son.fatherCars();
//        BusinessStuff businessStuff = new BusinessStuff();
//        businessStuff.takingCareOfHotel();
        //Upcasting and downcasting
//        GrandFather grandFather = new Father(); //upcasting
//        grandFather.house(); // VMI - Virtual method Invocation - calling is from derived class but method should present in base class
////        System.out.println("Lawyer fees paid "+grandFather.lawyerFees(4000000));
//        grandFather.lawyerFees(40000);
//        grandFather.schoolFees(20000);
//        grandFather.maidFees(20000);
//        System.out.println("Total expense show in ITR = " + grandFather.calculateITR());
        try {
            Father father1 = new Father();
            //downcasting
        //    father1.fatherCars();
            father1.checkingAccountMoney();
        }
        catch (Exception e)
        {
            System.out.println("in Main Class "+e);
        }
    }
}
