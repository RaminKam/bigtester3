package hibernate.db;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "students")
public class Student {
    @Id
    @Column(name = "id_stud")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_stud;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "surname")
    private String surname;
    
    @Column(name = "stud_group")
    private String stud_group;
    
    @Column(name = "login")
    private String login;
    
    @Column(name = "password")
    private String password;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "studstests",
            
            joinColumns = @JoinColumn(name = "fk_stud_id"),
            
            inverseJoinColumns = @JoinColumn(name = "fk_test_id"))
    private Set<Test> tests = new HashSet<Test>();

    
    public void setId_stud(Integer id_stud){
    	this.id_stud=id_stud;
    }
    public Integer getId_stud(){
    	return id_stud;
    }
    public void setName(String name){
    	this.name=name;
    }
    
    public String getName(){
    	return name;    
    }
    public void setSurname(String surname){
    	this.surname=surname;
    }
    public String getSurname(){
    	
    	return surname;
    }
    
    public void setStud_group(String stud_group){
    	this.stud_group=stud_group;
    }
    public String getStud_group(){
    	
    	return stud_group;
    }
    
    public Set<Test> getTests () {
        return tests;
    }
 
    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }
 
    public void addTest(Test test) {
        tests.add(test);
    }
    
    public void setLogin(String login){
    	this.login=login;
    }
    public String getLogin(){
    	return login;
    }
    public void setPassword(String password){
    	this.password=password;
    }
    public String getPassword(){
    	return password;
    }
}
