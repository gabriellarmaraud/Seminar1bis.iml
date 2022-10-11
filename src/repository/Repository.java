package repository;

import exceptions.NegativeWeightException;
import model.Entity;

import java.util.ArrayList;
import java.util.List;

public class Repository implements IRepository {
    private int size;
    private Entity[] entities;

    public Repository() {
        entities = new Entity[100];
        size = 0;
    }

    @Override
    public void add(Entity entity) throws NegativeWeightException {
        if (entity.getWeight() < 0) {
            throw new NegativeWeightException();
        }

        entities[size] = entity;
        size++;
    }

    @Override
    public void remove(Entity entity) {

    }

    @Override
    public Entity[] getAll() {
        return entities;
    }

    @Override
    public List<Entity> getAllWithWeightGreaterThan() {
        var filterEntities = new ArrayList<Entity>();

        for (int i = 0; i < size; i++) {
            var entity = entities[i];

            if (entity.getWeight() >= 200) {
                filterEntities.add(entity);
            }
        }

        return filterEntities;
    }
}
