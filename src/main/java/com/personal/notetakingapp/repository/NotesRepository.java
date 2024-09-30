package com.personal.notetakingapp.repository;

import com.personal.notetakingapp.model.Notes;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends ElasticsearchRepository<Notes, String> {
}
