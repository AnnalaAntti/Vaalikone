package data;

public class Kysymykset {
	private int id;
	private String kysymykset;
	public Kysymykset(String id, String kysymykset) {
		// TODO Auto-generated constructor stub
		setkysymyksetId(id);
		this.kysymykset=kysymykset;
	}
	public Kysymykset() {
		// TODO Auto-generated constructor stub
	}
	public int getkysymyksetId() {
		return id;
	}
	public void setkysymyksetId(int id) {
		this.id = id;
	}
	public void setkysymyksetId(String id) {
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
