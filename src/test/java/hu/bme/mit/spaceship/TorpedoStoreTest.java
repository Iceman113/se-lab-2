package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

  @Test
  void fire_Success(){
    // Arrange
    TorpedoStore store = new TorpedoStore(1);

    // Act
    boolean result = store.fire(1);

    // Assert
    assertEquals(true, result);

    
  }
  @Test

  void empty_Check(){
    TorpedoStore store = new TorpedoStore(0);
    assertEquals(true, store.isEmpty());
  }

  @Test
  void getTorpedoCount_Works(){
    TorpedoStore store = new TorpedoStore(1);
    assertEquals(1, store.getTorpedoCount());
  }
  @Test
  void fire_DeniedByFailure(){

    TorpedoStore store = new TorpedoStore(1, 100.0);

    // Act
    boolean result = store.fire(1);

    // Assert
    assertEquals(false, result);

  }

  @Test
  void fire_DeniedByNegativeTorpedo(){
    TorpedoStore store = new TorpedoStore(-1);

    // Act
    boolean result = store.fire(1);

    // Assert
    assertEquals(false, result);
  }

}


