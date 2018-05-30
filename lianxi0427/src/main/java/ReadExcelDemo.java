import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by new on 2018/5/3.
 */
public class ReadExcelDemo {
    public static String [][] readExcel(String path,String sheetName){
        InputStream in = null;
        String[][]data=null;
        Logger logger = Logger.getLogger(ReadExcelDemo.class);
        PropertyConfigurator.configure("./log4j.properties");
        try {
            in=new FileInputStream(path);
            Workbook workbook=Workbook.getWorkbook(in);
            logger.info("获取输入表");
            Sheet sheet=workbook.getSheet(sheetName);
            logger.info("获取表单");
            int rows = sheet.getRows();
            int columns=sheet.getColumns();
            data=new String[rows][columns];
            for (int i=0;i<rows;i++){
                for (int j=0;j<columns;j++){
                    Cell cell=sheet.getCell(j,i);
                    data[i][j]=cell.getContents();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error("excel表格读取有误");
        }
        return data;
    }
    public static void main(String[] args) {

        String [][]myData = readExcel("G:\\1.xls","Sheet1");
        for (int i=0;i<myData.length;i++){
            for(int j=0;j<myData[i].length;j++){

                System.out.println(myData[i][j]);
            String[]item=myData[i];
          }
        }
    }



    public static void witer(List<String >list,String path) throws WriteException,IOException{
        File file = new File(path);
        if(file.isFile() && file.exists()){
            file.delete();
        }else{
            file.createNewFile();
        }
        try{
            WritableWorkbook wb = Workbook.createWorkbook(new File(path));
            WritableSheet se = wb.createSheet("account",0);
            for (int i=0;i<list.size();i++){
                for (int j=0;j<3;j++){
                    se.addCell(new Label(j,i,list.get(i)));
                }
            }
            wb.write();
        }catch (IOException e){
            e.printStackTrace();
        }finally {

        }

    }
}
