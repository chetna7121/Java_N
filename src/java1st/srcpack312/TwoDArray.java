package java1st.srcpack312;

public class TwoDArray {
    void twoDArraySet()
    {
        int stuMarks[][]= new int[3][3];
        stuMarks[0][0]=101;
        stuMarks[0][1]=0;
        stuMarks[0][2]=93;
        stuMarks[1][2]=250;
//        System.out.println(stuMarks[1][2]);
        //row
        for (int i =0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(stuMarks[i][j]+"\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        TwoDArray twoDArray = new TwoDArray();
        twoDArray.twoDArraySet();
    }
}
