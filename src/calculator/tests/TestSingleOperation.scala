package calculator.tests

import calculator.controller._
import calculator.model.Calculator
import calculator.model.OperationProtocols.Subtraction
import org.scalatest.FunSuite

class TestSingleOperation extends FunSuite{

  val EPSILON: Double = 0.000001
  def equalDoubles(d1: Double, d2: Double): Boolean =
  {
    (d1 - d2).abs < EPSILON
  }

  test("Addition Test")
  {
    val calculator: Calculator = new Calculator()
    new NumberAction(calculator, 2).handle(null)
    new AdditionAction(calculator).handle(null)
    new NumberAction(calculator, 1).handle(null)
    new EqualAction(calculator).handle(null)

    val expected: Double = 3
    val actual: Double = calculator.displayNumber()
    assert(equalDoubles(actual, expected), actual)
  }

  test("Subtraction Test")
  {
    val calculator: Calculator = new Calculator()
    new NumberAction(calculator, 2).handle(null)
    new SubtractionAction(calculator).handle(null)
    new NumberAction(calculator, 1).handle(null)
    new EqualAction(calculator).handle(null)

    val expected: Double = 1
    val actual: Double = calculator.displayNumber()
    assert(equalDoubles(actual, expected), actual)
  }

  test("Multiplication Test")
  {
    val calculator: Calculator = new Calculator()
    new NumberAction(calculator, 9).handle(null)
    new MultiplicationAction(calculator).handle(null)
    new NumberAction(calculator, 2).handle(null)
    new EqualAction(calculator).handle(null)

    val expected: Double = 18
    val actual: Double = calculator.displayNumber()
    assert(equalDoubles(actual, expected), actual)
  }

  test("Division Test")
  {
    val calculator: Calculator = new Calculator()
    new NumberAction(calculator, 9).handle(null)
    new DivisionAction(calculator).handle(null)
    new NumberAction(calculator, 3).handle(null)
    new EqualAction(calculator).handle(null)

    val expected: Double = 3
    val actual: Double = calculator.displayNumber()
    assert(equalDoubles(actual, expected), actual)
  }

}
