package randy.creator.resto.resto_miam.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
public class Ingredient {
  private final Long id;
  private final Long unitPrice;
  private String name;
  private Instant mostRecentModification;
  private Unit unit;
}
