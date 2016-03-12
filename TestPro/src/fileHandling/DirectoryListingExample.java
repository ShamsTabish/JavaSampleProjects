package fileHandling;

import java.io.File;

public class DirectoryListingExample {
	public static void main(String[] args) {
		File dir = new File("./src/");
		for (File file : dir.listFiles()) {
			System.out.println(file + "  \t" + (file.isDirectory() ? "-Directory" : "-File"));
		}
	}
}
