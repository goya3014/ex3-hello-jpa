package jpabook.jpashop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id @GeneratedValue
    private Long id;

    private String name;

    //상위 카테고리 매핑
    @ManyToOne
    @JoinColumn("PARENT_ID")
    private Category parent;

    //자식 카테고리(상위 카테고리와 양방향 매핑)
    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();

}
