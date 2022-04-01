package data;

public class Ehdokas {
	private int id;
	private String etunimi;
	public Ehdokas(String id, String etunimi) {
		// TODO Auto-generated constructor stub
		setId(id);
		this.etunimi=etunimi;
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
}