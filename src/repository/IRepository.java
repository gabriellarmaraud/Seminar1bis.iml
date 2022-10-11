package repository;

import exceptions.NegativeWeightException;
import model.Entity;

import java.util.List;

public interface IRepository {
    void add(Entity entity) throws NegativeWeightException;

    void remove(Entity entity);

    Entity[] getAll();

    List<Entity> getAllWithWeightGreaterThan();
}
