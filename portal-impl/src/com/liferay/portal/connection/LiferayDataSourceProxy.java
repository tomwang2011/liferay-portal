package com.liferay.portal.connection;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;

public class LiferayDataSourceProxy extends LazyConnectionDataSourceProxy {
	public Connection getConnection() throws SQLException {
		System.out.println("********Current Thread: " + Thread.currentThread());

		return super.getConnection();
	}
}
