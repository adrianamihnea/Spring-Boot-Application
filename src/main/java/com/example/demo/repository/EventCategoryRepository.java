package com.example.codingevents.data;

import com.example.codingevents.models.EventCategory;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {
}
