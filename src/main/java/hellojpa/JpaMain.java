package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args){

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("hello");
        //persistence.xml에서 persistence-unit name 으로 지정한 이름 "hello"
        EntityManager em=emf.createEntityManager();


        /**JPA를 통한 모든 데이터 변경은 트랜잭션 안에서 실행해야 한다*/
        EntityTransaction tx=em.getTransaction();
        tx.begin();

        try{
            Member member=new Member();
            member.setId(2L);
            member.setName("helloB");

            em.persist(member);

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();     //사용끝난후, 꼭 닫아줘야함
        }
        /***/

        emf.close();

    }
}
