package pl.tomek.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pl.tomek.domain.Animal;
import pl.tomek.domain.AnimalController;

import java.util.Optional;

@RestController
class AnimalApiImpl implements AnimalApi {

    private final AnimalController animalController;

    @Autowired
    AnimalApiImpl(AnimalController animalController) {
        this.animalController = animalController;
    }

    @Override
    public AnimalOutputDTO registerAnimal(AnimalInputDTO animalInputDTO) {
        Animal animal = AnimalInputDTO.toDomain(animalInputDTO);
        animal = animalController.registerAnimal(animal);
        return AnimalOutputDTO.fromDomain(animal);
    }

    @Override
    public Optional<AnimalOutputDTO> getAnimalById(AnimalInputIdDTO animalInputIdDTO) {
        Optional<Animal> optionalAnimal = animalController.findAnimalById(animalInputIdDTO.getId());
        if(!optionalAnimal.isPresent()) {
            return Optional.empty();
        }
        Animal animal = optionalAnimal.get();
        AnimalOutputDTO animalOutputDTO = AnimalOutputDTO.fromDomain(animal);
        return Optional.of(animalOutputDTO);
    }
}
