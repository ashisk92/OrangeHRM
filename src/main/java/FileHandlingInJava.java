import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingInJava {
	
	public static void main(String[] args) {
		copyFile();
	}
	
	

	public static void copyFile() {

		File file = new File("C:\\Users\\khatu\\Downloads\\Ashis Resume.pdf");
		File opFile = new File("C:\\Users\\khatu\\Downloads\\Ashis Resume-copy.pdf");

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			fileOutputStream = new FileOutputStream(opFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// how many byte available in that file
		int i = 0;
		try {
			while ((i = fileInputStream.read()) != -1) {
				fileOutputStream.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			//close the streams
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
