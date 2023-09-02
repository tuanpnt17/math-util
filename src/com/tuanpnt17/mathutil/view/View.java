/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuanpnt17.mathutil.view;

import com.tuanpnt17.mathutil.core.MathUtil;

/**
 *
 * @author TuanPNTSE173039
 */
public class View {

  public static void main(String[] args) {
    long expected = 120;
    int n = 5;
    long actual = MathUtil.getFactorial(n);
    System.out.println("Expected " + n + "! = " + expected);
    System.out.println("Actual " + n + "! = " + actual);

  }
}
