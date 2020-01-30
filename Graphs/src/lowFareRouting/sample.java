package lowFareRouting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class sample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner((Readable) new BufferedReader(new FileReader("distance.txt")));
	      int rows = 29;
	      int columns = 29;
	      int [][] myArray = new int[rows][columns];
	      while(sc.hasNextLine()) {
	         for (int i=0; i<myArray.length; i++) {
	            String[] line = sc.nextLine().trim().split("  ");
	            for (int j=0; j<line.length; j++) {
	               myArray[i][j] = Integer.parseInt(line[j]);
	            }
	         }
	      }
	      System.out.println(Arrays.deepToString(myArray));
	}
}