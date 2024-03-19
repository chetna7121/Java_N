package java2nd.three16.inhertiance;

public class Human extends AbstractClassGeneralUse
implements Medicine
{
    @Override
    void food() {
        System.out.println("Everyone mandatory is going to have food !");
    }

    @Override
    public void allopathy() {
        System.out.println("We prefer this ");
    }

    @Override
    public void homeopathy() {
        System.out.println("working a little show");
    }

    @Override
    public void ayurvedic() {
        System.out.println("its from super ancestors area !");
    }
}
