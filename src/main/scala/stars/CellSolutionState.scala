package stars

sealed trait CellSolutionState
sealed trait CellHypothesis extends CellSolutionState
case object UnknownCell extends CellSolutionState
case object StarCell extends CellHypothesis
case object EmptyCell extends CellHypothesis