package java2nd.three1324;

public enum Mango {
    //predefined list , Objects,they can perform the role of constructor
    Carrie(200), Fairchild(890), Haiden(560);
    int price;
    Mango(int price) {
        this.price = price;
    }
    int getPrice() {
        return this.price;
    }
}
