package java1st.srcpack312;

public enum Mango {
    Carrie(150), FairChild(100), Haiden(140);
    int price;
    Mango(int price) {
        this.price = price;
    }
    int getPrice() {
        return this.price;
    }
}
