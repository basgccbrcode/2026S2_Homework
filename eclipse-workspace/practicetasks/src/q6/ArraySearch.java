package q6;

public class ArraySearch {

	public static int arraySearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// array
		
		int[] arr = {5, 10, 15, 20, 25};
		
	
		System.out.printf("Expected %2s, Got %d\n", 10, arraySearch(arr, 10));
		}
}
