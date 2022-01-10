package springmvc_example_view;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;


import springmvc_example_model.Employee;


public class ExcelemployeeListReportView extends AbstractXlsView {

 @Override
 protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
   HttpServletResponse response) throws Exception {
  
  response.setHeader("Content-disposition", "attachment; filename=\"employee_list.xls\"");
  
  @SuppressWarnings("unchecked")
  List<Employee> list = (List<Employee>) model.get("employeeList");
  
  Sheet sheet = workbook.createSheet("employee List");
  
  Row header = sheet.createRow(0);
  header.createCell(0).setCellValue("ID");
  header.createCell(1).setCellValue("USER NAME");
  header.createCell(2).setCellValue("FIRST NAME");
  header.createCell(3).setCellValue("LAST NAME");
  
  int rowNum = 1;
  
  for(Employee employee : list){
   Row row = sheet.createRow(rowNum++);
   row.createCell(0).setCellValue(employee.getId());
   row.createCell(1).setCellValue(employee.getUsername());
   row.createCell(2).setCellValue(employee.getFirstname());
   row.createCell(3).setCellValue(employee.getLastname());
  }
  
 }

}
