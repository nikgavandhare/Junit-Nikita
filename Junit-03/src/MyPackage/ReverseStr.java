package MyPackage;


public class ReverseStr {

	public String Reversestring(String str) 
	{
		char[] arr= str.toCharArray();
		int left=0;					// left and right are indicate the index of array
		int right= str.length() - 1;
		
		while(left<right)
		{
			// using 3 varible swaping
			char temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
		
			left++;
			right--;
		}		
		
		return new String(arr);
	}

}


