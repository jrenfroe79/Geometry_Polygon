package sdev;
import java.util.Scanner;
public class Identical_Arrays {
	public static void main(String[] args) {
        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];
        
        
        System.out.println("Enter the elements of the first 3x3 array:");
        fillArray(array1);
        
       
        System.out.println("Enter the elements of the second 3x3 array:");
        fillArray(array2);
        
       
        if (equals(array1, array2)) {
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays are not identical.");
        }
    }
    
    public static void fillArray(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }
        
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}

