package Java_Automation.Domaci

import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Zadatak2 {
    /*
    Napraviti novi maven projekat. Dodati dependencies za apache poi i faker ,
    Rucno kreirati xlsx fajl koji sadrzii 5 imena. U ovom koraku rucno pisemo u excel ne kroz kod.
    Kroz kod treba da procitamo, stavimo u niz i ispisemo tih 5 imena, a zatim dodati jos 5 imena koristeci
    Faker u isti niz. Nakon toga potrebno je sva imena iz liste upisati u novi sheet u istoj excel tabeli.
    Primer: Pocetan izgled excel sheet-a: Bilja, Milos, Marko, Ivana, Vladimir.
    Izgled novog sheet-a: Bilja, Milos, Marko, Ivana, Vladimir (vrednosti iz prvog sheet-a),
    Suzana, Marina, Ivan, Aleksandar, Dusan (imena kreirana uz pomoc Faker-a).

     */
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("lista imena.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);


            ArrayList<String> imena = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                XSSFRow row = sheet.getRow(i);
                if (row != null) {
                    XSSFCell cell = row.getCell(0);
                    if (cell != null) {
                        imena.add(cell.getStringCellValue());
                    }
                }
            }


            Faker faker = new Faker();
            for (int i = 0; i < 5; i++) {
                imena.add(faker.name().firstName());
            }

            XSSFSheet newSheet = workbook.createSheet("Sva Imena");

            for (int i = 0; i < imena.size(); i++) {
                XSSFRow row = newSheet.createRow(i);
                XSSFCell cell = row.createCell(0);
                cell.setCellValue(imena.get(i));
            }

            inputStream.close();


            FileOutputStream outputStream = new FileOutputStream("lista imena.xlsx");
            workbook.write(outputStream);
            outputStream.close();
            workbook.close();


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
