package excel.read;

import java.io.IOException;

public class ExcelReadMain {

	 
		public static void main(String[] args) throws IOException {

			String name =Excel.readStringData(2,0);
			System.out.println("Name :"+ "\t"+name);

			String id= Excel.readIntegerData(2, 1);
			System.out.println("id   :"+"\t"+ id);


			}


			}

	


