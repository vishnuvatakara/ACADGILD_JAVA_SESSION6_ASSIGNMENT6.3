package samples;

import java.util.Scanner;

public class Search{
	int item,size,i;
	int[] array=new int[50];//array initialization
	public void intialization() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");//reading array size
		size=sc.nextInt();
		System.out.println("enter the elements");
		for(i=0;i<size;i++)
		{
			array[i]=sc.nextInt(); //reading array elements
		}
		System.out.println("enter the item to search");//reading serach element
		item=sc.nextInt();
	}
	public void binarySearch()
	{
		int mid,low,high;//initializing search parameters
		low=0;
		high=size-1;
		int flag=0;
		while(flag==0)
		{
			mid=(high+low)/2;
			//process binary search
			if(array[mid]==item)
			{
				System.out.println("item found at position :"+mid);
				flag=1;
			}
			else if(item<array[mid])
			{
				high=mid-1;
			}
			else if(item>array[mid])
			{
				low=mid+1;
			}
			if(low>high)
			{
				flag=1;
				System.out.println("item not found in array");
			}
		}
	}
	public static void main(String args[])
	{
		Search obj=new Search();
		obj.intialization();
		obj.binarySearch();
		
	}

}
