package com.report.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.report.modal.ReportDataTableModel;

@Repository
public class ReportDataTableRepositoryImplement
        implements ReportDataTableRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addReportDataTable(ReportDataTableModel reportDataTableModel) {
        // TODO Auto-generated method stub
        final Session session = this.sessionFactory.getCurrentSession();
        session.save(reportDataTableModel);
        session.beginTransaction().commit();

    }

    @Override
    public ReportDataTableModel getReportDataTableModelById(Integer id) {
        // TODO Auto-generated method stub
        final Session session = this.sessionFactory.getCurrentSession();
        final ReportDataTableModel reportDataTableModel = session
                .get(ReportDataTableModel.class, id);
        return reportDataTableModel;
    }

}
