class TicTacToeGame {

// constructor? empty string?

//var board

	def MakeAMove(input:String): String = {
		 println("welcome to ticTacToe!")

		 //println("input: " + args)

		 var board = ""
		 board = args(0)

		 // for(i <- 0 until args.length) {
		 //  	println(args(i))
		 // }

		 println("board: " + board)

		 return board
	}	


	

}

class TestLib {

// TODO - move to test lib
    def Test(input:String, expected:String):Boolean = {

	//val output = Convert(input)

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

var output1 = ticTacToeGame.MakeAMove("X_________")
testLib.Test("X_________", output1); // Board returns state once a move has been made

