package com.TsoyDmitriy.FitDaily.domain.dictionary;

import com.TsoyDmitriy.FitDaily.abstraction.model.AbstractDictionary;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "d_exercise_type")
@RequiredArgsConstructor
public class ExerciseType extends AbstractDictionary {
}
