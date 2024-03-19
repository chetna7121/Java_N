package java1st.src0313.inhertiance;

import java1st.src0313.inhertiance.interfaces.TotalAnuallFeesOrPayment;

public class GrandFather /*implements Lawyer*/ implements TotalAnuallFeesOrPayment {
    private int payment;
    private int totalITR = 0;

    protected void house() {
        System.out.println("this is GrandFather's house");
    }

    protected void vintageCars() {
        System.out.println("Vintage cars of Grand Father");
    }

    private void locker() {
        System.out.println("No body can use it");
    }

    private void bonds() {
        System.out.println("No body can use bonds either");
    }

    @Override
    public int lawyerFees(int payment) {
       // this.payment = payment;
        this.payment=this.payment+payment;
        return this.payment;
    }

    @Override
    public int schoolFees(int payment) {
        //this.payment = payment;
        this.payment=this.payment+payment;
        return this.payment;
    }

    @Override
    public int maidFees(int payment) {
        //this.payment = payment;
        this.payment=this.payment+payment;
        return this.payment;
    }

    public int calculateITR() {
        totalITR = this.payment;
        return totalITR;
    }
}
