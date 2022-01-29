package calculator.model.numberInsertions

import calculator.model.Calculator

class WholeNumberInsertion(calculator: Calculator) extends numberProtocol {
def insertNum(input:Int):Unit = {
  calculator.displayField = (calculator.displayField * 10 + input )
}

  def AlterInsertionProtocol():Unit =
  {
    calculator.numberInsertionProtocol = new RationalNumberInsertionBaseCase(calculator)
  }

}
