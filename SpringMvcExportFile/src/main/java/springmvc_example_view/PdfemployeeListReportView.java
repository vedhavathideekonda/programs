package springmvc_example_view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

import springmvc_example_model.Employee;

public class PdfemployeeListReportView extends AbstractPdfView {

 @Override
 protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer, HttpServletRequest request,
   HttpServletResponse response) throws Exception {
  
  response.setHeader("Content-Disposition", "attachment; filename=\"employee_list.pdf\"");
  
  @SuppressWarnings("unchecked")
  List<Employee> list = (List<Employee>) model.get("employeeList");
  
  Table table = new Table(4);
  table.addCell("ID");
  table.addCell("USER NAME");
  table.addCell("FIRST NAME");
  table.addCell("LAST NAME");
  
  for(Employee emploee : list){
   table.addCell(String.valueOf(emploee.getId()));
   table.addCell(emploee.getUsername());
   table.addCell(emploee.getFirstname());
   table.addCell(emploee.getLastname());
  }
  
  document.add(table);
 }

}
