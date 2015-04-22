package test;

public class Test {

	public static void main (String [] args){
	int [] array = {10, 15, 16, 54, 34, 76, 12, 9, 5, 44 };
	
	int size = 10;
	System.out.println("array before sort");
	for (int i=0; i<array.length; i++){
		System.out.print(array[i] + " ,");
	}
	System.out.println();
	for (int a=1; a<size; a++){
		System.out.println("a"+a);
		for (int b=size-1; b>=a; b--){
			System.out.println("b"+b);
			if (array[b-1] > array[b]){
				int c = array[b-1];
				array[b-1] = array[b];
				array[b]=c;
			}
		}
	}
	System.out.println("array after sort");
	for (int i=0; i<array.length; i++){
		System.out.print(array[i]+ " ,");
	}
	
	}
	
}
