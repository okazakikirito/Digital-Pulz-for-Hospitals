// default package
// Generated Jul 17, 2013 11:31:01 AM by Hibernate Tools 3.4.0.CR1
package core.classes.pharmacy;


/**
 * MstPharmDepartment generated by hbm2java
 */
public class MstPharmDepartment implements java.io.Serializable {

	private String deptName;

	public MstPharmDepartment() {
	}

	public MstPharmDepartment(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}