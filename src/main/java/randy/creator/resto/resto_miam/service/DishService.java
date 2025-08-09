package randy.creator.resto.resto_miam.service;

import org.springframework.stereotype.Service;
import randy.creator.resto.resto_miam.models.Dish;
import randy.creator.resto.resto_miam.repository.DishRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DishService {
  private final DishRepository dishRepository;

  public DishService(DishRepository dishRepository) {
    this.dishRepository = dishRepository;
  }

  public List<Dish> findAllDish() {
    Dish hotdog = new Dish(1l, 15_000l, "Hot dog", new ArrayList<>());
    return List.of(hotdog);
  }
}
