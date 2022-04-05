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
	public Ehdokas(String id, String etunimi, String sukunimi, int k1, int k2, int k3, int k4, int k5, int k6, int k7, int k8, int k9, int k10) {
		// TODO Auto-generated constructor stub
		setId(id);
		this.etunimi=etunimi;
		this.sukunimi=sukunimi;
		this.k1=k1;
		this.k2=k2;
		this.k3=k3;
		this.k4=k4;
		this.k5=k5;
		this.k6=k6;
		this.k7=k7;
		this.k8=k8;
		this.k9=k9;
		this.k10=k10;
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
	public int getK9() {
		return k9;
	}
	public void setK9(int k9) {
		this.k9 = k9;
	}
	public int getK8() {
		return k8;
	}
	public void setK8(int k8) {
		this.k8 = k8;
	}
	public int getK7() {
		return k7;
	}
	public void setK7(int k7) {
		this.k7 = k7;
	}
	public int getK6() {
		return k6;
	}
	public void setK6(int k6) {
		this.k6 = k6;
	}
	public int getK5() {
		return k5;
	}
	public void setK5(int k5) {
		this.k5 = k5;
	}
	public int getK4() {
		return k4;
	}
	public void setK4(int k4) {
		this.k4 = k4;
	}
	public int getK3() {
		return k3;
	}
	public void setK3(int k3) {
		this.k3 = k3;
	}
	public int getK2() {
		return k2;
	}
	public void setK2(int k2) {
		this.k2 = k2;
	}
	public int getK1() {
		return k1;
	}
	public void setK1(int k1) {
		this.k1 = k1;
	}
}