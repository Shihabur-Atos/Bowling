object Main extends App {
  val rolls: String = "X X X X X X X X X 9 -"
  findTotalScore(rolls)

  def findTotalScore(validRolls: String): Int = {
    val seqOfRolls = validRolls.split(" ").sliding(2)
    seqOfRolls.foreach(roll => {
      val aRoll = roll
      var score = 0
      if (roll.equals('/'))
        score = score + 10
      else if(roll.equals('X'))
        score = score + 10
      else {

      }
    }
  )
  0
  }

}