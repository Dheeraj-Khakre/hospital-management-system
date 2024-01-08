package Entity;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Patient {
	@Id
	private int p_id;
	private String pName;
	private int age;
	private String mo_No;
	private String bloodGruop;
	private Date dateofjoin ;
	@ManyToMany(mappedBy = "patients",cascade = CascadeType.ALL)
	private List<Diseases> diseases;

	public List<Diseases> getDiseases() {
		return diseases;
	}

	public void setDiseases(List<Diseases> diseases) {
		this.diseases = diseases;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMo_No() {
		return mo_No;
	}

	public void setMo_No(String mo_No) {
		this.mo_No = mo_No;
	}

	public String getBloodGruop() {
		return bloodGruop;
	}

	public void setBloodGruop(String bloodGruop) {
		this.bloodGruop = bloodGruop;
	}

	public Patient( String pName, int age, String mo_No, String bloodGruop) {
		super();
		this.p_id = new Random().nextInt(1000000);
		this.pName = pName;
		this.age = age;
		this.mo_No = mo_No;
		this.bloodGruop = bloodGruop;
		this.dateofjoin= new Date();
	}

	public Date getDateofjoin() {
		return dateofjoin;
	}

	public void setDateofjoin(Date dateofjoin) {
		this.dateofjoin = dateofjoin;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

}
