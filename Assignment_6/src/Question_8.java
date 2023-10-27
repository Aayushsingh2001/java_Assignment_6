/*     1
*      23
*      456
*      78910      */
public class Question_8 {
    public static void main(String[]args){
        int i,j,k=1;
        for (i=1;i<=4;i++)
        {
            for (j=1;j<=4;j++)
            {
                if (i>=j)
                    System.out.print(k++);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
