package com.sics.mysql.functionality;

import com.sics.drver.JdbcConnection;
import com.sics.mysql.dialect.MysqlDialect;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class MysqlFunctionality {

    private MysqlDialect mysqlDialect;
    private JdbcConnection jdbcConnection;

    public MysqlFunctionality(MysqlDialect mysqlDialect, JdbcConnection jdbcConnection) {
        this.mysqlDialect = mysqlDialect;
        this.jdbcConnection = jdbcConnection;
    }

    public void dropAllTable(List<String> schemaList) throws SQLException {
        Statement statement = jdbcConnection.getStatement();
        schemaList.forEach(s -> {


        });
    }
}
