import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] str;
        //,str1[1000];

        int i,j,k,l,n,m,count,count1=0,T;

        T = scan.nextInt();

        while(T-- > 0)

        {

            l = scan.nextInt();

            count1=0;

            for(i=0;i<l;i++)

            {

                str = scan.next().toCharArray();

                k = str.length;

                for(n=0,count=0;n<k;n++)

                {

                    j = (int)(str[n]-64);

                    count = count+j-1+n+i;



                }

                count1 = count1 + count;





            }

            System.out.printf("%d\n",count1);

        }
    }
}
