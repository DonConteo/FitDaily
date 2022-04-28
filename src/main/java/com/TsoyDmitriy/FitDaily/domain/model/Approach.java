package com.TsoyDmitriy.FitDaily.domain.model;

import com.TsoyDmitriy.FitDaily.domain.security.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Digits;

@Data
@Entity
@Table(name = "approach")
@NoArgsConstructor
@AllArgsConstructor
public class Approach {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private ExerciseBlock exerciseBlock;

    @Digits(integer = 2, fraction = 0)
    private Integer approachNumber;

    @Digits(integer = 4, fraction = 0)
    private Integer quantityOfRepeats;

    @Digits(integer = 3, fraction = 2)
    private Double weight;

    private String restTime;

    private String time;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}