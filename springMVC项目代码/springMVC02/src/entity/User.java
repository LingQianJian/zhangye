package entity;
/*
 * 1、属性名与请求参数名一致
 * 2、这些属性要提供get/set方法
 */
public class User {
	String username;
	String pwd;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
