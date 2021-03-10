package com.report.repository;

import com.report.modal.TableArrayRegional;

public interface TableArrayRegionalRepository {

    void addTableArrayRegional(TableArrayRegional tableArrayRegional);

    TableArrayRegional findById(Integer id);
}
