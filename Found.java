import java.io.*;
import java.util.*;

class Found
{
    public static void main(String[] args)
  { 
     int k,i ,count=0,l=0;
     int[] a={10,30,3,5,7};
     Scanner Sc=new Scanner(System.in);
     System.out.println("enter the value of k");
     k=Sc.nextInt();
    
      for(i=1;i<5;i++)
  {
      if (a[i]==k)
        {
       count= count+1;
        l=i+1;

  }
}
        if (count==0){

        System.out.println("-1");
     }

       else{
System.out.println(+l);
}

        
   

  }
}

