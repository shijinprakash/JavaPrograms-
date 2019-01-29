package testingGround;

/*
 * Question 1 : 
 */

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 100;
		int[] arr = new int[size];
		int start = 1;
		for(int i = 0; i < size; i++) {
			arr[i] = start++;
		}
		
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		
		
		int flag = 0;
	    for(int i =0; i<size; i++){
	        if((arr[i]>=1 && arr[i]<=9) || (arr[i] >= 11 && arr[i] <= 19) || (arr[i] >= 22 && arr[i] <= 29) || (arr[i] >= 33 && arr[i] <= 39|| (arr[i] >= 44 && arr[i] <= 49) || (arr[i] >= 55 && arr[i] <= 59) || (arr[i] >= 66 && arr[i] <= 69) || (arr[i] >= 77 && arr[i] <= 79) || (arr[i] >= 88 && arr[i] <= 89) || (arr[i] >= 99 && arr[i] <= 99))){
	            flag++;
	        }
	    }
	    
	    System.out.println(flag);
		
	}

}
