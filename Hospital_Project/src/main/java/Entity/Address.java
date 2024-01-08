package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	private int did;
	private String streatName;
	private String landMark;
	private String city;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int did, String streatName, String landMark, String city, String state, int pincode, Branch branch) {
		super();
		this.did = did;
		this.streatName = streatName;
		this.landMark = landMark;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.branch = branch;
	}

	private String state;
	private int pincode;
	@OneToOne
	private Branch branch;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getStreatName() {
		return streatName;
	}

	public void setStreatName(String streatName) {
		this.streatName = streatName;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
