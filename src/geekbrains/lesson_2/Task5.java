package geekbrains.lesson_2;

public class Task5 {
	private static final int minValue = 0;
	private static final int maxValue = 100;
	/*
5. ** Задать одномерный массив и найти в нем минимальный и
максимальный элементы (без помощи интернета);
 */
    public static void main(String[] args) {
    	//
    	
    	int n = 10;
    	int min=maxValue;
    	int max=minValue;
    	int[] arr = fullArr(n);
    	for(int value: arr){
    		min = (value<min) ? value:min;
    		max = (value>max) ? value: max;
    	}
    	System.out.println( "Maximum =" + max);
    	System.out.println( "Minimum =" + min);
    }
    
    public static int fullArr(int n)[]{
    	int[] arr = new int[n];
    	for(int i=0;i< arr.length;i++){
    		arr[i] = randomArr();
    		System.out.println(arr[i]);
    	}
    	
    	return arr;
    }
	private static int randomArr() {	
		return  minValue + (int) (Math.random() * maxValue) ;
	}  
}
