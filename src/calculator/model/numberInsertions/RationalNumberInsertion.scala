package calculator.model.numberInsertions

import calculator.model.Calculator

class RationalNumberInsertion(calculator: Calculator) extends numberProtocol {


  def insertNum(input:Int):Unit =
  {
    println("rational number insertion")

    calculator.displayField = (calculator.displayField.toString + input.toString).toDouble
  }

  def AlterInsertionProtocol():Unit =
  {}

}

