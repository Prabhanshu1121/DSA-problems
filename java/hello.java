import java.util.Arrays;
import java.util.Comparator;

public class hello
{
	public static void main(String[] args) {
	    String a = "I am learning Stream api in java";
	    String arr[] =a.split(" ");
		int ans=Arrays.stream(arr).max(Comparator.comparingInt(String :: length)).get().length();
		System.out.println(ans);
	}
}