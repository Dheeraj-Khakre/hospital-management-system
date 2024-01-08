package Entity;

import java.util.Date;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Manager {

	@Id
	
	private int mid;
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String mName;
	private String graduation;
	private int yearOfExp;
	private Date dateofjoin;
	@OneToOne
	private Branch branch;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Manager(String email, String password, String mName, String graduation, int yearOfExp, Branch branch) {
		super();
		this.mid =  new Random().nextInt(10000);
		this.email = email;
		this.password = password;
		this.mName = mName;
		this.graduation = graduation;
		this.yearOfExp = yearOfExp;
		this.branch = branch;
		this.dateofjoin= new Date();
	}

	public Date getDateofjoin() {
		return dateofjoin;
	}

	public void setDateofjoin(Date dateofjoin) {
		this.dateofjoin = dateofjoin;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public int getYearOfExp() {
		return yearOfExp;
	}

	public void setYearOfExp(int yearOfExp) {
		this.yearOfExp = yearOfExp;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
