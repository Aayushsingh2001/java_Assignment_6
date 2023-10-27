/*       ABCDE
*         BCDE
*          CDE
*           DE
*            E        */
public class Question_9 {
    public static void main(String[]args){
        int i,j;
        for (i=1;i<=5;i++)
        {
            char k=64;
            k=(char)(k+i);
            for (j=1;j<=5;j++)
            {
                if (i<=j)
                    System.out.print(k++);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
