//Number Hashing using Arrays
//How many times a number occurs in an array 
import java.util.Scanner;
public class NumHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numArr[]= {1,2,4,1,2};
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of queries to send:");
        int q=sc.nextInt();
        //declare a hash array of size 10
        int hash[]=new int[10];
        //putting values in hash array according to the numArr[]
        //pre-storing
        for(int i=0;i<numArr.length;i++) {
        	hash[numArr[i]]+=1;
        }
        System.out.println("Number you want to check:");
        //fetching from hash array
        for(int j=0;j<q;j++) {
        	int num=sc.nextInt();
        	System.out.println(num+" appears "+hash[num]+" times.");
        	if(j!=q-1)
        		System.out.println("Enter next number:");
        	else
        		System.out.println("That's it!");
        }
	}

}
