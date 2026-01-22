package com.example.straffic.dashboard.repository;

import com.example.straffic.dashboard.entity.PageViewHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface PageViewHistoryRepository extends JpaRepository<PageViewHistoryEntity, Long> {
    long countByPageNameAndViewedAtBetween(String pageName, LocalDateTime start, LocalDateTime end);
}
