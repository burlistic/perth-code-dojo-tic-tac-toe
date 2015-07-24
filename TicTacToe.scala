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

// Board returns state once a move has been made

var output1 = ticTacToeGame.MakeAMove("x_________")
testLib.Test("x_________", output1); 

// TODO - uppcase getting converted to lower case?

