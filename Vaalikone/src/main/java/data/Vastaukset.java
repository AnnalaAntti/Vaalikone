package data;

public class Vastaukset {
	private int id;
	private String vastaukset;
	public Vastaukset(String EHDOKAS_ID, String KYSYMYS_ID, String VASTAUS) {
		// TODO Auto-generated constructor stub
		setVastauksetId(id);
		this.vastaukset=EHDOKAS_ID;
		this.vastaukset=KYSYMYS_ID;
		this.vastaukset=VASTAUS;
	}
	public Vastaukset() {
		// TODO Auto-generated constructor stub
	}
	public int getVastauksetId() {
		return id;
	}
	public void setVastauksetId(int id) {
		this.id = id;
	}
	public void setKysymyksetId(String id) {
		try {
			this.id = Integer.parseInt(id);
		}
		catch(NumberFormatException | NullPointerException e) {
			//Do nothing - the value of id won't be changed
		}
	}
	public String getKysymykset() {
		return kysymykset;
	}
	public void setKysymykset(String kysymykset) {
		this.kysymykset = kysymykset;
	}
}
