package randy.creator.resto.resto_miam.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Dish {
  private final Long id;
  private final Long unitPrice;
  private String name;
  private List<Ingredient> ingredientList;
}
