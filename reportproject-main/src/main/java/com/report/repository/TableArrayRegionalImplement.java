package com.report.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.report.modal.TableArrayRegional;

@Repository
public class TableArrayRegionalImplement
        implements TableArrayRegionalRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addTableArrayRegional(TableArrayRegional tableArrayRegional) {
        // TODO Auto-generated method stub

        final Session session = this.sessionFactory.getCurrentSession();
        session.save(tableArrayRegional);
        session.beginTransaction().commit();

    }

    @Override
    public TableArrayRegional findById(Integer id) {
        // TODO Auto-generated method stub
        final Session session = this.sessionFactory.getCurrentSession();
        final TableArrayRegional tableArrayRegional = session
                .get(TableArrayRegional.class, id);
        return tableArrayRegional;

    }

}
