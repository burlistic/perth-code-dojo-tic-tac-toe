class TicTacToeGame {

// Outer constructor
println("welcome to ticTacToe!")
var board = ""

	def MakeAMove(input:String): String = {
		 
		 board = input
		 
		 if(board.contains("xxx"))
		 {
		 	return "x wins! " + board
		 }

		 if(board.contains("ooo"))
		 {
		 	return "o wins! " + board
		 }

//		 println("board: " + board)

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

// Simple x win

var output2 = ticTacToeGame.MakeAMove("xxx_______")
testLib.Test(output2, "x wins! xxx_______");

// Simple o win

var output3 = ticTacToeGame.MakeAMove("ooo_______")
testLib.Test(output3, "o wins! ooo_______");  

// TODO - uppcase getting converted to lower case?

