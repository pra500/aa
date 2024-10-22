package pac1;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="pragti";
		
		
	char[] arr=	str.toCharArray();
	
	
	char c;
	
	c=arr[0];
	
	arr[0]=arr[arr.length-1];
	
	arr[arr.length-1]=c;
	
	System.out.println(arr);
	
	
	
	//iragtp

	
	}

}
