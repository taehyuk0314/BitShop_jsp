package domain;

public class MemberBean {
	private String id,name,pass,ssn;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return String.format("아이디:%s\n"
				+ "이름:%s\n"
				+ "비밀번호:%s\n"
				+ "주민번호:%s\n", id,name,pass,ssn);
	}
	
}
