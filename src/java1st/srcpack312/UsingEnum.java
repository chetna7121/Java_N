package java1st.srcpack312;

public class UsingEnum {
    void checkFruits()
    {
        System.out.println(Mango.Carrie+"\t"+
                Mango.Carrie.ordinal());
        for(Mango mango:Mango.values())
        {
            System.out.println(mango+"\t"+mango.getPrice());
        }
    }
    public static void main(String[] args) {
        UsingEnum usingEnum = new UsingEnum();
        usingEnum.checkFruits();
        Mango mango;

    }
}
