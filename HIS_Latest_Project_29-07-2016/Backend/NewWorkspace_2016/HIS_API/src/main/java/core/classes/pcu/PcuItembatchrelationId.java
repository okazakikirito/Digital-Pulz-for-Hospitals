package core.classes.pcu;

// default package
// Generated Aug 20, 2014 1:40:33 PM by Hibernate Tools 4.0.0

/**
 * PcuItembatchrelationId generated by hbm2java
 */
public class PcuItembatchrelationId implements java.io.Serializable {

	private int SNumber;
	private int batchNo;

	public PcuItembatchrelationId() {
	}

	public PcuItembatchrelationId(int SNumber, int batchNo) {
		this.SNumber = SNumber;
		this.batchNo = batchNo;
	}

	public int getSNumber() {
		return this.SNumber;
	}

	public void setSNumber(int SNumber) {
		this.SNumber = SNumber;
	}

	public int getBatchNo() {
		return this.batchNo;
	}

	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PcuItembatchrelationId))
			return false;
		PcuItembatchrelationId castOther = (PcuItembatchrelationId) other;

		return (this.getSNumber() == castOther.getSNumber())
				&& (this.getBatchNo() == castOther.getBatchNo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSNumber();
		result = 37 * result + this.getBatchNo();
		return result;
	}

}