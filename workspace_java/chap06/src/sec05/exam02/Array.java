package sec05.exam02;

public class Array {

	final int length;
	int[] arr;
	
	Array(int length){
		this.length = length;
		arr = new int[length]; 
	}
	
	int get(int index) {
		return arr[index];
	}
}
