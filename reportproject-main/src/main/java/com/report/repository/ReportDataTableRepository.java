package com.report.repository;

import com.report.modal.ReportDataTableModel;

public interface ReportDataTableRepository {

    
   void addReportDataTable(ReportDataTableModel reportDataTableModel);
   ReportDataTableModel getReportDataTableModelById(Integer id);
}
