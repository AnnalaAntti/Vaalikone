package data;

public class Ehdokas {
	private int id;
	private String etunimi;
	private String sukunimi;
	private int k1;
	private int k2;
	private int k3;
	private int k4;
	private int k5;
	private int k6;
	private int k7;
	private int k8;
	private int k9;
	private int k10;
	public Ehdokas(String id, String etunimi, String sukunimi, String k1, String k2, String k3, String k4, String k5, String k6, String k7, String k8, String k9, String k10) {
		// TODO Auto-generated constructor stub
		setId(id);
		this.etunimi=etunimi;
		this.sukunimi=sukunimi;
		setK1(k1);
		setK2(k2);
		setK3(k3);
		setK4(k4);
		setK5(k5);
		setK6(k6);
		setK7(k7);
		setK8(k8);
		setK9(k9);
		setK10(k10);
		
		}
	public Ehdokas() { 
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setId(String id) {
		try {
			this.id = Integer.parseInt(id);
		}
		//jsakdjasdas
		catch(NumberFormatException | NullPointerException e) {
			//Do nothing - the value of id won't be changed
		}
	}
	public String getetunimi() {
		return etunimi;
	}
	public void setetunimi( String etunimi) {
		this.etunimi=etunimi;
	}
	public String getsukunimi() {
		return sukunimi;
	}
	public void setsukunimi( String sukunimi) {
		this.sukunimi=sukunimi;
	}
	public int getK10() {
		return k10;
	}
	public void setK10(int k10) {
		this.k10 = k10;
	}
	public void setK10(String k10) {
		this.k10 = Integer.parseInt(k10);
	}
	public int getK9() {
		return k9;
	}
	public void setK9(int k9) {
		this.k9 = k9;
	}
	public void setK9(String k9) {
		this.k9 = Integer.parseInt(k9);
	}
	public int getK8() {
		return k8;
	}
	public void setK8(int k8) {
		this.k8 = k8;
	}
	public void setK8(String k8) {
		this.k8 = Integer.parseInt(k8);
	}
	public int getK7() {
		return k7;
	}
	public void setK7(int k7) {
		this.k7 = k7;
	}
	public void setK7(String k7) {
		this.k7 = Integer.parseInt(k7);
	}
	public int getK6() {
		return k6;
	}
	public void setK6(int k6) {
		this.k6 = k6;
	}
	public void setK6(String k6) {
		this.k6 = Integer.parseInt(k6);
	}
	public int getK5() {
		return k5;
	}
	public void setK5(int k5) {
		this.k5 = k5;
	}
	public void setK5(String k5) {
		this.k5 = Integer.parseInt(k5);
	}
	public int getK4() {
		return k4;
	}
	public void setK4(int k4) {
		this.k4 = k4;
	}
	public void setK4(String k4) {
		this.k4 = Integer.parseInt(k4);
	}
	public int getK3() {
		return k3;
	}
	public void setK3(int k3) {
		this.k3 = k3;
	}
	public void setK3(String k3) {
		this.k3 = Integer.parseInt(k3);
	}
	public int getK2() {
		return k2;
	}
	public void setK2(int k2) {
		this.k2 = k2;
	}
	public void setK2(String k2) {
		this.k2= Integer.parseInt(k2);
	}
	public int getK1() {
		return k1;
	}
	public void setK1(int k1) {
		this.k1 = k1;
	}
	public void setK1(String k1) {
		this.k1 = Integer.parseInt(k1);
	}
}