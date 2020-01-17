package geekbrains.lesson_2;

public class Task4 {
/*
4. Создать квадратный двумерный целочисленный массив
(количество строк и столбцов одинаковое), и с помощью цикла(-ов)
заполнить его диагональные элементы единицами;
 */
    public static void main(String[] args) {
    	int n = 10;
    	int[][] arr = fullArr(n);
        // для отладки
        check(arr);
    }
    public static void check(int[][] arr){
    	// Ну не знаю, мне кажется обычных for с массивом удобнее, не нужно вводить индексы. Определение индексов только у listArray
    		for (int[] row: arr){
    		int index=0;
    		for(int value: row){	
    			if (index==row.length-1){
    				System.out.println(value);
    			} else {
    				System.out.print(value);
    			}
    			index++;
    		}
    	}
    }
    public static int fullArr(int n)[][]{
        int[][] arr = new int[n][n];
        for(int i=0,j=0; i<arr.length; i++,j++)
        	arr[i][j] = 1;
        return arr;
    }
}
