package lr10.Example4;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException {
        main(args, 0);
    }

    public static void main(String[] args, int i) throws IOException {
        Scanner in = new Scanner(System.in);


            String filePath = "src/lr10/example4/exampleExcel.xlsx";

            FileInputStream inputStream = new FileInputStream(filePath);

            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            XSSFSheet sheet = workbook.getSheet("Товары");

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.println(cell.toString() + "\t");
                }
                System.out.println();
            }
            workbook.close();
            inputStream.close();



    }
}