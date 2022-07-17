package pl.tomek.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.tomek.domain.Animal;
import pl.tomek.domain.Persistence;

import java.util.Optional;

@Component
class PersistenceImpl implements Persistence {

    private final AnimalRepository animalRepository;

    @Autowired
    public PersistenceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public Animal save(Animal animal) {
        AnimalEntity animalEntity = AnimalEntity.fromDomain(animal);
        this.animalRepository.save(animalEntity);
        animal = AnimalEntity.toDomain(animalEntity);
        return animal;
    }

    @Override
    public Optional<Animal> findById(Long id) {
        Optional<AnimalEntity> optionalAnimalEntity = this.animalRepository.findById(id);
        if(!optionalAnimalEntity.isPresent()) {
            return Optional.empty();
        }
        AnimalEntity animalEntity = optionalAnimalEntity.get();
        Animal animal = AnimalEntity.toDomain(animalEntity);
        return Optional.of(animal);
    }
}
