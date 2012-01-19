package com.puzz.expressive;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;

import org.junit.Test;

public class Oddity {

   /**
    * WRONG: if <b>i</b> is negative will return wrong result
    */
   public static boolean isOdd(int i) {
      return i % 2 == 1;
      // correct:
      // return i % 2 != 0; 
      // return (i & 1) != 0; - much faster
   }

   @Test
   public void testIsOdd() {
      assertFalse(isOdd(0));
      assertTrue(isOdd(1));
      assertFalse(isOdd(2));
      assertTrue(isOdd(3));
      assertFalse(isOdd(4));

      // boom
      assertTrue(isOdd(-1));
   }
}
