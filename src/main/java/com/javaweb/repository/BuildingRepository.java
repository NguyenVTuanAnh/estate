package com.javaweb.repository;

import com.javaweb.entity.BuildingEntity;
import com.javaweb.entity.UserEntity;
import com.javaweb.repository.custom.BuildingRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BuildingRepository extends JpaRepository<BuildingEntity, Long>, BuildingRepositoryCustom {
    void deleteByidIn(List<Long> ids);
    void deleteByIdIn(List<Long> ids);
}
