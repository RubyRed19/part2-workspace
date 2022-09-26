package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {


  private final Television tv1 = new Television(("Samsung", 0, DisplayType.LED);

  @Test
  public void testSetVolume() {
    assertEquals(50, tv1.getVolume());
  }

  @Test(expected=IllegalArgumentException.class)
  public void setVolumeIllegalException() {
  }

  @Test
  public void testChangeChannel() {
    int channel = (Television.MIN_CHANNEL + Television.MIN_CHANNEL)
  }

  @Test
  public void testChangeInvalidChannelException() {

  }

  @Test
  public void testCompareTo() {
  }

  @Test
  public void testHashCode() {

  }

  @Test
  public void testEquals() {
  }
}