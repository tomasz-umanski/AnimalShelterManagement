package pl.tomek.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

public interface AnimalApi {
    @PostMapping("/animal")
    AnimalOutputDTO registerAnimal(@RequestBody AnimalInputDTO animalInputDTO);

    @GetMapping("/animal")
    Optional<AnimalOutputDTO> getAnimalById(@RequestBody AnimalInputIdDTO animalInputIdDTO);
}
