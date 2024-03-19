package java1st.src0313.inhertiance;

public class Son extends Father{
    void whatSonCanUseFromHisFather()
    {
        Father father= new Father();
        father.fatherCars();
        father.whatICanUseFromMyFather();
    }
}
