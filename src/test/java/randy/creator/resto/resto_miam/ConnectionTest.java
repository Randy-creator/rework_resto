package randy.creator.resto.resto_miam;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import randy.creator.resto.resto_miam.repository.Datasource;

@Slf4j
public class ConnectionTest {

  @Test
  public void TestConnection() {
    Datasource db = new Datasource();
    Assertions.assertNotNull(db.getConnection());
  }
}
