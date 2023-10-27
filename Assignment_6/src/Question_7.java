/*   ABCDE
*     ABCD
*      ABC
*       AB
*        A    */
public class Question_7 {
    public static void main(String[]args){
        int i,j;
        char k;
        for (i=1;i<=5;i++)
        {
            for (j=1,k=65;j<=5;j++)
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
