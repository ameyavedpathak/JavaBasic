package ClassWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int i;
		FileInputStream fin;
		
		fin = new FileInputStream("]args[0]");
		do{
			i= fin.read();
			if (i != -1)
				System.out.print((char)i);
			
			
		}while(i!=-1);
		fin.close();
		
		
	}

}
