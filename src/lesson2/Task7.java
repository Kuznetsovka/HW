package lesson2;

import java.util.Scanner;

public class Task7 {
private static final int minValue = 0;
private static final double maxValue = 10;
private static int lengthArr;
private static int n;

/*
7. **** Написать метод, которому на вход подается одномерный массив и число n
(может быть положительным, или отрицательным), при этом метод должен
сместить все элементымассива на n позиций.
Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 */
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        lengthArr = sc.nextInt();
        int[] arr = fullArr(lengthArr);
		System.out.println();
		System.out.println("Введите смещение");
    	n = sc.nextInt();
    	System.out.println("Смещение на " + n + " элементов");
    	change(arr,n);
    }

    private static void change(int[] arr, int n) {
//    	 С использованием 2-го массива все просто
    	int x;
    	int count = 0;
    	int newI;
    	int i=0;
		if (n!=0) {
			//смещение массива не приводит к зацикливанию
			if (!isMirror(n) || n == 1) {
				while (count < arr.length) {
					count++;
					newI = NewIndex(i, n);
					x = arr[newI];
					arr[newI] = arr[0];
					arr[0] = x;
					i = newI;
				}
			} else {
				//смещение массива приводит к зацикливанию
				if (n>0){
				    shiftPositive(arr);
                } else {
				    shiftNegative(arr);
                }
			}
		}
        for (int value: arr)
            System.out.print(value);
    }

    private static int shiftPositive(int[] arr)[]{
        int cycle = Math.abs(lengthArr / n);
        int count=0;
        for (int j = 0; j < n; j++) {
            int forLoad=arr[j];
            int i=j;
            do{
                count++;
                int newI = NewIndex(i, n);
                int forSave = arr[newI];
                arr[newI] = forLoad;
                forLoad = forSave;
                i = newI;
            } while ((count)%cycle!=0);
        }
        return arr;
    }

    private static int shiftNegative(int[] arr)[]{
        int cycle = Math.abs(lengthArr / n);
        int count=0;
        for (int j = 0; j > n; j--) {
            int forLoad=arr[j];
            int i=j;
            do{
                count++;
                int newI = NewIndex(i, n);
                int forSave = arr[newI];
                arr[newI] = forLoad;
                forLoad = forSave;
                i = newI;
            } while ((count)%cycle!=0);
        }
        return arr;
    }


	private static boolean isMirror(int n) {
		if (lengthArr%n==0)
			return true;
		else
			return false;
	}

	private static int NewIndex(int i, int n) {
		if ((i+n) >lengthArr-1 || (i+n)<0){
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
	private static int randomArr(){
		return  minValue + (int) (Math.random() * maxValue) ;
	}
}
