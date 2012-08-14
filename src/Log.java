import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Log {
	public static void main(String[] args) throws IOException {
		Log log = new Log("log.txt");
		log.Append("I love you");
		log.Append("I love you");
		log.Append("I love you");
	}

	private BufferedWriter bw;

	private String name;

	public Log(String name) throws IOException {
		super();
		this.name = name;
		File file = new File(name);
		if (file.exists()) {
			file.delete();
		}
		bw = new BufferedWriter(new FileWriter(this.name, true));
	}

	public void Clear() {
		// bw.
	}

	public void Append(String line) throws IOException {
		bw.write(line, 0, line.length());
		bw.newLine();
		bw.flush();
	}
}
