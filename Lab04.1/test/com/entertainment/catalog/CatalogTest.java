/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.entertainment.catalog;

import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Map;
import org.junit.Test;
import com.entertainment.Television;

public class CatalogTest {
  
  /**
   * Contract: a no-matches result should be an empty collection (not null).
   */
  @Test
  public void testFindByBrandNoMatches() {
    Collection<Television> tvs = Catalog.findByBrand("NO-MATCHES");
    assertNotNull(tvs);
    assertTrue(tvs.isEmpty());
  }

  @Test
  public void testFindByBrandWithMatches() {
    Collection<Television> tvs = Catalog.findByBrand("Sony");
    assertNotNull(tvs);
    assertFalse(tvs.isEmpty());
    assertEquals(7, tvs.size());
  }

  @Test
  public void testFindByBrands_NoBrands() {
    Map<String, Collection<Television>> catalogSelection = Catalog.findByBrands();
    assertNotNull(catalogSelection);
    assertTrue(catalogSelection.isEmpty());
    //fail("Test not yet implemented");
  }

  @Test
  public void testFindByBrands_SomeBrands() {
    var catalogSelection = Catalog.findByBrands("Sony", "Zenith", "NO-MATCHES");
    assertNotNull(catalogSelection);
    assertFalse(catalogSelection.isEmpty());
    assertEquals(3, catalogSelection.size());
    assertEquals(7, catalogSelection.get("Sony").size());
    assertEquals(9, catalogSelection.get("Zenith").size());
    assertTrue(catalogSelection.get("NO-MATCHES").isEmpty());

  }
}