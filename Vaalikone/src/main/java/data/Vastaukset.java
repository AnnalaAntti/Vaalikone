package data;

public class Vastaukset {
	private int id;
	private String kysymys;
	private String vastaus;
	
	public Vastaukset(String id, String kysymys, String vastaus) {
		// TODO Auto-generated constructor stub
		setId(id);
		this.kysymys=kysymys;
		this.vastaus=vastaus;
	
		
		}
	public Vastaukset() { 
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
	public String getkysymys() {
		return kysymys;
	}
	public void setkysymys( String kysymys) {
		this.kysymys=kysymys;
	}
	public String getvastaus() {
		return vastaus;
	}
	public void setvastaus( String vastaus) {
		this.vastaus=vastaus;
	}
}
