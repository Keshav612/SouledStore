package souled;
import org.testng.annotations.DataProvider;
public class Dataprovider_Common 
{
@DataProvider(name="multipletestsinasinglefile")
public static Object[][] getData()
{
	Object[][] data=new Object[2][2];
	data[0][0]="mkeshav12@gmail.com";
	data[0][1]="ahdgfuysd";

	data[1][0]="mkeshawv12@gmail.com";
	data[1][1]="ahdgdffuysd";
	
	return data;
}
}
