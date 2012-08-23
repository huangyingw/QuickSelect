import java.io.IOException;

public class Test {
	static public void main(String[] args) throws IOException {
		int[] data = { 3, 1, 2, 0, 6, 5, 4 };
		QuickSelect qs = new QuickSelect(data, "log.txt");
		System.out.println(qs.Select(1));
		System.out.println(qs.Select(0));
		System.out.println(qs.Select(data.length - 1));
		System.out.println(qs.Select(2));
	}
}
