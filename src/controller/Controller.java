package controller;

import exceptions.NegativeWeightException;
import model.Entity;
import repository.IRepository;

import java.util.List;

public class Controller {
    private IRepository repository;

    public Controller(IRepository repository) {
        this.repository = repository;
    }

    public void add(Entity entity) {
        try {
            repository.add(entity);
        } catch (NegativeWeightException e) {
            System.out.println("Negative weight error!!!");
        }
    }

    public void remove(Entity entity) {
        repository.remove(entity);
    }

    public Entity[] getAll() {
        return repository.getAll();
    }

    public List<Entity> getAllWithWeightGreaterThan() {
        return repository.getAllWithWeightGreaterThan();
    }
}
