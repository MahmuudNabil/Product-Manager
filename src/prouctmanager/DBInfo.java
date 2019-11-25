/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prouctmanager;

/**
 *
 * @author Mahmoud
 */
public interface DBInfo {
    String dbName = "jdbc:mysql://product_db2.sql";
    String encoding ="?useUnicode=yes&characterEncoding=UTF-8";
    String dbNameWithEncoding=dbName + encoding;
    String user = "";
    String password="";
}
