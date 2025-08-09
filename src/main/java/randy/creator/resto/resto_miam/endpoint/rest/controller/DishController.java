package randy.creator.resto.resto_miam.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import randy.creator.resto.resto_miam.models.Dish;
import randy.creator.resto.resto_miam.service.DishService;

import java.util.List;

@RestController
public class DishController {
  private final DishService dishService;

  public DishController(DishService dishService) {
    this.dishService = dishService;
  }

  @GetMapping("/dish")
  public List<Dish> findAllDish() {
    return dishService.findAllDish();
  }
}
