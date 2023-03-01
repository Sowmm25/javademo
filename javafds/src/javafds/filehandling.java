package filehandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class filehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileinputstreamdemo();

	}
	static void fileinputstreamdemo(){
		int i;
		File my=new File("/javafds/src/filehandling/check.txt");
		try {
		FileInputStream f=new FileInputStream(my);	
		
		System.out.println("file opened");
		while((i=f.read())!=-1) {
			System.out.println((char)i);
		}
		f.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
