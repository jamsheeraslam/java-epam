import java.io.*;
import java.util.*;
public class Max
{
public static void main(String[] args)
   {
      int max=0,min=0,i;
       int[] a={10,29,8,90,7};
       max=a[0];
       min=a[0];
      for(i=0;i<5;i++)
    {
          if(a[i]>max)
        {
            max=a[i];
        }
}
          for(i=0;i<5;i++)
    {
          if(a[i]<min)
        {
            min=a[i];
        }
}
    }
System.out.println("max"+max);
System.out.println("min"+min);
}
}
       


       


       
