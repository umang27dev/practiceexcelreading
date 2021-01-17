package Framework.ExcelDriven;

import java.util.ArrayList;

public class TestSample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dataDriven d =new dataDriven();
		ArrayList data = d.getData("tescase");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		//driver.findelement(By.xpath("")).sendkeys(data.get(0));
	}

}
