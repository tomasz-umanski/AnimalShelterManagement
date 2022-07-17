package pl.tomek.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
class AnimalControllerImpl implements AnimalController {

    private final Persistence persistence;

    @Autowired
    public AnimalControllerImpl(Persistence persistence) {
        this.persistence = persistence;
    }

    @Override
    public Animal registerAnimal(Animal animal) {
        return persistence.save(animal);
    }

    @Override
    public Optional<Animal> findAnimalById(Long id) {
        return persistence.findById(id);
    }
}
