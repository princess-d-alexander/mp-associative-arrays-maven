package edu.grinnell.csc207;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import edu.grinnell.csc207.util.AssociativeArray;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Princess Alexander
 */
public class TestsFromStudent {
  /**
   * A simple test.
   */
  @Test
  public void alwaysPass() throws Exception {
  } // alwaysPass()

/**
   * Test for removing an existing key and checking the removal was successful.
   */
  @Test
  public void alexanderPrincessTest1() throws Exception {
    // Create an associative array and add a key-value pair
    AssociativeArray<String, String> associativeArray = new AssociativeArray<>();
    associativeArray.set("owl", "animal");

    // Remove the key
    associativeArray.remove("owl");

    // Ensure the key no longer exists in the array
    assertFalse(associativeArray.hasKey("owl"));
  }

  /**
   * Test for checking the size of the associative array after adding and removing values.
   */
  @Test
  public void alexanderPrincessTest2() throws Exception {
    // Create an associative array and add key-value pairs
    AssociativeArray<String, String> associativeArray = new AssociativeArray<>();
    associativeArray.set("strawberry", "fruit");
    associativeArray.set("cat", "animal");

    // Verify the size is updated correctly
    assertEquals(2, associativeArray.size());

    // Remove one key and verify the size decreases
    associativeArray.remove("strawberry");
    assertEquals(1, associativeArray.size());
  }

  /**
   * Edge case: Test for removing a key that does not exist in the array.
   */
  @Test
  public void alexanderPrincessEdge1() {
    // Create an empty associative array
    AssociativeArray<String, String> associativeArray = new AssociativeArray<>();

    // Try to remove a non-existent key and ensure no exception is thrown
    assertDoesNotThrow(() -> associativeArray.remove("nonExistentKey"));

    // Ensure the size is still zero after attempting to remove a non-existent key
    assertEquals(0, associativeArray.size());
  }

  /**
   * Test for removing an existing key and checking the removal was successful.
   */
  @Test
  public void alexanderPrincessTest3() throws Exception {
    // Create an associative array and add a key-value pair
    AssociativeArray<String, String> associativeArray = new AssociativeArray<>();
    associativeArray.set("cat", "animal");

    // Remove the key
    associativeArray.remove("cat");

    // Ensure the key no longer exists in the array
    assertFalse(associativeArray.hasKey("cat"));
  }

  /**
   * Test for checking the size of the associative array after adding and removing values.
   */
  @Test
  public void alexanderPrincessTest4() throws Exception {
    // Create an associative array and add key-value pairs
    AssociativeArray<String, String> associativeArray = new AssociativeArray<>();
    associativeArray.set("strawberry", "fruit");
    associativeArray.set("owl", "animal");

    // Verify the size is updated correctly
    assertEquals(2, associativeArray.size());

    // Remove one key and verify the size decreases
    associativeArray.remove("strawberry");
    assertEquals(1, associativeArray.size());
  }

  /**
   * Edge case: Test for removing a key that does not exist in the array.
   */
  @Test
  public void alexanderPrincessEdge2() {
    // Create an empty associative array
    AssociativeArray<String, String> associativeArray = new AssociativeArray<>();

    // Try to remove a non-existent key and ensure no exception is thrown
    assertDoesNotThrow(() -> associativeArray.remove("nonExistentKey"));

    // Ensure the size is still zero after attempting to remove a non-existent key
    assertEquals(0, associativeArray.size());
  }

  /**
   * Edge case: Test for setting a key with a null value.
   */
  @Test
  public void alexanderPrincessEdge3() throws Exception {
    // Create an associative array
    AssociativeArray<String, String> associativeArray = new AssociativeArray<>();

    // Set a key with a null value
    associativeArray.set("nullKey", null);

    // Ensure the key exists and its value is null
    assertTrue(associativeArray.hasKey("nullKey"));
    assertNull(associativeArray.get("nullKey"));
  }


} // class TestsFromSam
