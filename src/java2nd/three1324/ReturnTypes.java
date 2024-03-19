package java2nd.three1324;

public class ReturnTypes {
    void show()
    {
        System.out.println("this is show method");
    }

    int addition()
    {
        return 10+10;
    }
    Integer addition1()
    {
        return 10+10;
    }

    //Mango is a type and it is an array , so this function will
    //return multiple values in one go
    Mango[] getMangoValues()
    {
        return Mango.values();
    }
    void checkingReturn()
    {
        //a method which returns can return either into sop or
        //can assign value into a varaible
        System.out.println(addition()); //20
        int result = addition();
        System.out.println("result is "+result);
        System.out.println(addition1());
        result = addition1();
        System.out.println(getMangoValues());
        for(Mango mango:getMangoValues())
        {
            System.out.println(mango+"\t"+mango.getPrice());
        }
    }

    public static void main(String[] args) {
        ReturnTypes returnTypes = new ReturnTypes();
        returnTypes.checkingReturn();
    }
}
