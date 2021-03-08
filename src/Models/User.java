package Models;

public class User {
private String username;
private String role;
private String p;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public User(String username,String p, String role) {
	super();
	this.username = username;
	this.role = role;
	this.p = p;
}
public String getP() {
	return p;
}
public void setP(String p) {
	this.p = p;
}

}
