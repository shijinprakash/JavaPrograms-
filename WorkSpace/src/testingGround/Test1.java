package testingGround;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40};
		int sumEven = 0;
		int sumOdd = 0;
		for(int i = 0; i<arr.length; i++) {
			if(i%2==0) {
				sumEven = 0 + arr[i];
			}
			else {
				sumOdd = 0 + arr[i];
			}
		}
		if(sumEven>sumOdd) {
			System.out.println(sumEven);
		}
		else {
			System.out.println(sumOdd);
		}
		//System.out.println("hi");
	}

}
