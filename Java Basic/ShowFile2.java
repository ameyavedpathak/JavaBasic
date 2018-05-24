package ClassWork;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int i;
		FileInputStream fin;
		try{
			fin = new FileInputStream(args[0]);
			do{
				i= fin.read();
				if (i != -1){

					if(i==101){
						System.out.print((char)69);
					}
					else{
						System.out.print((char)i);
					}
				}
				
				
			}while(i!=-1);
			fin.close();
			
			
		}catch(Exception e){
			
		}
	}
}
