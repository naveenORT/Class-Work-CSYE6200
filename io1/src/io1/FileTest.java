package io1;

import java.io.File;

public class FileTest {

	public FileTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		
	File baseDir = new File("test");	
	if (!baseDir.exists())	
		baseDir.mkdirs();
	listDir(baseDir);
	
	}
	
	public void listDir(File dirFile) 
	{
	if(!dirFile.isDirectory()) 
		return;
	
	System.out.println("Dir:" + dirFile.getAbsolutePath());		
	
	for (File file : dirFile.listFiles()) 
	{
		if(file.isDirectory()) 
		continue;
		String fTxt = String.format("%1$32s %2$10d %3$100s", file.getName(), file.length(), file.getAbsolutePath());
		System.out.println(fTxt);
	}}
	
	
	public static void main(String[] args) {
		FileTest fileTest = new FileTest();
		fileTest.run();
	}

}
