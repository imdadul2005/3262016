package dataReder3_20;

import java.util.Random;

public class ReadFile {

	public void main(String []args){
	
	/*	String fileLocation = "C:\\Users\\Imdadul\\Desktop\\sample.txt"; 
		
		FileReader fr = null;
		try {
			fr = new FileReader(fileLocation);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader br =new BufferedReader(fr);
		
		
		
		
		
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		// Use Random Class
		
		Random rm = new Random();
		int [] array = new int [10];
		for (int i =0;i<10;i++)
			array[i]=rm.nextInt(100);
	
		
		for (int i =0;i<10;i++)
			System.out.println(array[i]);
		
		
	}
	
}
