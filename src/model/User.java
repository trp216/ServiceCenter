package model;

public class User {
	
	public static int CEDULA_DE_CUIDADANIA = 1;
	public static int TARJETA_DE_IDENTIDAD = 2;
	public static int REGISTRO_CIVIL = 3;
	public static int PASAPORTE = 4;
	public static int CEDULA_DE_EXTRANJERIA = 5;

	private String id;
	private int idtype;
	private String firstName;
	private String lastName;
	private String phone;
	private String dir;
	
	public User(String id, int idtype, String firstName, String lastName, String phone, String dir) {
		super();
		this.id = id;
		this.idtype = idtype;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.dir = dir;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getIdtype() {
		return idtype;
	}
	public void setIdtype(int idtype) {
		this.idtype = idtype;
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
	
}
