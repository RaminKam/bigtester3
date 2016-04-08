package hibernate.db;
import java.util.List; 
import javax.persistence.*;


import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "questions")
public class Question {
    @Id
    @Column(name = "id_ques")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ques;
    
    @Column(name = "ques_ind")
    private Integer ques_ind;
    
    @Column(name = "ques_text")
    private String ques_text;
    
    @Column(name = "ques_answ")
    private String ques_answ;
    
    @Column(name = "ques_using")
    private Integer ques_using;
    
    @Column(name = "ques_hard")
    private Integer ques_hard;
    
    @ManyToOne
    @JoinColumn(name="fk_id_test")
    private Test test;

    //-------------------------------------------------
//    public Integer getQues_(){
//    	return ques_;
//    }
//    
//    public void setQues_(Integer ques_){
//    	this.ques_=ques_;
//    }
//    public String getQues_(){
//    	return ques_;
//    }
//    
//    public void setQues_(String ques_){
//    	this.ques_=ques_;
//    }
    //---------------------------------------------------
    public Integer getId_ques(){
    	return id_ques;
    }
    
    public void setId_ques(Integer id_ques){
    	this.id_ques=id_ques;
    }
    
    public Integer getQues_ind(){
    	return ques_ind;
    }
    
    public void setQues_ind(Integer ques_ind){
    	this.ques_ind=ques_ind;
    }
    public String getQues_text(){
    	return ques_text;
    }
    
    public void setQues_text(String ques_text){
    	this.ques_text=ques_text;
    }
    public String getQues_answ(){
    	return ques_answ;
    }
    
    public void setQues_answ(String ques_answ){
    	this.ques_answ=ques_answ;
    }
    public Integer getQues_using(){
    	return ques_using;
    }
    
    public void setQues_using(Integer ques_using){
    	this.ques_using=ques_using;
    }
    public Integer getQues_hard(){
    	return ques_hard;
    }
    
    public void setQues_hard(Integer ques_hard){
    	this.ques_hard=ques_hard;
    }
    
    public Test qetTest(){
    	return test;
    }
    
    public void setTest(Test test){
    	this.test=test;
    }
  
}
