package phase1;

public class Usercredentials {
	public String sitename;
	public String username;
	public String password;
	public String Loginuser;
	public Usercredentials() {
		
	}
	public Usercredentials(String sitename, String username, String password, String loginuser) {
		super();
		this.sitename = sitename;
		this.username = username;
		this.password = password;
		Loginuser = loginuser;
	}
	/**
	 * @return the sitename
	 */
	public String getSitename() {
		return sitename;
	}
	/**
	 * @param sitename the sitename to set
	 */
	public void setSitename(String sitename) {
		this.sitename = sitename;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the loginuser
	 */
	public String getLoginuser() {
		return Loginuser;
	}
	/**
	 * @param loginuser the loginuser to set
	 */
	public void setLoginuser(String loginuser) {
		Loginuser = loginuser;
	}
	 public String tostring(){
		 return "Usercredential[sitename="+sitename+ 
				 ",password="+password+
				 ",sitename="+sitename+
				 ",Loginuser="+Loginuser+
				 "]";
	 }
	
	
	
	
	

}
