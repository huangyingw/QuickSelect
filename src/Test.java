public class Test {
	static public void main(String[] args) {
		int[] data = { 3, 1, 2, 0, 6, 5, 4 };
		QuickSelect qs = new QuickSelect(data);
		qs.Sort();
		System.out.println(qs.toString());

		data = new int[] { 1 };
		qs = new QuickSelect(data);
		qs.Sort();
		System.out.println(qs.toString());

		data = new int[] { 1, 2 };
		qs = new QuickSelect(data);
		qs.Sort();
		System.out.println(qs.toString());

		data = new int[] { 1, 2, 3 };
		qs = new QuickSelect(data);
		qs.Sort();
		System.out.println(qs.toString());

		data = new int[] { 1 };
		qs = new QuickSelect(data);
		qs.Sort();
		System.out.println(qs.toString());

		data = new int[] { 2, 1 };
		qs = new QuickSelect(data);
		qs.Sort();
		System.out.println(qs.toString());

		data = new int[] { 3, 2, 1 };
		qs = new QuickSelect(data);
		qs.Sort();
		System.out.println(qs.toString());
	}
}
