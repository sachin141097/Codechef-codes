import java.util.*;
import java.io.*;

public class PRICECON {

	public static void main(String[] args) throws java.lang.Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			String s=br.readLine();
			String []strarray=s.split("\\s+");
			int N=Integer.parseInt(strarray[0]);
			int K=Integer.parseInt(strarray[1]);
			int arr[]=new int[N];
			String array_read=br.readLine();
			String []a=array_read.split("\\s+");
			int sum=0;
			for(int i=0;i<N;i++)
			{
				arr[i]=Integer.parseInt(a[i]);
				sum+=arr[i];
			}
			int revenue_lost=0;
			for(int i=0;i<N;i++)
			{
				if(arr[i]>K)
				{
					revenue_lost+=(arr[i]-K);
				}
			}
			System.out.println(revenue_lost);
		}

	}

}
