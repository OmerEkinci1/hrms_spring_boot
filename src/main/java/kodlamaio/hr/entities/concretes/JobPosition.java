package kodlamaio.hr.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JobPositions")
public class JobPosition {
	
	@Id
	@GeneratedValue
	@Column(name="PositionID")
	private int PositionID;
	
	@Column(name="PositionName")
	private String PositionName;

	public JobPosition() {
		super();
	}

	public JobPosition(int positionID, String positionName) {
		super();
		PositionID = positionID;
		PositionName = positionName;
	}

	public int getPositionID() {
		return PositionID;
	}

	public void setPositionID(int positionID) {
		PositionID = positionID;
	}

	public String getPositionName() {
		return PositionName;
	}

	public void setPositionName(String positionName) {
		PositionName = positionName;
	}

}
