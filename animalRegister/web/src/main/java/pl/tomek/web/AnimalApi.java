package pl.tomek.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AnimalApi {
    @PostMapping("/animal")
    AnimalOutputDTO registerAnimal(@RequestBody AnimalInputDTO animalInputDTO);
}
