package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class ReaderWriterClasses {
	public static void main(String[] args) throws IOException {
		final String FILE_NAME="Names.txt";
		ReaderWriterClasses readerWriter=new ReaderWriterClasses();
		readerWriter.writeToFile(FILE_NAME);
		readerWriter.readFromFile(FILE_NAME);
	}
	
	private void writeToFile(String fileName) throws IOException{
		FileWriter writer=null;
		try {
			writer = new FileWriter(fileName);

			writer.write("Aniket");
			writer.write("\nAjay");
			writer.write("\nSuraj");
			writer.write("\nSandhya");
			writer.write("\nManish");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found");
			e.printStackTrace();
		} finally {
			if (writer != null)
				writer.close();
		}
	}
	private void readFromFile(String fileName) throws IOException{
		Reader reader =null;
		
		try {
			char []buffer=new char[1024];
			reader=new FileReader(fileName);
			reader.read(buffer);
			System.out.println(buffer);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			if(reader!=null)
				reader.close();
			
		}
	}

}
