package com.TsoyDmitriy.FitDaily.domain.dictionary;

import com.TsoyDmitriy.FitDaily.abstraction.model.AbstractDictionary;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "d_muscle")
@Data
@RequiredArgsConstructor
public class Muscle extends AbstractDictionary {

    @ManyToOne(fetch = FetchType.EAGER)
    private MuscleGroup muscleGroup;
}
