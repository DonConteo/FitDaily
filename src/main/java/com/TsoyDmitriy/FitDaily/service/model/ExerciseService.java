package com.TsoyDmitriy.FitDaily.service.model;

import com.TsoyDmitriy.FitDaily.domain.model.Exercise;
import com.TsoyDmitriy.FitDaily.repository.model.ExerciseRepo;
import com.TsoyDmitriy.FitDaily.service.exception.MyExpectationFailedException;
import com.TsoyDmitriy.FitDaily.service.exception.MyNoContentException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExerciseService {

    private final ExerciseRepo exerciseRepo;

    public Exercise findById(Long id) {
        return exerciseRepo.findById(id).orElseThrow(() -> new MyNoContentException("По вашему запросу упражнение не найдено"));
    }

    public List<Exercise> findAll() {
        if(exerciseRepo.findAll().isEmpty()) {
            throw new MyNoContentException("В списке упражнений пусто");
        }
        return exerciseRepo.findAll();
    }

    public Exercise save(Exercise exercise) {
        return exerciseRepo.save(exercise);
    }

    public void delete(Long id) {
        exerciseRepo.deleteById(id);
        if(exerciseRepo.findById(id).isPresent()) {
            throw new MyExpectationFailedException("Не удалось удалить запись об упражнении");
        }
    }
}
