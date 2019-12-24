import java.io.*;
public class Sum
{ 
public static void main(String 	args[])
  {
   int i,sum=0,n;
    float avg;
   int[] a={10,20,32,29,20};
   
     for(i=0;i<5;i++)
        {
          sum=sum+a[i];
        }
  System.out.println("sum"+sum);
       avg=sum/5;
   System.out.println("avg"+avg);
   }
}

