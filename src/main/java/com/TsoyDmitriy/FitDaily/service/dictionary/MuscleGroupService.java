package com.TsoyDmitriy.FitDaily.service.dictionary;

import com.TsoyDmitriy.FitDaily.abstraction.service.AbstractDictionaryService;
import com.TsoyDmitriy.FitDaily.domain.dictionary.MuscleGroup;
import com.TsoyDmitriy.FitDaily.repository.dictionary.MuscleGroupRepo;
import org.springframework.stereotype.Service;

@Service
public class MuscleGroupService extends AbstractDictionaryService<MuscleGroup, MuscleGroupRepo> {

    public MuscleGroupService(MuscleGroupRepo repo) {
        super(repo);
    }
}
