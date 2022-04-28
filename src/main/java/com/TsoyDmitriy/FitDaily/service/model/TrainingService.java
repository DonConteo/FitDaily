package com.TsoyDmitriy.FitDaily.service.model;

import com.TsoyDmitriy.FitDaily.domain.model.Training;
import com.TsoyDmitriy.FitDaily.repository.model.TrainingRepo;
import com.TsoyDmitriy.FitDaily.service.exception.MyExpectationFailedException;
import com.TsoyDmitriy.FitDaily.service.exception.MyNoContentException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainingService {

    private final TrainingRepo trainingRepo;

    public Training findById(Long id) {
        return trainingRepo.findById(id).orElseThrow(() -> new MyNoContentException("По вашему запросу тренировочный план не найдено"));
    }

    public List<Training> findAll() {
        if(trainingRepo.findAll().isEmpty()) {
            throw new MyNoContentException("В списке тренировочных планов пусто");
        }
        return trainingRepo.findAll();
    }

    public Training save(Training training) {
        return trainingRepo.save(training);
    }

    public void delete(Long id) {
        trainingRepo.deleteById(id);
        if(trainingRepo.findById(id).isPresent()) {
            throw new MyExpectationFailedException("Не удалось удалить запись о тренировочном плане");
        }
    }
}
