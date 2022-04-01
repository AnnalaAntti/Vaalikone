package data;

public class Ehdokas {
	private int id;
	private String etunimi;
	private String sukunimi;
	public Ehdokas(String id, String etunimi, String sukunimi) {
		// TODO Auto-generated constructor stub
		setId(id);
		this.etunimi=etunimi;
		this.sukunimi=sukunimi;
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
	public void setetunimi( String sukunimi) {
		this.etunimi=etunimi;
	}
	public String getsukunimi() {
		return sukunimi;
	}
	public void setsukunimi( String sukunimi) {
		this.sukunimi=sukunimi;
	}
}