package com.onetomanymumbaiuniver.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int Uid;

	@Column(length = 20, nullable = false)
	private String Uname;

	@Column(length = 10, nullable = false)
	private String Ulocation;

	@Column(length = 50)
	private String Uemail;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Uid")
	private List<Student> Student;

}
