package pl.tomek.domain;

import java.util.Optional;

public interface Persistence {
    Animal save(Animal animal);

    Optional<Animal> findById(Long id);
}
