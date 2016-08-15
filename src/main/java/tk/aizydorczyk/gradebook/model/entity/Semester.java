package tk.aizydorczyk.gradebook.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.UniqueConstraint;
import java.util.List;

@Entity(name = "SEMESTERS")
public class Semester {
	@Column(name = "SEMESTER_ID")
	@Id
	private Long id;

	@Column(name = "SEMESTER_NUMBER")
	private Short semestrNumber;

	@Column(name = "SEMESTER_YEAR")
	private Short year;

	@ManyToMany
	@JoinTable(name = "STUDENTS_SEMESTERS", uniqueConstraints = {@UniqueConstraint(
			columnNames = {"STUDENT_ID", "SEMESTER_ID"})}, joinColumns = {@JoinColumn(name = "SEMESTER_ID")},
			inverseJoinColumns = {@JoinColumn(name = "STUDENT_ID")})
	private List<Student> students;

	@ManyToOne
	@JoinColumn(name = "DEPARTAMENT_ID")
	private Department departament;

	public Semester() {
	}

	public Semester(Long id, Short semestrNumber, Short year, List<Student> students, Department departament) {
		this.id = id;
		this.semestrNumber = semestrNumber;
		this.year = year;
		this.students = students;
		this.departament = departament;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Short getSemestrNumber() {
		return semestrNumber;
	}

	public void setSemestrNumber(Short semestrNumber) {
		this.semestrNumber = semestrNumber;
	}

	public Short getYear() {
		return year;
	}

	public void setYear(Short year) {
		this.year = year;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Department getDepartament() {
		return departament;
	}

	public void setDepartament(Department departament) {
		this.departament = departament;
	}
}
