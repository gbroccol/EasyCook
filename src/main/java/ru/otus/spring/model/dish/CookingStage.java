package ru.otus.spring.model.dish;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "dish", name = "cooking_stage")
public class CookingStage {

    @EmbeddedId
    private CookingStageId cookingStageId;

    @ManyToOne
    @MapsId("dishId")
    @JoinColumn(name = "dish_id")
    private Dish dish;

    @Column(name = "description", length = 2500, nullable = false)
    private String description;

    @Column(name = "photo", length = 250)
    private String photo;
}
