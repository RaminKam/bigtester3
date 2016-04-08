package hibernate.dbacts;
import java.util.ArrayList;
import java.util.List;

import hibernate.db.*; 

import org.hibernate.*;
public class DBActs {
	public static List<Test> getListTestsForStudent(Integer fk_stud_id){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery(
                " select t "
                    + " from Test t INNER JOIN t.students student"
                    + " where student.id_stud = :fk_stud_id "
            )
                .setLong("fk_stud_id", fk_stud_id);
        List<Test> tests;
        tests=(List<Test>)query.list();
//        for(int i=0;i<tests.size();i++){
//        	System.out.println(tests.get(i).getName());
//        }
    	session.getTransaction().commit();
    	return tests;
    }
    public static List<Question> getListQuestionsForTest(Integer fk_id_test){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("from Question where fk_id_test = :fk_id_test").setLong("fk_id_test", fk_id_test);
        List<Question> questions;
        questions = (List<Question>) query.list();        
//        for(int i=0;i<questions.size();i++){
//        	System.out.println("="+questions.get(i).getQues_text());
//        }
    	session.getTransaction().commit();
    	return questions;
    }
    public static List<Test> getListTestForTeacher(Integer id_teach_ref){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        

        Query query = session.createQuery("from Test where id_teach_ref = :id_teach_ref").setLong("id_teach_ref", id_teach_ref);
        List<Test> tests;
        tests = (List<Test>) query.list();        
//        for(int i=0;i<tests.size();i++){
//        	System.out.println("="+tests.get(i).getName());
//        }
    	session.getTransaction().commit();
    	return tests;
    	
    }
    public static void auth_user(String login, String password,Integer[] res, Student[] stud, Teacher[] teach){	//Output: res=0(if db hasn't person) <=> nulls
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();							//res=1(if it's teacher) <=> stud=null
        
        session.beginTransaction();																			//res=2(if it's student) <=> teach=null
        res[0]=new Integer(0); stud[0]=null; teach[0]=null;
        Query query = session.createQuery("from Teacher a where a.login = :login");							
        query.setParameter("login", login);
        Teacher findTeach= (Teacher) query.uniqueResult() ;
        if(findTeach!=null){//next check password:
        	if(findTeach.getPassword().equals(password)){
        		//It's teacher
        		res[0]=1;
        		teach[0]=findTeach;
        		return;
        	}
        }else{
        	Query query1 = session.createQuery("from Student a where a.login = :login");
            query1.setParameter("login", login);
            Student findStud= (Student) query1.uniqueResult();
            if(findStud!=null && findStud.getPassword().equals(password)){
            	//It's student
            	res[0]=2;
            	stud[0]=findStud;
            	return;
            }
        }
        
        
        //System.out.println("1:="+findTeach.getLogin()+"  "+findTeach.getId_teach());
        session.getTransaction().commit();
    }
}
