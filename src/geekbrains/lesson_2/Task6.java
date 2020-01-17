package geekbrains.lesson_2;

public class Task6 {
		/*
6. ** Написать метод, в который передается не пустой одномерный
целочисленный массив, метод должен вернуть true,
если в массиве есть место, в котором сумма левой и правой части массива равны.
Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
 */
private static final int minValue = 0;
private static final double maxValue = 10;
    public static void main(String[] args) {
 	int n = 10;
 	int[] arr = fullArr(n);
		System.out.println();
 		System.out.println(checkBalance(arr));	// масивы для отладки
	 	int[] arr1 = {4,5};
	 	System.out.println(checkBalance(arr1));
	 	int[] arr2 = {1,10,7};
	 	System.out.println(checkBalance(arr2)); 
	 	int[] arr3 = {1,2,0,3};
	 	System.out.println(checkBalance(arr3));
	  }
	  
    private static boolean checkBalance(int[] arr) {
    	for(int i=0;i<arr.length;i++){
    		if (i!=arr.length)
    			if(sumPartArr(arr,0,i) == sumPartArr(arr,i+1,arr.length))
					return true;
    	}
    	return false;
	}
	public static int fullArr(int n)[]{
    	int[] arr = new int[n];
    	for(int i=0;i< arr.length;i++){
    		arr[i] = randomArr();
    		System.out.print(arr[i]);
    	}
    	
    	return arr;
    }
	private static int randomArr() {	
		return  minValue + (int) (Math.random() * maxValue) ;
	}  
	private static int sumPartArr(int[] arr,int start, int finish) {
		int sum=0;
		for(int i=start;i<finish;i++)
			sum =+arr[i];
		return sum;
	}
}
