//19 november 26, thursday
package com.dao;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

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
    void performTransaction(List<String> sqpCommands) throws SQLException{
        try{
            connection.setAutoCommit(false);
            for(String sql : sqpCommands){
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
