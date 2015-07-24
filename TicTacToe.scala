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

		 // diagonals

		 //println(board.substring(0, 1))
		 //println(board.substring(4, 5))
		 //println(board.substring(8, 9))

		 if((board.substring(0, 1) == "o" && 
		 	board.substring(4, 5) == "o" && 
		 	board.substring(8, 9) == "o") ||
			(board.substring(2, 3) == "o" && 
		 	board.substring(4, 5) == "o" && 
		 	board.substring(6, 7) == "o"))
		 {
		 	return "o wins! " + board
		 }

		 if((board.substring(0, 1) == "x" && 
		 	board.substring(4, 5) == "x" && 
		 	board.substring(8, 9) == "x") ||
			(board.substring(2, 3) == "x" && 
		 	board.substring(4, 5) == "x" && 
		 	board.substring(6, 7) == "x"))
		 {
		 	return "x wins! " + board
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

// Diagonal o win - top left to bottom right

// oxo
// xox
// x_o

var ticTacToeGame7 = new TicTacToeGame()
ticTacToeGame7.MakeAMove(0, 'o')
ticTacToeGame7.MakeAMove(1, 'x')
ticTacToeGame7.MakeAMove(2, 'o')
ticTacToeGame7.MakeAMove(3, 'x')
ticTacToeGame7.MakeAMove(4, 'o')
ticTacToeGame7.MakeAMove(5, 'x')
ticTacToeGame7.MakeAMove(6, 'x')
var output7 = ticTacToeGame7.MakeAMove(8, 'o')
testLib.Test(output7, "o wins! oxoxoxx_o");

// Diagonal o win - top right to bottom left

// oxo
// xox
// o__

var ticTacToeGame8 = new TicTacToeGame()
ticTacToeGame8.MakeAMove(0, 'o')
ticTacToeGame8.MakeAMove(1, 'x')
ticTacToeGame8.MakeAMove(2, 'o')
ticTacToeGame8.MakeAMove(3, 'x')
ticTacToeGame8.MakeAMove(4, 'o')
ticTacToeGame8.MakeAMove(5, 'x')
var output8 = ticTacToeGame8.MakeAMove(6, 'o')
testLib.Test(output8, "o wins! oxoxoxo__");

// Diagonal x win - top left to bottom right

var ticTacToeGame9 = new TicTacToeGame()
ticTacToeGame9.MakeAMove(0, 'x')
ticTacToeGame9.MakeAMove(1, 'o')
ticTacToeGame9.MakeAMove(2, 'x')
ticTacToeGame9.MakeAMove(3, 'o')
ticTacToeGame9.MakeAMove(4, 'x')
ticTacToeGame9.MakeAMove(5, 'o')
ticTacToeGame9.MakeAMove(6, 'o')
var output9 = ticTacToeGame9.MakeAMove(8, 'x')
testLib.Test(output9, "x wins! xoxoxoo_x");

// Diagonal x win - top right to bottom left

var ticTacToeGame10 = new TicTacToeGame()
ticTacToeGame10.MakeAMove(0, 'x')
ticTacToeGame10.MakeAMove(1, 'o')
ticTacToeGame10.MakeAMove(2, 'x')
ticTacToeGame10.MakeAMove(3, 'o')
ticTacToeGame10.MakeAMove(4, 'x')
ticTacToeGame10.MakeAMove(5, 'o')
var output10 = ticTacToeGame10.MakeAMove(6, 'x')
testLib.Test(output10, "x wins! xoxoxox__");

// TODO - work out why uppcase getting converted to lower case? Add definsive code?

