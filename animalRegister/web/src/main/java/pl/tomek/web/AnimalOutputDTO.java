package pl.tomek.web;

import pl.tomek.domain.Animal;

class AnimalOutputDTO {
    private Long id;
    private String name;

    public AnimalOutputDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    static AnimalOutputDTO fromDomain (Animal animal) {
        return new AnimalOutputDTO(animal.getId(), animal.getName());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
