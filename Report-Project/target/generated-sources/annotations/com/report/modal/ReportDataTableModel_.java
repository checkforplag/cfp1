package com.report.modal;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ReportDataTableModel.class)
public abstract class ReportDataTableModel_ {

	public static volatile SingularAttribute<ReportDataTableModel, Timestamp> createTime;
	public static volatile SingularAttribute<ReportDataTableModel, Integer> id;
	public static volatile SingularAttribute<ReportDataTableModel, String> token;
	public static volatile SingularAttribute<ReportDataTableModel, Integer> status;

	public static final String CREATE_TIME = "createTime";
	public static final String ID = "id";
	public static final String TOKEN = "token";
	public static final String STATUS = "status";

}

