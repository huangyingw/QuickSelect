import java.io.IOException;

public class QuickSelect {
	int[] data;
	private Log log;
	int size;
	private int result = -1;

	public QuickSelect(int len) {
		size = len;
		data = new int[size];
	}

	public QuickSelect(int[] data, int size) {
		super();
		this.data = data;
		this.size = size;
	}

	public QuickSelect(int[] data2, String name) throws IOException {
		// TODO Auto-generated constructor stub
		this.data = data2;
		log = new Log(name);

	}

	int Partition(int i, int j) throws IOException {
		log.Append("During the partition->");
		Print(i, j);
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

	public void Print() throws IOException {
		Print(0, data.length - 1);
	}

	public void Print(int l, int r) throws IOException {
		for (int i = l; i <= r; i++) {
			log.Append(data[i] + ",");
		}
		log.Appendln();
	}

	int Select(int n) throws IOException {
		return Select(0, data.length - 1, n);
	}

	int Select(int low, int high, int n) throws IOException {
		if (low < high) {
			log.Append("in , find the " + n + " th->");
			Print(low, high);
			int pivot;
			pivot = Partition(low, high);
			if (pivot - low < n) {
				Select(pivot + 1, high, n - pivot + low - 1);
			} else if (pivot - low > n) {
				Select(low, pivot - 1, n);
			} else {
				log.Appendln("pivot data[" + pivot + "]->" + data[pivot]
						+ ",low data[" + low + "]->" + data[low] + " n->" + n);
				Print();
				log.Appendln(data[pivot - 1] + "");
				result = data[pivot - 1];
			}
		}
		log.Appendln("to return ->" + result);
		return result;
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
