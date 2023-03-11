package automate.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assigns")
public class Assign {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;

	private String userid;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Assign [id=" + id + ", userid=" + userid + "]";
	}

}
