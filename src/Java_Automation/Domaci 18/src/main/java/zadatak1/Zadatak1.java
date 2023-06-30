package Java_Automation.Domaci

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Zadatak1 {
    public static void main(String[] args) {
        /*
        Napraviti maven projekat. Dodati dependencies za apache poi i faker.
        Rucno kreirati xlsx fajl koji sadrzii 15 brojeva (može int ili double svejedno) rasporedjenih u 3
        reda po 5 (A1-A3, B1-B3…). U ovom koraku rucno pisemo u excel ne kroz kod. Kroz kod treba da
        procitate sve brojeve, nadjete prosek svako reda, a zatim te vrednosti upisemo u novi sheet u istoj
        excel tabeli.
        Primer: 1 red: 1, 3, -5, 8, 22, prosek je 29/5, 2 red: 1, 1, 1, 1, 1, prosek je 5/5…
        Novi sheet će dakle da ima vrednosti A1 = 29/5, A2 = 5/5…
         */

        try {
            FileInputStream inputStream = new FileInputStream("brojevi.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);


            XSSFSheet resultSheet = workbook.createSheet("Proseci");

            for (int row = 0; row < 3; row++) {
                XSSFRow currentRow = sheet.getRow(row);
                if (currentRow == null) {
                    currentRow = sheet.createRow(row);
                }
                XSSFRow resultRow = resultSheet.createRow(row);

                double sum = 0;
                int count = 0;
                for (int i = 0; i < 5; i++) {
                    XSSFCell currentCell = currentRow.getCell(i);
                    if (currentCell != null) {
                        double value = currentCell.getNumericCellValue();
                        sum += value;
                        count++;
                    }
                }

                double average = sum / count;

                XSSFCell averageCell = resultRow.createCell(0);
                averageCell.setCellValue(average);
            }

            inputStream.close();

            FileOutputStream outputStream = new FileOutputStream("brojevi.xlsx");
            workbook.write(outputStream);
            outputStream.close();
            workbook.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
