package games

import scala.io.StdIn.{readInt, readLine}

object rock_paper_scissor extends App {

  def readInput() {
    println("Hi Welcome to the world of gaming")
    var playerList = Seq.empty[String]
    var input = Seq.empty[String]
    println("Enter Number of players")
    val numPlayers: Int = readInt()
    val valid = List("Paper", "Rock", "Scissors")

    if (numPlayers == 2) {
      for (i <- 1 to numPlayers) {
        println("Enter Your Name")
        val player_name: String = readLine()
        playerList = playerList :+ player_name
        val selection = readLine("choose between Rock,Paper or Scissors: ")

        input = input :+ selection

      }
      if (valid.contains(input)) {
        val combs = playerList.zip(input)
        println(combs)
        combs
      } else {
        println("Invalid Input")
        sys.exit()
      }
    } else {
      print("Invalid number of players,Only 2 can play")
      sys.exit()
    }
  }

  readInput()

}
