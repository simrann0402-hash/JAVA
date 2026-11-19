//19 november 26, thursday
package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class GenericDao {
    Connection connection;
    public GenericDao(Connection connection){
        this.connection = connection;
    }
    public void showTable(String tableName){
        String query = "SELECT  * FROM " + tableName;
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for(int i=1;i<=columnCount;i++){
                String colName = metaData.getColumnName(i);
                System.out.print(colName + "\t");
            }
            System.out.println();
            while(resultSet.next()){
                for(int i=1;i<=columnCount;i++){
                    String data = resultSet.getString(i);
                    System.out.print(data + "\t");
                }
                System.out.println();
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
