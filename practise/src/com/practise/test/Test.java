package com.practise.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
	    Class.forName("com.mysql.jdbc.Driver");
	    try ( Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://dev-COM-713.dev.pfops.com:3306/communication", "progressfinQA", "passwordQA")) {
	        if (conn != null) {
	            System.out.println("Connected to the database!");
	        } else {
	            System.out.println("Failed to make connection!");
	        }
	    } catch (SQLException e) {
	        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
