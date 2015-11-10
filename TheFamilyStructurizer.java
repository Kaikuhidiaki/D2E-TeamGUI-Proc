import java.util.Scanner;
import java.io.File;
public class TheFamilyStructurizer
{
	public static void main(String[] args)
	{
		try {
			Scanner sc = new Scanner(new File("navne.txt")); // File is read.
				while (sc.hasNextLine()) { // Loop runs as long as there is lines left.
					String line = sc.nextLine(); 
					String names[] = line.split(" ");
					String initial = names[0].substring(0,1);
        			System.out.println(initial + ". " + names[1]);
        		}
		} catch (Exception notfound){

		}
	
	}

}