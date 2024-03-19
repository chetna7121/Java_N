package java1st.src0313.inhertiance;

import java1st.src315.UsingThrowThrows;

public class Father extends GrandFather {

    protected void whatICanUseFromMyFather() {
        GrandFather grandFather = new GrandFather();
     //   grandFather.house();
        grandFather.vintageCars();
    }

    void checkingAccountMoney(){
        UsingThrowThrows usingThrowThrows = new UsingThrowThrows();
        try {
            usingThrowThrows.takingCredentials();
        }
        catch (Exception e)
        {
            System.out.println("In Father class "+ e);
            throw  e;
        }
    }

    protected void house() {
        System.out.println("Father is making some changes into GF's house");
    }

    protected void fatherCars() {
        System.out.println("Volvo X90 , Kushaq");
    }
}
