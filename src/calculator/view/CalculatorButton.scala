package calculator.view

import javafx.event.{ActionEvent, EventHandler}
import scalafx.scene.control.Button

class CalculatorButton(display: String, action: EventHandler[ActionEvent], xScale: Double = 1.0, yScale: Double = 1.0) extends Button {
  minWidth = 85 * xScale
  minHeight = 85 * yScale
  onAction = action
  text = display
  style = "-fx-font: 30 ariel;"
}
