package com.sics.mysql.dialect;

public class MysqlDialect {

    private String sign = "`";
    private String quote = "\"";

    public MysqlDialect() {
    }

    public String getDropTableSql(String schema, String table){
        String sql = "drop table " + tableWithSchema(schema,table);
        return sql;
    }

    public String getAllTable(String schema){
        String sql = "select owner,table_name from information.";
        return sql;
    }

    private String embraceSign(String string){
        return sign + string + sign;
    }
    private String embraceQuote(String  string){
        return quote + string + quote;
    }

    private String tableWithSchema(String schema, String table){
        return embraceQuote(schema) + "." + embraceQuote(table);
    }
}
