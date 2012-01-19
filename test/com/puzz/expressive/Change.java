package com.puzz.expressive;

import junit.framework.Assert;

import org.junit.Test;

public class Change {

   /**
    * Not all decimals can be represented exactly using binary floating-point.
    * The result is the closest double value to 0.9.s
    * 
    * Solution: use BigDecimal for monetary calculations.
    * @return
    */
   public static double change() {
      return 2.00 - 1.10;
      // (!) do not use new BigDecimal((double here)1.0) as it will construct value 1.000000000000000055511151231257....
      //return new BigDecimal("2.0").subtract(new BigDecimal("1.1")).doubleValue();
   }

   @Test
   public void testChange() {
      // Wrong: returns 0.899999..
      Assert.assertEquals(0.90, change());
   }
}
