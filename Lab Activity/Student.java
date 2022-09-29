package com.onetomanymumbaiuniver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Student {
	@Id
	private int sid;

	@Column(length = 20, nullable = false)
	private String sname;

	private String sclass;

	private String gender;

	@Column(length = 10, nullable = false)
	private long sphone;

	@Column(length = 50, nullable = false)
	private String sstream;

	@Column(length = 50, nullable = false)
	private String aaddress;

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sclass=" + sclass + ", gender=" + gender + ", sphone="
				+ sphone + ", sstream=" + sstream + ", aaddress=" + aaddress + "]";
	}

}
