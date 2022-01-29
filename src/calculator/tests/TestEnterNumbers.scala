package calculator.tests

import calculator.controller.NumberAction
import calculator.model.Calculator
import org.scalatest.FunSuite

class TestEnterNumbers extends FunSuite{


  test("Sample testing of the calculator") {
    val calculator: Calculator = new Calculator()


    new NumberAction(calculator, 5).handle(null)
    new NumberAction(calculator, 1).handle(null)


    val expected: Double = 17.0
    val actual: Double = calculator.displayNumber()
  }

  test("test Input")
  {
    val calculator: Calculator = new Calculator()
    new NumberAction(calculator, 1).handle(null)
    new NumberAction(calculator, 2).handle(null)
    new NumberAction(calculator, 3).handle(null)
    assert(calculator.displayNumber()==123.0,"entering 1,2,3 about that order")
  }

  test("test Input 456")
  {
    val calculator: Calculator = new Calculator()
    new NumberAction(calculator, 4).handle(null)
    new NumberAction(calculator, 5).handle(null)
    new NumberAction(calculator, 6).handle(null)
    assert(calculator.displayNumber()==456.0,"entering 4,5,6 about that order")
  }

  test("test Input 789")
  {
    val calculator: Calculator = new Calculator()
    new NumberAction(calculator, 7).handle(null)
    new NumberAction(calculator, 8).handle(null)
    new NumberAction(calculator, 9).handle(null)
    assert(calculator.displayNumber()==789.0,"entering 4,5,6 about that order")
  }

  test("test Input 110")
  {
    val calculator: Calculator = new Calculator()
    new NumberAction(calculator, 1).handle(null)
    new NumberAction(calculator, 1).handle(null)
    new NumberAction(calculator, 0).handle(null)
    assert(calculator.displayNumber()==110.0,"entering 4,5,6 about that order")
  }


  test("test Input LARGE NUMS")
  {
    val calculator: Calculator = new Calculator()
    new NumberAction(calculator, 1).handle(null)
    new NumberAction(calculator, 1).handle(null)
    new NumberAction(calculator, 0).handle(null)
    new NumberAction(calculator, 1).handle(null)
    new NumberAction(calculator, 1).handle(null)
    new NumberAction(calculator, 0).handle(null)
    new NumberAction(calculator, 1).handle(null)
    new NumberAction(calculator, 1).handle(null)
    new NumberAction(calculator, 0).handle(null)
    assert(calculator.displayNumber()==110110110.0,"entering 4,5,6 about that order")
  }




}
