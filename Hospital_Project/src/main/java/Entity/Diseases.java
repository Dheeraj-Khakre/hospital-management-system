package Entity;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Diseases {
	@Id
	private int dis_id;
	private String dis_Name;
	private Date occureDate;

	public Diseases( String dis_Name, String symptoms, List<Patient> patients) {
		super();
		this.dis_id = new Random().nextInt(10000);
		this.dis_Name = dis_Name;
		this.symptoms = symptoms;
		this.patients = patients;
		this.occureDate= new Date();
	}

	public Diseases() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Date getOccureDate() {
		return occureDate;
	}

	public void setOccureDate(Date occureDate) {
		this.occureDate = occureDate;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}


	public int getDis_id() {
		return dis_id;
	}

	public void setDis_id(int dis_id) {
		this.dis_id = dis_id;
	}

	public String getDis_Name() {
		return dis_Name;
	}

	public void setDis_Name(String dis_Name) {
		this.dis_Name = dis_Name;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	@Column(length = 1000)
	private String symptoms;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Patient> patients;

}
