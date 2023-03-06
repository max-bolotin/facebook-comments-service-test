package appsfactory.facebook.comments.repository.factory;

public interface ModelFactory<T, E> {
  T toEntity(E model);

  E toModel(T entity);
}
