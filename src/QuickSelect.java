public class QuickSelect {
	int[] data;
	int size;

	public QuickSelect(int len) {
		size = len;
		data = new int[size];
	}

	public QuickSelect(int[] data, int size) {
		super();
		this.data = data;
		this.size = size;
	}

	public QuickSelect(int[] data2) {
		// TODO Auto-generated constructor stub
		this.data = data2;
	}

	int Partition(int i, int j) {
		int pivot = data[i];
		while (i < j) {
			while (data[j] > pivot)
				j--;

			while (data[i] < pivot)
				i++;
			if (i < j) {
				swap(i, j);
			}
		}
		return i;
	}

	int Select(int n) {
		return Select(0, data.length - 1, n);
	}

	int Select(int low, int high, int n) {
		if (low < high) {
			int pivot;
			pivot = Partition(low, high);
			if (pivot < n) {

				Select(pivot + 1, high, n - pivot);
			} else if (pivot > n) {
				Select(low, pivot - 1, n);
			}
			return data[pivot];
		}
		return -1;
	}

	void swap(int i, int j) {
		data[i] ^= data[j];
		data[j] ^= data[i];
		data[i] ^= data[j];
	}

	public String toString() {
		String result = new String();
		for (int i = 0; i < data.length; i++) {
			result += Integer.toString(data[i]) + ",";
		}
		return result;
	}
}
