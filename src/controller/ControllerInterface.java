package controller;

public interface ControllerInterface<E, I> {
    E save(E entity);
    E findById(I id);
}
