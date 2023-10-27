/*      1
        12
        123
        1234
        12345      */
public class Question_5 {
    public static void main(String[]args){
        int i,j,k;
        for (i=1;i<=5;i++)
        {
            for (j=1,k=1;j<=5;j++)
            {
                if (j<=i)
                    System.out.print(k++);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
