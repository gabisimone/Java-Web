package practica7;

public class Item {
	private int id;
	private String vino;

	private String DJ;

	private int vinoPrecio;
	private int DJPrecio;

	public Item() {
	}
	
	public Item(int id, String dj, String vino) {
		super();
		this.id = id;
		this.DJ = dj;
		this.vino = vino;
	}
	
	public int getId() {
		return id;
	}
	
	public int getDJPrecio() {
		return DJPrecio;
	}
	
	
	public int getvinoPrecio() {
		return vinoPrecio;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDJ() {
		return DJ;
	}
	public void setDJ(String dj) {
		this.DJ = dj;
	}
	public String getVino() {
		return vino;
	}
	public void setVino(String vino) {
		this.vino = vino;
	}

}
