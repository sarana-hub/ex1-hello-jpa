package hellojpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //JPA를 사용하는, JPA가 관리할 객체
//@Table(name = "USER") //테이블명 지정
public class Member {

    @Id //데이터베이스 PK와 매핑
    private Long id;

    //@Column(name = "username")   칼럼명 지정
    private String name;

    /*Getter, Setter*/
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
