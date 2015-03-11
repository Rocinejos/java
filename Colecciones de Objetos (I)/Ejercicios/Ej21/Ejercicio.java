import java.util.*;

public class Ejercicio {
	public static void main(String[] args) {
		int n=0;
		for (char i='a'; i<='z'; i++) {
			for (char j='a'; j<='z'; j++) {
				System.out.println(i+""+j);
				n++;
			}
		}
		//System.out.println(n);
	}
}