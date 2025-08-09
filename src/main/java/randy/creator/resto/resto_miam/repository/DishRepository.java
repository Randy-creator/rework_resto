package randy.creator.resto.resto_miam.repository;

import org.springframework.stereotype.Repository;
import randy.creator.resto.resto_miam.repository.configuration.Datasource;

@Repository
public class DishRepository {
  private final Datasource db;

  public DishRepository(Datasource db) {
    this.db = db;
  }
}
