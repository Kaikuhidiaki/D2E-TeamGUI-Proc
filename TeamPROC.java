import java.util.*;
import java.io.*;

public class TeamPROC {
	public static void main(String[] args) {
		
		Public ArrayList read_to_Array(string arg){
			List<String> names = new ArrayList<String>();
			File infile = new File(arg);
		
			try {
				Scanner sc = new Scanner(infile);
				while (sc.hasNext()){
					list.add(sc.nextLine);
				}
			} 
			catch(FileNotFoundException e){
				System.out.println("File Not Found, check route.");
			}
			return list
		}
		
		Public ArrayList sort_array(ArrayList arg){
			Collections.sort(arg);
			return arg
		}
		
		Public void make_file(ArrayList arg){
			PrintStream target = new PrintStream(new File(arg)); 
			for(int i=0 ; i < list.length ; i++){
				target.println(list[i]);
			}
		}
	}
}