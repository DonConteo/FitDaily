package com.TsoyDmitriy.FitDaily.domain.model;

import com.TsoyDmitriy.FitDaily.domain.security.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "exercise_block")
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseBlock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "exercise_block_exercise",
            joinColumns = @JoinColumn(name = "exercise_block_id"),
            inverseJoinColumns = @JoinColumn(name = "exercise_id"))
    private Exercise exercise;

    @OneToMany(mappedBy = "exerciseBlock", cascade = CascadeType.ALL)
    private List<Approach> approach;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}
