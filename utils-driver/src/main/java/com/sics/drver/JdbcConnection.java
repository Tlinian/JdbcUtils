package com.sics.drver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {
    private int port;
    private String host;
    private String urlFormat;
    private final String mysqlUrlFormat = "jdbc:mysql://%s:%s/";
    private String database;
    private String url;
    private Connection connection;
    private String username;
    private String password;

    private Statement statement;

    /**
     * Mysql jdbc connection.
     *
     * @param port
     * @param host
     */
    public JdbcConnection(final int port,final String host,final String username,final String password) throws SQLException {
        this.port = port;
        this.host = host;
        this.url = url;
        this.username = username;
        this.password = password;
        this.connection = DriverManager.getConnection(String.format(mysqlUrlFormat,host,port),username,password);
    }

    public Connection getConnection(){
        return this.connection;
    }

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Statement getStatement() throws SQLException {
        if (statement == null){
            return this.connection.createStatement();
        }
        return statement;
    }


}
