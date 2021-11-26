package utility;

public class Calling 
{

	
	public static void main(String[] args) 
	{
		//browserLaunch
		   Object[] input=new Object[2];
		            input[0]="Chrome";
		            input[1]="G:\\Automation Support\\chromedriver.exe";
		            SeleniumOperations.browserLaunch(input);
		            
		            
		        //openApp    
		            Object[] input1=new Object[1];
		            input1[0]="https://www.flipkart.com/";
		            SeleniumOperations.openApplication(input1);       
		            
		            //click on Cancle  
		            Object[] input2=new Object[1];
		            input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		            SeleniumOperations.clickOnElement(input2);
		            
		            //moveToElement
		            Object[] input3=new Object[1];
		            input3[0]="//*[@class='_28p97w']";
		            SeleniumOperations.moveToElement(input3);
		            
		            //click on Profile 
		            Object[] input4=new Object[1];
		            input4[0]="//*[text()='My Profile']";
		            SeleniumOperations.clickOnElement(input4);
		            
		            //enter username
		            Object[] input5=new Object[2];
		            input5[0]="(//*[@autocomplete='off'])[2]";
		            input5[1]="9168313434";
		            SeleniumOperations.sendKey(input5);
		            
		            //enter password
		            Object[] input6=new Object[2];
		            input6[0]="//*[@type='password']";
		            input6[1]="DDDD@1234";
		            SeleniumOperations.sendKey(input6);
		            
		          //click on Login
		            Object[] input7=new Object[1];
		            input7[0]="(//*[text()='Login'])[3]";
		            SeleniumOperations.clickOnElement(input7);
		            
		            
		
	}
	
	
	
	
	
}
