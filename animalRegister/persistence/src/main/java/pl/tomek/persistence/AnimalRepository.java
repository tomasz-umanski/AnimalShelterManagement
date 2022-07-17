package pl.tomek.persistence;

import java.util.Optional;

public interface AnimalRepository {

    void save(AnimalEntity animalEntity);

    Optional<AnimalEntity> findById(Long id);
}
