package Day12;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03_Excel {


    @Test
    public void writeExcel() throws IOException {

        // Excel dosyasi acmak icin kullanilan kod blogumuz
        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\excelfile.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);


        Sheet newSheet = wb.getSheet("TestAutomation");

        Row row1 = newSheet.getRow(0);

        Cell row1cell1 = row1.getCell(0);
        row1cell1.setCellValue("ISIM1");

        Cell row1cell2 = row1.getCell(1);
        row1cell2.setCellValue("SOYISIM2");

        FileOutputStream fos = new FileOutputStream(path);

        wb.write(fos); // write methodu sayesinde yapmis oldugumuz degisiklikler FileOutputStream ile dosyaya yazilir

        fis.close();
        fos.close();
        wb.close();



    }


}
