package pl.tomek.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
class AnimalControllerImpl implements AnimalController {

    private final Persistence persistence;

    @Autowired
    public AnimalControllerImpl(Persistence persistence) {
        this.persistence = persistence;
    }

    @Override
    public Animal registerAnimal(Animal animal) {
        animal = persistence.save(animal);
        return animal;
    }
}
