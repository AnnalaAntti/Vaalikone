package dao;

import java.sql.DriverManager;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import data.Ehdokas;

import java.sql.Connection;

public class Dao {
	private String url;
	private String user;
	private String pass;
	private Connection conn;
	
	public Dao(String url, String user, String pass) {
		this.url=url;
		this.user=user;
		this.pass=pass;
	}
	
	public boolean getConnection() {
		try {
	        if (conn == null || conn.isClosed()) {
	            try {
	                Class.forName("com.mysql.jdbc.Driver").newInstance();
	            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
	                throw new SQLException(e);
	            }
	            conn = DriverManager.getConnection(url, user, pass);
	        }
	        return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	public ArrayList<Ehdokas> readAllEhdokas() {
		ArrayList<Ehdokas> list=new ArrayList<>();
		try {
			Statement stmt=conn.createStatement();
			ResultSet RS=stmt.executeQuery("select * from ehdokkaat");
			while (RS.next()){
				Ehdokas f=new Ehdokas();
				f.setId(RS.getInt("id"));
				f.setetunimi(RS.getString("etunimi"));
				f.setsukunimi(RS.getString("sukunimi"));
				f.setK1(RS.getInt("k1"));
				f.setK2(RS.getInt("k2"));
				f.setK3(RS.getInt("k3"));
				f.setK4(RS.getInt("k4"));
				f.setK5(RS.getInt("k5"));
				f.setK6(RS.getInt("k6"));
				f.setK7(RS.getInt("k7"));
				f.setK8(RS.getInt("k8"));
				f.setK9(RS.getInt("k9"));
				f.setK10(RS.getInt("k10"));
				list.add(f);
			}
			return list;
		}
		catch(SQLException e) {
			return null;
		}
	}
	public ArrayList<Ehdokas> updateEhdokas(Ehdokas f) {
		try {
			String sql="update ehdokkaat set etunimi=? where id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, f.getetunimi());
			pstmt.setInt(2, f.getId());
			pstmt.executeUpdate();
			return readAllEhdokas();
		}
		catch(SQLException e) {
			return null;
		}
	}
	public ArrayList<Ehdokas> deleteEhdokas(String id) {
		try {
			String sql="delete from ehdokkaat where id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			return readAllEhdokas();
		}
		catch(SQLException e) {
			return null;
		}
	}

	public Ehdokas readEhdokas(String id) {
		Ehdokas f=null;
		try {
			String sql="select * from ehdokkaat where id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet RS=pstmt.executeQuery();
			while (RS.next()){
				f=new Ehdokas();
				f.setId(RS.getInt("id"));
				f.setetunimi(RS.getString("etunimi"));
				f.setsukunimi(RS.getString("sukunimi"));
				f.setK1(RS.getInt("k1"));
				f.setK2(RS.getInt("k2"));
				f.setK3(RS.getInt("k3"));
				f.setK4(RS.getInt("k4"));
				f.setK5(RS.getInt("k5"));
				f.setK6(RS.getInt("k6"));
				f.setK7(RS.getInt("k7"));
				f.setK8(RS.getInt("k8"));
				f.setK9(RS.getInt("k9"));
				f.setK10(RS.getInt("k10"));
			}
			return f;
		}
		catch(SQLException e) {
			return null;
		}
	}
}