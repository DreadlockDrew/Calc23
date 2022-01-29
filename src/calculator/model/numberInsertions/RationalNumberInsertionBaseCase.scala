package calculator.model.numberInsertions

import calculator.model.Calculator

class RationalNumberInsertionBaseCase(calculator: Calculator) extends numberProtocol {


  def insertNum(input:Int):Unit =
  {
    println("rational number insertion")

    calculator.displayField = (calculator.displayField.toString.dropRight(1) + input.toString).toDouble
    calculator.numberInsertionProtocol = new RationalNumberInsertion(calculator)
  }

  def AlterInsertionProtocol():Unit =
  {}

}

