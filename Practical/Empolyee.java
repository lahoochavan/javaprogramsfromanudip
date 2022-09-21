package maven.com.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "empdetails")
@Entity

public class Empolyee {
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.AUTO) // auto increment
	private int eid;

	@Column(length = 20, nullable = false)
	private String ename;

	@Column(length = 12, nullable = false, unique = true)
	private long ephone;

	@Column(length = 10, nullable = false)
	private double esalary;

	@Column(length = 50)
	private String eaddr;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public long getEphone() {
		return ephone;
	}

	public void setEphone(long ephone) {
		this.ephone = ephone;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	public String getEadd() {
		return eaddr;
	}

	public void setEadd(String eaddr) {
		this.eaddr = eaddr;
	}

}
