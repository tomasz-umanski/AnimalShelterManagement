package pl.tomek.persistence;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Component
class AnimalRepositoryImpl implements AnimalRepository {

    private final AtomicLong counter = new AtomicLong(0L);
    private final List<AnimalEntity> data = new ArrayList<>();

    @Override
    public void save(AnimalEntity animalEntity) {
        animalEntity.setId(this.counter.incrementAndGet());
        this.data.add(animalEntity);
    }

    @Override
    public Optional<AnimalEntity> findById(Long id) {
        return this.data.stream().filter(animalEntity -> animalEntity.getId().equals(id)).findFirst();
    }
}
