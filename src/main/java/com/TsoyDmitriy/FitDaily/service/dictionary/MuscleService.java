package com.TsoyDmitriy.FitDaily.service.dictionary;

import com.TsoyDmitriy.FitDaily.abstraction.service.AbstractDictionaryService;
import com.TsoyDmitriy.FitDaily.domain.dictionary.Muscle;
import com.TsoyDmitriy.FitDaily.repository.dictionary.MuscleRepo;
import org.springframework.stereotype.Service;

@Service
public class MuscleService extends AbstractDictionaryService<Muscle, MuscleRepo> {

    public MuscleService(MuscleRepo repo) {
        super(repo);
    }
}
