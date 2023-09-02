/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuanpnt17.mathutil.test.core;

import com.tuanpnt17.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TuanPNTSE173039
 */
public class MathUtilTest {

  // viết code để test code chính bên kia
  @Test
  public void testGetFactorialGivenRightArgumentReturnWell() {
    int n = 0;
    long expected = 1;
    long actual = MathUtil.getFactorial(n);

    // so sánh dùng framwork
    assertEquals(expected, actual);
  }

  //Màu đỏ: do ném đúng ngoại lệ nhma ngoại lệ ko theo kì vọng
//  @Test(expected = NumberFormatException.class)
//  public void testGetFactorialGivenWrongArgumentThrowsException() {
//    int n = -5;
//    MathUtil.getFactorial(n);
//  }
  //Màu xanh
  @Test(expected = IllegalArgumentException.class)
  public void testGetFactorialGivenWrongArgumentThrowsException() {
    int n = -5;
    MathUtil.getFactorial(n);
  }

  //Cách khác để bắt ngoại lệ, viết tự nhiên hơn -> dùng lambda expression
  //@Test
  //public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
  /*
    assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
   */
  //}
  @Test
  public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
    try {
      int n = -5;
      MathUtil.getFactorial(n);
    } catch (Exception e) {
      assertEquals("Invalid argurment", e.getMessage());
    }
  }

}
