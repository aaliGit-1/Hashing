//Q2:Arranging the set of cards in order to obtain smallest number 
//from the drawn card
public class ArrangeCards {
	public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=4510;
        int output=0;
        int countDig=0;
        int hashArr[]=new int[10];
        while(input!=0){
            int rem=input%10;
            hashArr[rem]+=1;
            input=input/10;
            countDig++;
        }
        //print HashArr
        //printArr(hashArr);
        for(int i=0;i<hashArr.length;i++){
            if(i!=0&&hashArr[i]==1){
            	//handling zero as it can'tcome at the first lace
                if(hashArr[0]==1){
                    output+=Math.pow(10,countDig-1)*i;
                    //insert the number 0 to the second place in order to obtain smallest number
                    output+=Math.pow(10,countDig-2)*0;
                    countDig-=2;
                    hashArr[0]=0;
                }
                else{
                    output+=Math.pow(10,countDig-1)*i;
                    countDig--;
                }
            }
        }
        System.out.println("output:"+output);
	}

}
