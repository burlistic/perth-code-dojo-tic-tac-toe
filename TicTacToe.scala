class TicTacToeGame {

// constructor? empty string?

//var board

	def MakeAMove {
		 println("welcome to ticTacToe!")

		 //println("input: " + args)

		 var board = ""
		 board = args(0)

		 // for(i <- 0 until args.length) {
		 //  	println(args(i))
		 // }

		 println("board: " + board)
	}	


	// TODO - move to test lib
    def Test(input:Int, expected:String) = {

	val output = Convert(input)

	if(output != expected)
	{
		println("Test failed. Input " + input + 
			" Output: " + output + 
			" Expected: " + expected)


	}

	println("Test passed. Input " + input + " Output: " + output)
    }

}

var ticTacToeGame = new TicTacToeGame()

ticTacToeGame.MakeAMove(X_________, X_________)