public class Employee {
    Integer id;
    String name, status;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Employee(Integer id, String name, String status, Integer deptId, Integer sal) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.deptId = deptId;
        this.sal = sal;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", status=" + status + ", deptId=" + deptId + ", sal=" + sal
                + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getDeptId() {
        return deptId;
    }
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
    public Integer getSal() {
        return sal;
    }
    public void setSal(Integer sal) {
        this.sal = sal;
    }
    Integer deptId, sal;
}
