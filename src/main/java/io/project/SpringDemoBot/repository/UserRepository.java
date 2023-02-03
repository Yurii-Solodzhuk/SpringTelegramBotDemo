package io.project.SpringDemoBot.repository;

import io.project.SpringDemoBot.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
