//Character Hashing using arrays
//How many times an alphabet(small letters) occurs in an array? 
import java.util.Scanner;
public class charHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="abracaDABRA";
        Scanner sc=new Scanner(System.in);
        s=s.toLowerCase();
        //System.out.println("LowerCase: ");
        System.out.println("s:"+s);
        System.out.println("Number of queries to send:");
        int q=sc.nextInt();
        //declare a hash array of size 26(lowercase alphabet only) 
        int hash[]=new int[26];
        //pre-storing in hash array 
        for(int i=0;i<s.length();i++) {
        	//at i=0,index='a'-'a'(97-97=0) ASCII value of a is 97
        	int index=s.charAt(i)-'a';
        	hash[index]+=1;
        }
        //fetching from hash array
        System.out.println("Alphabets you want to check are");
        for(int j=0;j<q;j++) {
        	char c=sc.next().charAt(0);
        	System.out.println(c+" appears "+hash[c-'a']+" times.");
        	if(j!=q-1)
        		System.out.println("Enter next alphabet:");
        	else
        		System.out.println("That's it!");
        }
        /*if you want to perform character hashing with all the alphabets then
          size of hash array becomes 256(as 256 characters are there in ASCII
          index=s.charAt(i) and in fetching section hash[c] will be there*/
	}

}
