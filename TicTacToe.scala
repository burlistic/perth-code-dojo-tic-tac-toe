class TicTacToeGame {

// constructor? empty string?

//var board

	def MakeAMove(input:String): String = {
		 println("welcome to ticTacToe!")

		 //println("input: " + args(0))

		 var board = ""
		 board = input

		 // for(i <- 0 until args.length) {
		 //  	println(args(i))
		 // }

		 if(board.contains("xxx"))
		 {
		 	return "x wins! " + board
		 }

		 println("board: " + board)

		 return board
	}	


	

}

class TestLib {

    def Test(input:String, expected:String):Boolean = {

	if(input != expected)
	{
		println("Test failed. Input " + input + 
			" Expected: " + expected)

		return false

	}

	println("Test passed. Input " + input + " Expected: " + expected)

	return true

    }

}

var ticTacToeGame = new TicTacToeGame()
var testLib = new TestLib();

// Board returns state once a move has been made

var output1 = ticTacToeGame.MakeAMove("x_________")
testLib.Test(output1, "x_________"); 

// Simple win

var output2 = ticTacToeGame.MakeAMove("xxx_______")
testLib.Test(output2, "x wins! xxx_______"); 

// TODO - uppcase getting converted to lower case?

