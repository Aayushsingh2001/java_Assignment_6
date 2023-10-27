/*        1
          21
          321
          4321       */
public class Question_6 {
    public static void main(String[]args){
        int i,j,k;
        for (i=1,k=1;i<=4;i++)
        {
            k=i;
            for (j=1;j<=4;j++)
            {
                if (j<=i)
                    System.out.print(k--);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
