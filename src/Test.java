public class Test {
	static public void main(String[] args) {
		int[] data = { 3, 1, 2, 0, 6, 5, 4 };
		QuickSelect qs = new QuickSelect(data);
		System.out.println(qs.Select(1));
		System.out.println(qs.Select(0));
		System.out.println(qs.Select(data.length - 1));
		System.out.println(qs.Select(2));
	}
}
