package addressbook;

import java.io.Serializable;
import java.sql.Timestamp;

public class AddrBook implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int bnum;
	private String username;
	private String tel;
	private String Email;
	private String gender;
	private Timestamp regDate;
	
	public int getBnum() {
		return bnum;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	
	
}
