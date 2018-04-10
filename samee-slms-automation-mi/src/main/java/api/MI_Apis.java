package api;

import hmh.isg.qa.sam.tools.SAMTools;

public class MI_Apis {
	
	private String URL;
	private String userName;
	private String passWord;
	public SAMTools st;
	
	
	public MI_Apis() {

			URL = "localhost:8080";
			userName = "samadmin";
			passWord = "Welcome_1";
		
	}
	
	public void SAMConnect() {
		st = new SAMTools(URL.trim(), userName.trim(), passWord.trim());

	}

}
