package utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {
	 @DataProvider(name="logindata")
     public Object[][] getData(){
       
         return Excelutils.getTestDataFromExcel("sheet1");
 
     }
	
	}



