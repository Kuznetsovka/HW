package geekbrains.lesson_2;

public class Task7 {
private static final int minValue = 0;
private static final double maxValue = 10;
private static final int lengthArr = 8;
	/*
7. **** Написать метод, которому на вход подается одномерный массив и число n
(может быть положительным, или отрицательным), при этом метод должен
сместить все элементымассива на n позиций.
Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 */
    public static void main(String[] args) {
    	int[] arr =fullArr(lengthArr);
    //	int n = (int) (-10 + Math.random()*10);
  int  n = 3;
    	System.out.println("Смещение на " + n + " элементов");		
    	change(arr,n);
    }
    private static void change(int[] arr, int n) {
    	// Мы из ... мы можем сдвинуть горы ;-)
   //двинуть горы ;-)

//    	int i=0;

//    	int x;

//    	int count = 0;

//    	int NewI;

//    	if(isMirror(n)==false || n!=1){

//    		while (count<arr.length){

//    			count++;

//    			NewI = NewIndex(i,n);

//    			x = arr[NewI];

//   	 		arr[NewI] = (i==0)?arr[0]:x;

//  	  		i = NewI;

//    		}

//    	} else {

//    		for (int j = 0; j<cycle(n);j++)

//    			while (count%cycle(n)==0){

//    				count++;

//    				NewI = NewIndex(i+j,n);

//    				arr[NewI+j] = arr[i+j];

// 
    	// для отладки
    	int[] newArr;
    	int newI;
//    	newArr = writeArr(arr,n);
    	
    	for (int i=0; i<lengthArr;i++){
  
    		newI = NewIndex(i,n);

    	}	
    }
//	private static int[] writeArr(int[] arr, int n) {
//		int[] newArr = new int[lengthArr];
//		for (i=0; i<arr.length;i++){
//
//
//		}
		

	private static int cycle(int n) {
		return lengthArr%n;
	}
	private static boolean isMirror(int n) {
		if (lengthArr%n==0)
			return true;
		else
			return false;
	}

	private static int NewIndex(int i, int n) {
		if ((i+n) >lengthArr && (i+n)<0){
			return Math.abs(lengthArr-(i+n));
		}else{
			return i+n;
		}
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
}

