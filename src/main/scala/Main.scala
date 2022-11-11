object Main extends App {
  val rolls: String = "5 / 5 / 5 / 5 / 5 / 5 / 5 / 5 / 5 / 5 / 5"
  val newGame = new Game()
  println(newGame.findTotalScore(rolls))
}