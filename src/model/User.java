package model;

public class User {
	
	public static String ONE =  "CEDULA_DE_CIUDADANIA";
	public static String TWO = "TARJETA_DE_IDENTIDAD";
	public static String THREE = "REGISTRO_CIVIL";
	public static String FOUR = "PASAPORTE";
	public static String FIVE = "CEDULA_DE_EXTRANJERIA";

	private String id;
	private String idtype;
	private String firstName;
	private String lastName;
	private String phone;
	private String dir;
	
	private Turn uturn;
	
	public User(String id, int idtype, String firstName, String lastName, String phone, String dir) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.dir = dir;
		setIdtype(idtype);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdtype() {
		return idtype;
	}
	public void setIdtype(int idtype) {
		if(idtype == 1)
			this.idtype = ONE;
		else if(idtype == 2)
			this.idtype = TWO;
		else if(idtype == 3)
			this.idtype = THREE;
		else if(idtype == 4)
			this.idtype = FOUR;
		else if(idtype == 5)
			this.idtype = FIVE;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public Turn getUturn() {
		return uturn;
	}
	public void setUturn(Turn uturn) {
		this.uturn = uturn;
	}
	
	
	
}
