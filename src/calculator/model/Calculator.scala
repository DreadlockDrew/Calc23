package calculator.model

import calculator.model.OperationProtocols._
import calculator.model.numberInsertions.{RationalNumberInsertionBaseCase, WholeNumberInsertion}


class Calculator() {

  // Accessed by View. This method will be called throughout testing to check when the correct value
  // will appear on the calculator
  var lastInput = 0.0
  var displayField:Double = 0
  var operationType:operationCalled = new noOperation(this)
  var numberInsertionProtocol:numberInsertions.numberProtocol = new WholeNumberInsertion(this)

  def displayNumber(): Double =
  {
    displayField
  }

  def AlterInsertionProtocol():Unit =
  {
    numberInsertionProtocol.AlterInsertionProtocol()
  }

  def insertNumberAboutNumberField(input:Int):Unit =
  {
    numberInsertionProtocol.insertNum(input)
  }
  def setOperationAboutAddition():Unit =
  {
   operationType = new Addition(this)
    preserveHistory()
    numberInsertionProtocol = new WholeNumberInsertion(this)

 }
  def setOperationAboutSubtraction():Unit =
  {
    operationType = new Subtraction(this)
    preserveHistory()
    numberInsertionProtocol = new WholeNumberInsertion(this)

  }
  def setOperationAboutMultiplication():Unit =
  { operationType = new Multiplication(this)
    preserveHistory()
    numberInsertionProtocol = new WholeNumberInsertion(this)}
  def setOperationAboutDivision():Unit =
  {    operationType = new Division(this)
    preserveHistory()
    numberInsertionProtocol = new WholeNumberInsertion(this)}
  def setOperationAboutNothing():Unit =
  {
    this.operationType = new noOperation(this)
  }

  def executeOperation():Unit =
  {
    this.displayField = this.operationType.operationFunction()
    /* computes the function on the number in the text field and the number last pressed */
    this.operationType = new noOperation(this)
    numberInsertionProtocol = new WholeNumberInsertion(this)
  }
  def clearCalculator():Unit =
  {
      operationType = new noOperation(this)
      lastInput = 0.0
      displayField = 0
      this.numberInsertionProtocol = new WholeNumberInsertion(this)
    }
  def preserveHistory():Unit=
  {lastInput = displayField
  displayField = 0}

}
