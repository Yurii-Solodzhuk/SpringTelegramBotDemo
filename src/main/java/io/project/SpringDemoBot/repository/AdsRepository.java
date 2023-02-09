package io.project.SpringDemoBot.repository;

import io.project.SpringDemoBot.model.Ads;
import org.springframework.data.repository.CrudRepository;

public interface AdsRepository extends CrudRepository<Ads, Long> {
}
