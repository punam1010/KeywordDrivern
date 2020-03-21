package KeyDrivern;

public class DriverScript {

	public static void main(String[] args) throws Exception  {
    String spath="D:\\workspace\\Keywords\\key.xlsx";
    Excelutil.setExcelFile(spath, "Sheet1");
    for(int irow=1;irow<=7;irow++) {
	String sActionKeyword=Excelutil.getCellData(irow, 0);
	if(sActionKeyword.equals("openBrowser")) {
		ActionKeywords.openBrowser();
		
	}
	else if(sActionKeyword.equals("navigate")) {
		ActionKeywords.navigate();
		
	}
	else if(sActionKeyword.equals("inputUsername")) {
		ActionKeywords.inputUsername();
		
	}
	else if(sActionKeyword.equals("clickNext")) {
		ActionKeywords.clickNext();
		
	}
	else if(sActionKeyword.equals("inputPassword")) {
		ActionKeywords.inputPassword();
		
	}
	else if(sActionKeyword.equals("clickSignIn")) {
		ActionKeywords.clickSignIn();
		
	}
	else if(sActionKeyword.equals("CloseBrowser")) {
		ActionKeywords.closeBrowser();
		
	}
}
}
}