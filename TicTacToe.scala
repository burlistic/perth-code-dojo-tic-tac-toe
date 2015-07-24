class TicTacToeGame {

// Outer constructor
println("welcome to ticTacToe!")
var board = "_________"

	def MakeAMove(position:Int, mark:Char): String = {
		 
		// TODO - check position isn't taken

		if(position == 0)
		{
			board = board.substring(0, position) + mark + board.substring(position, board.length)
		} else {
			board = board.substring(0, position) + mark + board.substring(position, board.length - 1)
		}
		
		//println("new board " + board)

		if(!board.contains("_"))
		 {
		 	return "game over! - no winner"
		 }
		 
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

//val (postion, mark) = (0, 'x')
var output1 = ticTacToeGame.MakeAMove(0, 'x')
testLib.Test(output1, "x_________");

// // Simple x win

var ticTacToeGame2 = new TicTacToeGame()
ticTacToeGame2.MakeAMove(0, 'x')
ticTacToeGame2.MakeAMove(1, 'x')
var output2 = ticTacToeGame2.MakeAMove(2, 'x')
testLib.Test(output2, "x wins! xxx_______");

// // Simple o win

// var output3 = ticTacToeGame.MakeAMove("ooo_______")
// testLib.Test(output3, "o wins! ooo_______"); 

// // Game over

// var output4 = ticTacToeGame.MakeAMove("xoxoxoxox")
// testLib.Test(output4, "game over! - no winner");   

// // Invalid move

// ticTacToeGame.MakeAMove("ooo_______")
// var output4 = ticTacToeGame.MakeAMove("oox_______")
// testLib.Test(output4, "invalid move! ooo_______"); 

// TODO - uppcase getting converted to lower case?

