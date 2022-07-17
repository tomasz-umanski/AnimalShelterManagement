package pl.tomek.web;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public interface AnimalApi {
    @PostMapping("/animal")
    AnimalOutputDTO registerAnimal(@RequestBody AnimalInputDTO animalInputDTO);

    @GetMapping("/animal/{id}")
    Optional<AnimalOutputDTO> getAnimalById(@PathVariable Long id);
}
