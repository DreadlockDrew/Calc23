package calculator.controller

import calculator.model.Calculator
import javafx.event.{ActionEvent, EventHandler}

/*
* these methods are called upon a click
* */
class EqualAction(calculator: Calculator) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit =
  {
    calculator.executeOperation()
  }
}

class ClearAction(calculator: Calculator) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    calculator.clearCalculator()
  }
}

class DecimalAction(calculator: Calculator) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit =
  {
    calculator.AlterInsertionProtocol()
  }
}

class NumberAction(calculator: Calculator, number: Int) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit =
  {
    /*this is where the numbers are input*/
    calculator.insertNumberAboutNumberField(number)
  }
}

class AdditionAction(calculator: Calculator) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit =
  {calculator.setOperationAboutAddition()}
}

class SubtractionAction(calculator: Calculator) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    calculator.setOperationAboutSubtraction()
  }
}

class MultiplicationAction(calculator: Calculator) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    calculator.setOperationAboutMultiplication()
  }
}

class DivisionAction(calculator: Calculator) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    calculator.setOperationAboutDivision()
  }
}
