package com.report.repository;

import com.report.modal.TableArrayModal;

public interface TableArrayRepository {

    
    void addTableArrayRepository(TableArrayModal tableArrayModal);
    TableArrayModal getTableArrayModelByID(Integer id);
}
