package examplepack;
 /*
  * Работающие чфункции получения данных 4 типов из начального вариата базы
  * данных для бьольшого тестреа
  * */
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import hibernate.db.*; 

import org.hibernate.*;

public class Example {
     
    public static void main(String[] args) {
       // proc();
        //auth_user("C",null,null,null,null);
        
       // System.out.println(getListTestForTeacher(6));
    	//getListQuestionsForTest(14); 
    	getListTestsForStudent(3);
        
        HibernateUtil.getSessionFactory().close();
    }
    
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
    public static void auth_user(String login, String password,Integer res, Student stud, Teacher teach){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("from Teacher a where a.login = :login");
        query.setParameter("login", login);
        Teacher findTeach= (Teacher) query.uniqueResult() ;
        System.out.println("1:="+findTeach.getLogin()+"  "+findTeach.getId_teach());
        session.getTransaction().commit();
    }
    public static void proc() {
        Session session = HibernateUtil.getSessionFactory()
                                                .getCurrentSession();
        session.beginTransaction();
//        Teacher t=new Teacher("A", "B", "C","D");
//        List<Test> tests=new ArrayList<Test>();
//        tests.add(new Test("Test1",1,t));
//        tests.add(new Test("Test2",1,t));
//        
//        t.setTests(tests);
        //session.save(t);
        //Teacher ft=(Teacher)session.get(Teacher.class,7 );

        //Test test1=new Test("f",1,ft);

       // session.save(test1);

//        Test mytest=new Test("Test3",1,ft);
//        Question q1=new Question();
//        q1.setQues_answ("answer");
//        q1.setQues_hard(11);
//        q1.setQues_ind(1);
//        q1.setQues_text("textt");
//        q1.setQues_using(1);
//        q1.setTest(mytest);
//        List<Question> questions=new ArrayList<Question>();
//        questions.add(q1);
//        mytest.setQuestions(questions);
//        Student stud1=new Student();
//        stud1.setName("Ram");
//        stud1.setSurname("Sav");
//        stud1.setStud_group("SP-11");
//        stud1.setLogin("login12");
//        stud1.setPassword("passw13");
//        
//     
//        stud1.addTest(mytest);
//        
//        session.save(stud1);
        
        session.getTransaction().commit();
    }
     
}