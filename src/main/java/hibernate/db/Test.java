package hibernate.db;
import java.util.List; 
import javax.persistence.*;


import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "tests")
public class Test {
    @Id
    @Column(name = "id_test")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_test;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "access")
    private Integer access;
    
    @ManyToOne
    @JoinColumn(name = "id_teach_ref")
    private Teacher teacher;
    
    @OneToMany(cascade=CascadeType.ALL, mappedBy="test")
    private List <Question> questions;
    
    @ManyToMany
    @JoinTable(name = "studstests",
            
            joinColumns = @JoinColumn(name = "fk_test_id"),
            
            inverseJoinColumns = @JoinColumn(name = "fk_stud_id"))
    private Set<Student> students = new HashSet<Student>();
    
    public Test(){
    	
    }
    public Test(String name, Integer access, Teacher teacher){
     	this.name=name;
    	this.access=access;
    	this.teacher=teacher;
    }
    public void setId_test(Integer id_test){
    	this.id_test=id_test;
    }
    public Integer getId_test(){
    	return id_test;
    }
    public void setName(String name){
    	this.name=name;
    }
    
    public String getName(){
    	return name;    
    }
    public void setAccess(Integer access){
    	this.access=access;
    }
    
    public Integer getAccess(){
    	return access;    
    }
    public void setTeacher(Teacher teacher){
    	this.teacher=teacher;
    }
    public Teacher getTeacher(){
    	return teacher;
    }
    
    public void setQuestions(List<Question> questions){
    	this.questions=questions;
    }
    
    public List<Question> getQuestions(){
    	return questions;
    }
    public Set<Student> getStudentSet() {
        return students;
    }
 
    public void setStudentSet(Set<Student> students) {
        this.students = students;
    }
}
