package calculator.model.OperationProtocols

import calculator.model.Calculator

class Subtraction (calculator: Calculator) extends operationCalled {
  def operationFunction(): Double ={calculator.lastInput - calculator.displayField  }

}
