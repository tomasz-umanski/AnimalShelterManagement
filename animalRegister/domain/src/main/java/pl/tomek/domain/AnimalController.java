package pl.tomek.domain;

import java.util.Optional;

public interface AnimalController {

    Animal registerAnimal(Animal animal);

    Optional<Animal> findAnimalById(Long id);
}
