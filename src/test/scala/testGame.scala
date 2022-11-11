import org.scalatest.wordspec.AnyWordSpec

class testGame extends AnyWordSpec {

  val bowling = new Game()

  "A game" should {
    "should only have specified special characters and numbers" in {

    }

    "have a frame that" should {

      "if it has a strike, the next frame's total is added to the current frame" in {
        assert(bowling.isStrike(Array["X","X"],0) == 30)
      }

      "if it has a spare, the next frame's 1st turn is added to the current frame" in {
        assert(bowling.isSpare(Array["X","X"],0) == 20)
      }

    }
  }
}
