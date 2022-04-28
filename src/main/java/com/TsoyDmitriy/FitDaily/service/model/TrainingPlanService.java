package com.TsoyDmitriy.FitDaily.service.model;

import com.TsoyDmitriy.FitDaily.domain.model.TrainingPlan;
import com.TsoyDmitriy.FitDaily.repository.model.TrainingPlanRepo;
import com.TsoyDmitriy.FitDaily.service.exception.MyExpectationFailedException;
import com.TsoyDmitriy.FitDaily.service.exception.MyNoContentException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainingPlanService {

    private final TrainingPlanRepo trainingPlanRepo;

    public TrainingPlan findById(Long id) {
        return trainingPlanRepo.findById(id).orElseThrow(() -> new MyNoContentException("По вашему запросу упражнение не найдено"));
    }

    public List<TrainingPlan> findAll() {
        if(trainingPlanRepo.findAll().isEmpty()) {
            throw new MyNoContentException("В списке упражнений пусто");
        }
        return trainingPlanRepo.findAll();
    }

    public TrainingPlan save(TrainingPlan trainingPlan) {
        return trainingPlanRepo.save(trainingPlan);
    }

    public void delete(Long id) {
        trainingPlanRepo.deleteById(id);
        if(trainingPlanRepo.findById(id).isPresent()) {
            throw new MyExpectationFailedException("Не удалось удалить запись об упражнении");
        }
    }
}
