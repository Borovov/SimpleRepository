import java.util.Random;

public class Algoritm {
	
	public static void main(String[] args) {
		
		Random rand = new Random(100);
		int mass[][] = new int[10][10];
				
		for (int i = 0; i < mass.length; i++) {
			int max = 0;
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = rand.nextInt(10);
				System.out.print(mass[i][j] + " ");
				
				if (mass[i][j] > max) {
					max = mass[i][j];
				}				
			}
			System.out.print("  (" + max + ")");
			System.out.println();
		}
		
	}
}
