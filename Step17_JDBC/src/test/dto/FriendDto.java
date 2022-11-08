package test.dto;

import java.sql.Date;

public class FriendDto {
	//field 선언
	private int num;
	private String name;
	private String phone;
	private String birth;
	
	//디폴트 생성자
	public FriendDto() {};
	
	//인자 4개를 갖는 생성자
	public FriendDto(int num, String name, String phone, String birth) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.birth = birth;
	}

	//각각의 field에 대한 getter,setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}	
}
