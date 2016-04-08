package hibernate.db;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @Column(name = "id_teach")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_teach;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "surname")
    private String surname;
    
    @Column(name = "login")
    private String login;
    
    @Column(name = "password")
    private String password;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacher")
    private List<Test> tests;
    public Teacher(){
    	
    }
    public Teacher(String name, String surname, String login, String password){
    	this.name=name;
    	this.surname=surname;
    	this.login=login;
    	this.password=password;
    }
   
    public void setId_teach(Integer id_teach){
    	this.id_teach=id_teach;
    }
    public Integer getId_teach(){
    	return id_teach;
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
    public void setTests(List<Test> tests){
    	this.tests=tests;
    }
    public List<Test> getTests(){
    	return tests;
    }
}
