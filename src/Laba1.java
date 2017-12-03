import java.util.Random;

public class Laba1 {
    public static void main( String[] args){

        Random rnd = new Random();
        final int k = 20;
        int [] [] a = new int[k ] [k];
        int [] min = new int[k];
        for (int i=0;i<k;i++)
        {
            min [i]=101;
            for (int j=0;j<k;j++)
            {
                a[i][j]=rnd.nextInt(100)+1;
                System.out.print(a[i][j]+ " ");
                if (min[i]>a[i][j]) min[i]=a[i][j];

            }
            System.out.println();
        }
        System.out.println("Result:");
        for (int i=0;i<k;i++ ){
            System.out.println(min[i]);
        }

    }
}
