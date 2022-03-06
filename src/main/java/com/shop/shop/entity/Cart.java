package com.shop.shop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "cart")
@Getter
@Setter
@ToString
public class Cart {

    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne // @OneToOne을 이용해서 회원 엔티티와 일대일로 매핑할 수 있다
    @JoinColumn(name = "member_id") //JoinColumn을 이용해 매핑할 외래키를 지정할 수 있다.
    private Member member;
}
