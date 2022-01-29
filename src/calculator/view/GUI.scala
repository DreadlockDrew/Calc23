package calculator.view

import calculator.controller._
import calculator.model.Calculator
import javafx.scene.input.MouseEvent
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.TextField
import scalafx.scene.layout.GridPane



object GUI extends JFXApp {

  val calculator = new Calculator()

  var textField: TextField = new TextField {
    editable = false
    style = "-fx-font: 26 ariel;"
    text.value = calculator.displayNumber().toString
  }

  stage = new PrimaryStage {
    title = "Calculator"
    scene = new Scene() {
      content = List(
        new GridPane {
          hgap = 0.0
          vgap = 0.0

          add(textField, 0, 0, 4, 1)
          add(new CalculatorButton("c", new ClearAction(calculator)), 0, 1)
          add(new CalculatorButton("/", new DivisionAction(calculator)), 1, 1)
          add(new CalculatorButton("*", new MultiplicationAction(calculator)), 2, 1)
          add(new CalculatorButton("-", new SubtractionAction(calculator)), 3, 1)
          add(new CalculatorButton("+", new AdditionAction(calculator), yScale = 2.0), 3, 2, 1, 2)
          add(new CalculatorButton("=", new EqualAction(calculator), yScale = 2.0), 3, 4, 1, 2)

          add(new CalculatorButton("7", new NumberAction(calculator, 7)), 0, 2)
          add(new CalculatorButton("8", new NumberAction(calculator, 8)), 1, 2)
          add(new CalculatorButton("9", new NumberAction(calculator, 9)), 2, 2)
          add(new CalculatorButton("4", new NumberAction(calculator, 4)), 0, 3)
          add(new CalculatorButton("5", new NumberAction(calculator, 5)), 1, 3)
          add(new CalculatorButton("6", new NumberAction(calculator, 6)), 2, 3)
          add(new CalculatorButton("1", new NumberAction(calculator, 1)), 0, 4)
          add(new CalculatorButton("2", new NumberAction(calculator, 2)), 1, 4)
          add(new CalculatorButton("3", new NumberAction(calculator, 3)), 2, 4)
          add(new CalculatorButton("0", new NumberAction(calculator, 0), xScale = 2.0), 0, 5, 2, 1)

          add(new CalculatorButton(".", new DecimalAction(calculator)), 2, 5)
        }
      )

    }

    addEventFilter(MouseEvent.MOUSE_CLICKED, (event: MouseEvent) => {
      textField.text.value = calculator.displayNumber().toString
    })

  }
}
