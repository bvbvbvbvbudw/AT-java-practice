package aqa_course.task6;

import javax.persistence.*;

@Entity
@Table(name = "fruit_basket")
public class FruitBasket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private boolean isTasty;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    public FruitBasket() {}
    public FruitBasket(String type, boolean isTasty, User owner) {
        this.type = type;
        this.isTasty = isTasty;
        this.owner = owner;
    }

    // геттеры/сеттеры
}