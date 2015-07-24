class TicTacToeGame {

// Outer constructor
println("welcome to ticTacToe!")
var board = "_________"

	def MakeAMove(position:Int, mark:Char): String = {

		if(board.substring(position, position + 1) != "_")
		{
			return "invalid move! " + board
		}

		if(position == 0)
		{
			board = mark + board.substring(position + 1, board.length)
		}
		else {
			board = board.substring(0, position) + mark + board.substring(position + 1, board.length)
		}
		
		//println("new board " + board)

		// TODO - put into check board state method
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
testLib.Test(output1, "x________");

// Simple x win

var ticTacToeGame2 = new TicTacToeGame()
ticTacToeGame2.MakeAMove(0, 'x')
ticTacToeGame2.MakeAMove(1, 'x')
var output2 = ticTacToeGame2.MakeAMove(2, 'x')
testLib.Test(output2, "x wins! xxx______");

// Simple o win

var ticTacToeGame3 = new TicTacToeGame()
ticTacToeGame3.MakeAMove(0, 'o')
ticTacToeGame3.MakeAMove(1, 'o')
var output3 = ticTacToeGame3.MakeAMove(2, 'o')
testLib.Test(output3, "o wins! ooo______");

// Game over

var ticTacToeGame4 = new TicTacToeGame()
ticTacToeGame4.MakeAMove(0, 'x')
ticTacToeGame4.MakeAMove(1, 'o')
ticTacToeGame4.MakeAMove(2, 'x')
ticTacToeGame4.MakeAMove(3, 'o')
ticTacToeGame4.MakeAMove(4, 'x')
ticTacToeGame4.MakeAMove(5, 'o')
ticTacToeGame4.MakeAMove(6, 'x')
ticTacToeGame4.MakeAMove(7, 'o')
var output4 = ticTacToeGame4.MakeAMove(8, 'x')
testLib.Test(output4, "game over! - no winner"); 

// Invalid move

var ticTacToeGame5 = new TicTacToeGame()
ticTacToeGame5.MakeAMove(0, 'o')
var output5 = ticTacToeGame5.MakeAMove(0, 'x')
testLib.Test(output5, "invalid move! o________"); 

// Mid order o win

var ticTacToeGame6 = new TicTacToeGame()
ticTacToeGame6.MakeAMove(0, 'x')
ticTacToeGame6.MakeAMove(1, 'o')
ticTacToeGame6.MakeAMove(2, 'x')
ticTacToeGame6.MakeAMove(3, 'o')
ticTacToeGame6.MakeAMove(8, 'x')
ticTacToeGame6.MakeAMove(4, 'o')
ticTacToeGame6.MakeAMove(7, 'x')
var output6 = ticTacToeGame6.MakeAMove(5, 'o')
testLib.Test(output6, "o wins! xoxooo_xx");

// TODO - uppcase getting converted to lower case?

