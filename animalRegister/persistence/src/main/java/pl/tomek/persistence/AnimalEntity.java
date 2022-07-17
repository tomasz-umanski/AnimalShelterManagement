package pl.tomek.persistence;

import pl.tomek.domain.Animal;

class AnimalEntity {

    private Long id;
    private String name;

    public AnimalEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    static AnimalEntity fromDomain(Animal animal) {
        return new AnimalEntity(animal.getId(), animal.getName());
    }

    static Animal toDomain(AnimalEntity animalEntity) {
        return new Animal(animalEntity.getId(), animalEntity.getName());
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
