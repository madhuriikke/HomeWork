
public class Marge_TwoString {
	public static String merge(String leftStr, String rightStr) {  
        char[]left = leftStr.toCharArray();
        char[]right = rightStr.toCharArray();
        int al = left.length;
        int br= right.length;
        char[] mergeArr= new char[al+br];
        int i=0,j=0,k=0;
        int temp =0;
        while(i<al && j<br){

            if (temp==0){
                mergeArr[k]=left[i];
                i++;
                temp =1;
            }else{
                mergeArr[k]=right[j];
                j++;
                temp=0;
            }
            k++;            
        }
        while(i<al){

            mergeArr[k]=left[i]; k++; i++;
        }
        while(j<br){

            mergeArr[k]=right[j]; k++; j++;
        }


        return new String(mergeArr);

    }


	public static void main(String[] args) {
		
			String s1= "abc";
			String s2 ="pqrmno";
	System.out.println("String: "+ merge(s1,s2));
	
	}
}
	
	
	

