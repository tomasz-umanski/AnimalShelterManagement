package pl.tomek.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pl.tomek.domain.Animal;
import pl.tomek.domain.AnimalController;

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
        AnimalOutputDTO animalOutputDTO = AnimalOutputDTO.fromDomain(animal);
        return animalOutputDTO;
    }
}
