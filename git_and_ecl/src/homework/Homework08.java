package homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Homework08 {
	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		String dirPath = "C:/homework/";
		String tempPath = "C:/temp/";
		String originalFileName = "sublime_text_setup.exe";
		String originalFilePath = "C:/"+originalFileName;
		String tempFilePath = "";
		
		
		System.out.println("============ Checking for directory presence...         ============");
		File dirCheck = new File(dirPath);
		if(dirCheck.exists()==true) {
			System.out.println("============ Directory has existed.	                ============");
		} else {
			System.out.println("============ Directory has not existed.	Create " + dirPath + " ============");
			dirCheck.mkdir();
		} // if :: outer directory isExist, if false, create substitute directory
		
		
		System.out.println("============ Checking for original file presence...     ============");
		File fileCheck = new File(originalFilePath);
		if(fileCheck.exists()==true) {
			System.out.println("============ Original file has existed.	                ============");
		} else {
			System.out.println("!! Original file doesn't exist. Please check the file. Exit the process.");
			return; // do not use exit() and use return instead, It runs in main() anyway
		} // if :: original file isExist
		
		
		System.out.println("============ Copy processing has started.               ============");
		
		while(true) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmm");
			String targetFileName = UUID.randomUUID().toString()+".exe";
			String dateDirPath = dirPath+sdf.format(new Date())+"/"; // path of date directory
			tempFilePath = tempPath+targetFileName;

			File dateDir = new File(dateDirPath);
			if(dateDir.exists()==false) {
				dateDir.mkdir();
			} // if :: make date directory
			
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalFilePath));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(tempFilePath));
			
			byte[] readBytes = new byte[128];
			while( (bis.read(readBytes)) != -1 ) {
				bos.write(readBytes);
			} // copy file
			
			bos.flush();
			bos.close(); // if close sub IOstream, also close main IOstream together
			bis.close(); // close IOstream prior to move file because of already using process error
			
			Thread.sleep(5*1000); // insert interval between create and move
			
			// not using renameTo because It has many errors
			Files.move(Paths.get(tempFilePath), Paths.get(dateDirPath+targetFileName)); // with googling
			
			System.out.println(String.format("\t  Processing... [ Lapse of time : %.3f s ]", 
					(System.currentTimeMillis()-startTime)/1000f)); // print Lapse of time
		} // while
		
	} // main
	
} // end class