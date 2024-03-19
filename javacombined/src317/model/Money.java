package javacombined.src317.model;

public class Money {
    int amount;
    String currencyCode;

    public Money() {
    }

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("its overridden equals method");
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Money))
            return false;
        Money money1 = (Money) obj;
        boolean currencyCodeEquals =
                ((this.currencyCode == null && money1.currencyCode == null)
                        ||
                        (this.currencyCode != null &&
                                this.currencyCode.equals(money1.currencyCode)));
        return this.amount == money1.amount && currencyCodeEquals;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currencyCode='" + currencyCode + '\'' +
                '}';
    }

}
