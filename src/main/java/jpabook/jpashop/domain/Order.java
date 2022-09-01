package jpabook.jpashop.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Order {
    @Id @GeneratedValue
    private Long id;

    private LocalDateTime orderDate;

    @Enumerated(EnumType.String)
    private OrderStatus status;
}
