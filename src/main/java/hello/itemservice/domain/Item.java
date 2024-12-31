package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity //JPA가 사용하는 객체라는 뜻, 이 애노테이션이 있어야 JPA가 인식할 수 있다.
public class Item {

    @Id //테이블의 pk와 해당 테이블 맵핑
    @GeneratedValue(strategy = GenerationType.IDENTITY) // db에서 pk 증가시킴 ex) MySQL auto increment
    private Long id;


    @Column(name= "item_name",length =10) //객체의 필드를 테이블의 컬럼과 매핑한다.
    private String itemName;
    private Integer price;
    private Integer quantity;

    // JPA는 public 또는 protected의 기본 생성자가 필수
    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
