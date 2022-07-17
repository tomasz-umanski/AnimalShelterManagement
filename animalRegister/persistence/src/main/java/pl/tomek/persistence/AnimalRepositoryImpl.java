package pl.tomek.persistence;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Component
class AnimalRepositoryImpl implements AnimalRepository {

    private final AtomicLong counter = new AtomicLong(0L);
    private final List<AnimalEntity> data = new ArrayList<>();

    @Override
    public AnimalEntity save(AnimalEntity animalEntity) {
        animalEntity.setId(this.counter.incrementAndGet());
        this.data.add(animalEntity);
        return animalEntity;
    }
}
