import java.util.Arrays;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][];
		System.out.println("Enter elements of array:");
		Scanner scan=new Scanner(System.in);
		arr[0]=new int[4];
		arr[1]=new int[2];
		arr[2]=new int[5];
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
