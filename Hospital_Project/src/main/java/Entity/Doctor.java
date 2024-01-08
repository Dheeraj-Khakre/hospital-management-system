package Entity;

import java.util.Date;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Doctor {
	
	@Id
    
	private int doc_Id;
	private String email;
	private String Password;
	private Date dateofJoin;
	public Doctor(String email, String password, String doc_name, String specilization, int yearOfExp, Branch branch) {
		super();
	   this.doc_Id = new Random().nextInt( 10000);
		this.email = email;
		Password = password;
		this.doc_name = doc_name;
		Specilization = specilization;
		this.yearOfExp = yearOfExp;
		this.branch = branch;
		this.dateofJoin = new Date();
	}


	public Date getDateofJoin() {
		return dateofJoin;
	}


	public void setDateofJoin(Date dateofJoin) {
		this.dateofJoin = dateofJoin;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public int getYearOfExp() {
		return yearOfExp;
	}


	public void setYearOfExp(int yearOfExp) {
		this.yearOfExp = yearOfExp;
	}

	private String doc_name;
	private String Specilization;
	private int yearOfExp;
	@ManyToOne
	private Branch branch;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getDoc_Id() {
		return doc_Id;
	}

	public void setDoc_Id(int doc_Id) {
		this.doc_Id = doc_Id;
	}

	public String getDoc_name() {
		return doc_name;
	}

	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}

	public String getSpecilization() {
		return Specilization;
	}

	public void setSpecilization(String specilization) {
		Specilization = specilization;
	}

	
	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
