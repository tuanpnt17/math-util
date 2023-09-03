/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuanpnt17.mathutil.test.core;

import com.tuanpnt17.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author TuanPNTSE173039
 */
//Cau lenh nay la cua JUnit bao hieu rang se can loop qua tap data de lay cac
//cap data input/expected nhoi vao ham test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

  // Ham nay ta se tra ve mang hai chieu gom nhieu cap Expected/Input
  @Parameterized.Parameters //JUnit se ngam loop qua tung dong cua mang de lay ra duoc cap data
  public static Object[][] initData() {
    return new Integer[][]{
      {0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}, {7, 1000}
    };
  }

  @Parameterized.Parameter(value = 0)
  public int n; //biến map với value của cột 0 của mảng

  @Parameterized.Parameter(value = 1)
  public long expected; //Kiểu long map với giá trị trả về của getFactorial()

  @Test
  public void testGetFactorial() {
    assertEquals(expected, MathUtil.getFactorial(n));
  }

}
