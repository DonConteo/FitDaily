package com.TsoyDmitriy.FitDaily.repository.model;

import com.TsoyDmitriy.FitDaily.domain.model.TrainingPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TrainingPlanRepo extends JpaRepository<TrainingPlan, Long> {

    @Modifying
    @Transactional
    void deleteById(Long id);
}
