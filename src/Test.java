import java.io.IOException;

public class Test {
	static public void main(String[] args) throws IOException {
		int[] data = { 3, 1, 2, 6, 5, 4 };
		QuickSelect qs = new QuickSelect(data, "log.txt");
		System.out.println(qs.Select(4));
		System.out.println(qs.Select(2));
		// System.out.println(qs.Select(3));
		// System.out.println(qs.Select(4));
		System.out.println(qs.Select(5));
		// System.out.println(qs.Select(6));
	}
}
