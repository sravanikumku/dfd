import java.util.*;

class abstract1 
{
    static boolean check(int N)
{
    int digit = N % 10;
 
    while (N != 0)
    {
 
        // Find the current last digit
        int current_digit = N % 10;
 
        // Update the value of N
        N = N / 10;
 
        // If there exists any distinct
        // digit, then return No
        if (current_digit != digit)
        {
            return false;
        }
    }
    return true;
 
}
   public static void main(String args[])
   {
    int []a=new int[5];
    int []b=new int[5];
    
    
    int i;
    int st=0,ust=Integer.MAX_VALUE;
    Scanner sc=new Scanner(System.in);
    for(i=0;i<5;i++)
    {
       a[i]=sc.nextInt();
       b[i]=a[i];
    }
   
    int [][]d=new int[5][10];
    for(i=0;i<5;i++)
    {
        for(int j=0;j<10;j++)
        {
            d[i][j]=0;
        }
    }
    for(i=0;i<5;i++)
    {  while(a[i]!=0)
        {
        d[i][a[i]%10]=d[i][a[i]%10]+1;
        a[i]=a[i]/10;
        }
    }
    int num1=0;
    
    for(i=0;i<5;i++)
    {
        num1=0;
        for(int j=0;j<10;j++)
        {
             if(d[i][j]!=0)
             {
                num1=num1*10+d[i][j];
                System.out.println(num1);

             }
          
        }
        System.out.println(num1);
        if(check(num1))
        {
             continue;
        }
        else
        {
            st=Math.max(st,b[i]);
            ust=Math.min(ust,b[i]);
        }
    }
    System.out.println(st);
    System.out.println(ust);
    System.out.println(st+ust);

   }
   

}