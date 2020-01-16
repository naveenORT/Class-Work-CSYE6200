package edu.neu.csye6200.command;

public class CmdTest {

	private StringBuffer textDoc = new StringBuffer();
	
	public CmdTest() {
		
		textDoc.append("Initial String");

		InsertTxtCmd itc = new InsertTxtCmd(textDoc, "ABC123", 8);
	
		System.out.println("Before insert textDoc: " + textDoc.toString());
		itc.execute();
		itc.execute();
		System.out.println("After insert textDoc: " + textDoc.toString());
	
		itc.undo();
		System.out.println("After undo textDoc: " + textDoc.toString());
	
		itc.undo();
		System.out.println("After undo 2 textDoc: " + textDoc.toString());
	
	
	}
	
	
	public static void main (String[] args)
	{
	CmdTest cmdTest = new CmdTest();
	}
	
}
