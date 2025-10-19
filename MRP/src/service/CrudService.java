package service;

import model.MediaModel;
import persistence.CrudRepository;

public abstract class CrudService<T extends MediaModel> {

    private final CrudRepository<T> crudRepository;
    protected CrudService(CrudRepository<T> crudRepository) {
        this.crudRepository = crudRepository;
    }

}
