package com.report.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.report.modal.TableArrayModal;

@Repository
public class TableArrayRepoImplement implements TableArrayRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addTableArrayRepository(TableArrayModal tableArrayModal) {
        // TODO Auto-generated method stub

        final Session session = this.sessionFactory.getCurrentSession();
        session.save(tableArrayModal);
        session.beginTransaction().commit();

    }

    @Override
    public TableArrayModal getTableArrayModelByID(Integer id) {
        // TODO Auto-generated method stub
        final Session session = this.sessionFactory.getCurrentSession();
        final TableArrayModal tableArrayModal = session
                .get(TableArrayModal.class, id);
        return tableArrayModal;

    }

}
