class Game {

  def findTotalScore(validRolls: String): Int = {
    val frames = validRolls.split(" ")
    //val seqOfRolls = validRolls.split(" ").sliding(2)
    var score = 0
    frames.foreach(roll => {
      val currentRoll = frames.indexOf(roll)
      val subFrames = frames.slice(currentRoll, currentRoll + 2)
      if (roll.equals("X"))
        score = score + isStrike(frames.slice(frames.indexOf(roll), frames.indexOf(roll) + 2))
      else if (roll.equals("/"))
        score = score + isSpare(frames.slice(frames.indexOf(roll), frames.indexOf(roll) + 2))
      else if (roll.exists(_.isDigit)) {
        score = score + roll.toInt
      }
    })
    score
  }

  def isStrike(roll: Array[String]): Int = {
    var tempScore: Int = 0
    if (roll(0).equals("X")) {
      tempScore = tempScore + 30
    }
    else if (roll(0).exists(_.isDigit)) {
      tempScore = tempScore + roll(1).toInt
      if(roll(1).exists(_.isDigit)) {
        tempScore = tempScore + roll(2).toInt
      } else if(roll(1).equals("/")){
        tempScore = tempScore + (10 - roll(2).toInt)
      }
    }
    else {
      return tempScore
    }
    tempScore
  }

  def isSpare(roll: Array[String]): Int = {
    var tempScore: Int = 0
    if (roll(0).equals("X")) {
      tempScore = tempScore + 20
    }
    else if (roll(1).exists(_.isDigit)) {
      tempScore = tempScore + roll(1).toInt
    }
    else {
      return tempScore
    }
    tempScore
  }

}
