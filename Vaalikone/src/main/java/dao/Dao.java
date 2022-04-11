package dao;

import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import data.Ehdokas;
import data.Kysymykset;

import java.sql.Connection;

public class Dao {
	private String url;
	private String user;
	private String pass;
	private Connection conn;

	public Dao(String url, String user, String pass) {
		this.url = url;
		this.user = user;
		this.pass = pass;
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
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public ArrayList<Ehdokas> readAllEhdokas() {
		ArrayList<Ehdokas> list = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet RS = stmt.executeQuery("select * from ehdokkaat");
			while (RS.next()) {
				Ehdokas ehdokas = new Ehdokas();
				ehdokas.setId(RS.getInt("id"));
				ehdokas.setetunimi(RS.getString("etunimi"));
				ehdokas.setsukunimi(RS.getString("sukunimi"));
				ehdokas.setK1(RS.getInt("k1"));
				ehdokas.setK2(RS.getInt("k2"));
				ehdokas.setK3(RS.getInt("k3"));
				ehdokas.setK4(RS.getInt("k4"));
				ehdokas.setK5(RS.getInt("k5"));
				ehdokas.setK6(RS.getInt("k6"));
				ehdokas.setK7(RS.getInt("k7"));
				ehdokas.setK8(RS.getInt("k8"));
				ehdokas.setK9(RS.getInt("k9"));
				ehdokas.setK10(RS.getInt("k10"));
				ehdokas.setNumero(RS.getInt("numero"));
				list.add(ehdokas);
			}
			return list;
		} catch (SQLException e) {
			return null;
		}
	}

	public ArrayList<Ehdokas> updateEhdokas(Ehdokas ehdokas) {
		try {
			String sql = "update ehdokkaat set etunimi=?, sukunimi=?, k1=?, k2=?, k3=?, k4=?, k5=?, k6=?, k7=?, k8=?, k9=?, k10=?, numero=? where id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ehdokas.getetunimi());
			pstmt.setString(2, ehdokas.getsukunimi());
			pstmt.setInt(3, ehdokas.getK1());
			pstmt.setInt(4, ehdokas.getK2());
			pstmt.setInt(5, ehdokas.getK3());
			pstmt.setInt(6, ehdokas.getK4());
			pstmt.setInt(7, ehdokas.getK5());
			pstmt.setInt(8, ehdokas.getK6());
			pstmt.setInt(9, ehdokas.getK7());
			pstmt.setInt(10, ehdokas.getK8());
			pstmt.setInt(11, ehdokas.getK9());
			pstmt.setInt(12, ehdokas.getK10());
			pstmt.setInt(13, ehdokas.getNumero());
			pstmt.setInt(14, ehdokas.getId());
			pstmt.executeUpdate();
			return readAllEhdokas();
		} catch (SQLException e) {
			return null;
		}
	}

	public ArrayList<Ehdokas> deleteEhdokas(String id) {
		try {
			String sql = "delete from ehdokkaat where id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			return readAllEhdokas();
		} catch (SQLException e) {
			return null;
		}
	}

	public Ehdokas readEhdokas(String id) {
		Ehdokas ehdokas = null;
		try {
			String sql = "select * from ehdokkaat where id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet RS = pstmt.executeQuery();
			while (RS.next()) {
				ehdokas = new Ehdokas();
				ehdokas.setId(RS.getInt("id"));
				ehdokas.setetunimi(RS.getString("etunimi"));
				ehdokas.setsukunimi(RS.getString("sukunimi"));
				ehdokas.setK1(RS.getInt("k1"));
				ehdokas.setK2(RS.getInt("k2"));
				ehdokas.setK3(RS.getInt("k3"));
				ehdokas.setK4(RS.getInt("k4"));
				ehdokas.setK5(RS.getInt("k5"));
				ehdokas.setK6(RS.getInt("k6"));
				ehdokas.setK7(RS.getInt("k7"));
				ehdokas.setK8(RS.getInt("k8"));
				ehdokas.setK9(RS.getInt("k9"));
				ehdokas.setK10(RS.getInt("k10"));
				ehdokas.setNumero(RS.getInt("numero"));
			}
			return ehdokas;
		} catch (SQLException e) {
			return null;
		}
	}

	public ArrayList<Ehdokas> luoEhdokas(Ehdokas ehdokas) {
				try {
			String sql = "insert into ehdokkaat (etunimi, sukunimi, K1, K2, K3, K4, K5, K6, K7, K8, K9, K10,numero ) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ehdokas.getetunimi());
			pstmt.setString(2, ehdokas.getsukunimi());
			pstmt.setInt(3, ehdokas.getK1());
			pstmt.setInt(4, ehdokas.getK2());
			pstmt.setInt(5, ehdokas.getK3());
			pstmt.setInt(6, ehdokas.getK4());
			pstmt.setInt(7, ehdokas.getK5());
			pstmt.setInt(8, ehdokas.getK6());
			pstmt.setInt(9, ehdokas.getK7());
			pstmt.setInt(10, ehdokas.getK8());
			pstmt.setInt(11, ehdokas.getK9());
			pstmt.setInt(12, ehdokas.getK10());
			pstmt.setInt(13, ehdokas.getNumero());
			pstmt.executeUpdate();
			return readAllEhdokas();
		} catch (SQLException e) {
			return null;
		}
	}

	public ArrayList<Kysymykset> readAllKysymykset() {
		ArrayList<Kysymykset> list = new ArrayList<>(); 
		try {
			Statement stmt = conn.createStatement();
			ResultSet RS = stmt.executeQuery("select * from KYSYMYKSET");
			while (RS.next()) {
				Kysymykset kysymys = new Kysymykset();
				kysymys.setKysymyksetId(RS.getInt("KYSYMYS_ID"));
				kysymys.setKysymykset(RS.getString("KYSYMYKSET"));

				list.add(kysymys);
			}
			return list;
		} catch (SQLException e) {
			return null;
		}
	}

	@SuppressWarnings("null")
	public Kysymykset readKysymykset(String id) {
		Kysymykset kysymys = null;
		try {
			String sql = "select * from KYSYMYKSET where KYSYMYKSET_ID=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet RS = pstmt.executeQuery();
			while (RS.next()) {
				kysymys.setKysymyksetId(RS.getInt("KYSYMYS_ID"));
				kysymys.setKysymykset(RS.getString("KYSYMYKSET"));

			}
			return kysymys;
		} catch (SQLException e) {
			return null;
		}
	}
}
