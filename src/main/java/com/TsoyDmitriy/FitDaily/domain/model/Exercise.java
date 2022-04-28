package com.TsoyDmitriy.FitDaily.domain.model;

import com.TsoyDmitriy.FitDaily.domain.dictionary.ExerciseType;
import com.TsoyDmitriy.FitDaily.domain.dictionary.Muscle;
import com.TsoyDmitriy.FitDaily.domain.dictionary.MuscleGroup;
import com.TsoyDmitriy.FitDaily.domain.security.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Entity
@Table(name = "exercise")
@NoArgsConstructor
@AllArgsConstructor
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 100)
    private String name;

    @Size(min = 2, max = 500)
    private String description;

    @ManyToOne
    private ExerciseType exerciseType;

    @ManyToMany
    @JoinTable(
            name = "exercise_muscle_group",
            joinColumns = @JoinColumn(name = "excercise_id"),
            inverseJoinColumns = @JoinColumn(name = "muscle_group_id"))
    private List<MuscleGroup> muscleGroup;

    @ManyToMany
    @JoinTable(
            name = "exercise_muscle",
            joinColumns = @JoinColumn(name = "excercise_id"),
            inverseJoinColumns = @JoinColumn(name = "muscle_id"))
    private List<Muscle> muscle;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}
