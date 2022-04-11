package data;

public class Kysymykset {
	private int id;
	private String kysymykset;
	public Kysymykset(String id, String kysymykset) {
		// TODO Auto-generated constructor stub
		setKysymyksetId(id);
		this.kysymykset=kysymykset;
	}
	public Kysymykset() {
		// TODO Auto-generated constructor stub
	}
	public int getKysymyksetId() {
		return id;
	}
	public void setKysymyksetId(int id) { 
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
