package hezeu.jsj.domain;

public class Student {

    private Integer id;
    private String stuNo;
    private String stuName;
    private String password;
    private String stuGender;
    private String politicalStatus;// 政治面貌
    private String department;
    private Integer grade;
    private String className;
    private String job;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuNo='" + stuNo + '\'' +
                ", stuName='" + stuName + '\'' +
                ", password='" + password + '\'' +
                ", stuGender='" + stuGender + '\'' +
                ", politicalStatus='" + politicalStatus + '\'' +
                ", department='" + department + '\'' +
                ", grade=" + grade +
                ", className='" + className + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
