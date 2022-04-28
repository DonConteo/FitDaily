package com.TsoyDmitriy.FitDaily.service.model;

import com.TsoyDmitriy.FitDaily.domain.model.ExerciseBlock;
import com.TsoyDmitriy.FitDaily.repository.model.ExerciseBlockRepo;
import com.TsoyDmitriy.FitDaily.service.exception.MyExpectationFailedException;
import com.TsoyDmitriy.FitDaily.service.exception.MyNoContentException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExerciseBlockService {

    private final ExerciseBlockRepo exerciseBlockRepo;

    public ExerciseBlock findById(Long id) {
        return exerciseBlockRepo.findById(id).orElseThrow(() -> new MyNoContentException("По вашему запросу блок упражнения не найден"));
    }

    public List<ExerciseBlock> findAll() {
        if(exerciseBlockRepo.findAll().isEmpty()) {
            throw new MyNoContentException("В списке блоков упражнений пусто");
        }
        return exerciseBlockRepo.findAll();
    }

    public ExerciseBlock save(ExerciseBlock exerciseBlock) {
        return exerciseBlockRepo.save(exerciseBlock);
    }

    public void delete(Long id) {
        exerciseBlockRepo.deleteById(id);
        if(exerciseBlockRepo.findById(id).isPresent()) {
            throw new MyExpectationFailedException("Не удалось удалить запись о блоке упражнения");
        }
    }
}
