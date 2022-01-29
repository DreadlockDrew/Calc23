package calculator.tests

import calculator.controller.{AdditionAction, EqualAction, NumberAction}
import calculator.model.Calculator
import org.scalatest._

class TestSample extends FunSuite {

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  test("Sample testing of the calculator") {
    val calculator: Calculator = new Calculator()

    new NumberAction(calculator, 1).handle(null)
    new NumberAction(calculator, 2).handle(null)


    val expected: Double = 17.0
    val actual: Double = calculator.displayNumber()
  }

}
