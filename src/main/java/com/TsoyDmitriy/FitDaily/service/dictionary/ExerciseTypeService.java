package com.TsoyDmitriy.FitDaily.service.dictionary;

import com.TsoyDmitriy.FitDaily.abstraction.service.AbstractDictionaryService;
import com.TsoyDmitriy.FitDaily.domain.dictionary.ExerciseType;
import com.TsoyDmitriy.FitDaily.repository.dictionary.ExerciseTypeRepo;
import org.springframework.stereotype.Service;

@Service
public class ExerciseTypeService extends AbstractDictionaryService<ExerciseType, ExerciseTypeRepo> {

    public ExerciseTypeService(ExerciseTypeRepo repo) {
        super(repo);
    }
}
