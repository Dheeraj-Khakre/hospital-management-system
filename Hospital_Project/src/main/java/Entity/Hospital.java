package Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	private int Hid;
	private String hName;
	private String CEO;
	@OneToMany(mappedBy = "hospital")
	private List<Branch> branchs;

	public Hospital() {
		super();

	}

	public Hospital(int hid, String hName, String cEO, List<Branch> branchs) {
		super();
		Hid = hid;
		this.hName = hName;
		CEO = cEO;
		this.branchs = branchs;
	}

	public int getHid() {
		return Hid;
	}

	public void setHid(int hid) {
		Hid = hid;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public String getCEO() {
		return CEO;
	}

	public void setCEO(String cEO) {
		CEO = cEO;
	}

	public List<Branch> getBranchs() {
		return branchs;
	}

	public void setBranchs(List<Branch> branchs) {
		this.branchs = branchs;
	}

}
