package pl.tomek.web;

import pl.tomek.domain.Animal;

class AnimalInputDTO {
    private String name;

    public AnimalInputDTO(String name) {
        this.name = name;
    }

    public AnimalInputDTO() {}

    static Animal toDomain(AnimalInputDTO animalInputDTO) {
        return new Animal(null, animalInputDTO.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
