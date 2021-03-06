package core.classes.hr;

import core.classes.BaseEntity;

public class Village extends BaseEntity implements java.io.Serializable {

	private int vgeId;
	private String province;
	private String district;
	private String dsdivision;
	private String gndivision;
	private Boolean active;
	private String code;
	
	public int getVgeId() {
		return vgeId;
	}
	public void setVgeId(int vgeId) {
		this.vgeId = vgeId;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getDsdivision() {
		return dsdivision;
	}
	public void setDsdivision(String dsdivision) {
		this.dsdivision = dsdivision;
	}
	public String getGndivision() {
		return gndivision;
	}
	public void setGndivision(String gndivision) {
		this.gndivision = gndivision;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
