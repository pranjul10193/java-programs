import java.util.*;
class Palindrome{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=s.nextInt();
        int x,p=0;
        int mun=num;
        while(mun!=0)
        {
        	mun=mun/10;
        	p++;
        }
        x=p;
        int arr[]=new int[x];
        int arr2[]=new int[x];
        int i=0,count=0;
        while(num!=0)
        {
            arr[i]=num%10;
            num=num/10;
            i++;

        }

        for(int j=0;j<i;j++)
        {
            arr2[j]=arr[i-j-1];
        }
        for(int k=0;k<i;k++)
        {
        	if(arr[k]==arr2[k]){
        		count++;
        		if(count==i){
        			System.out.println("number is a palindrome");
        		}
        	}
        	else{
        		System.out.println("number is not a palindrome");
        		break;
        	}
        }
	}
}