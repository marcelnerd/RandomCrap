import java.util.Random;

public class Main {
	
	static int[] array = {1, 4, 8, 5, 3, 5, 7, 9, 2, 6, 0, 7, 1, 6, 4, 2, 7, 3, 7};
	
	public static void main(String args[]) {
	    try {
	        while(!(isSorted(array))) {
	            sort(array);
	            printArray(array);
	        }
	    }
	   catch(ArrayIndexOutOfBoundsException e) {
	   }
	    
	}
	
	static boolean isSorted(int[] a) {
	    for(int i = 0; i < a.length; i++) {
	        if(a[i]>a[i+1]) {
	            return false;
	        }
	    }
	    return true;
	}
	
	static void sort(int[] a) {
	    Random rand = new Random();
	    
	    for(int i = 0; i < a.length; i++) {
	        swap(a, rand.nextInt(a.length), rand.nextInt(a.length));
	    }
	}
	
	static void swap(int[] a, int l, int b) {
	    int tmp;
	    tmp = a[l];
	    a[l] = a[b];
	    a[b] = tmp;
	}
	
	static void printArray(int[] a) {
	    for(int i = 0; i < a.length; i++) {
	        System.out.print(a[i]);
	    }
	    System.out.println();
	}
}
