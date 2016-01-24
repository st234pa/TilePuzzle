# TilePuzzle
Written Report
by Stephanie Yoon, Chloe Delfau, and Anya Keller
Mr. Platek
APCS1 Final Project -- Tile Puzzle

Description of Project:
Our project is a GUI based application called Tile Puzzle. The objective of the game is very simple -- to rearrange the 8 scrambled tiles to be in order on a 3x3 grid. In order to rearrange the tiles, one must slide a tile (adjacent to the empty cell) into the empty cell of the grid.

Instructions:
The driver class is PuzzleWindow.java. Running PuzzleWindow.java will print out the instructions in the terminal and then will ask you if you want to play. If you type in ‘y’ then you will have to decide if you want to play in Number mode or the Platek mode (you’ll see what those modes mean!). Depending on whether you type ‘n’ or ‘p’ in the terminal, the GUI will be launched, displaying a puzzle board with the appropriate tiles and three buttons.
The first button is the Shuffle button, which will shuffle the tiles. The second and third buttons are puzzle solvers -- if you click either of them, they will solve the shuffled or partially solved puzzle, and print the sequence of moves in the terminal. The solvers are different in the sense that they solve the same problem using different algorithms, but they are roughly equal in efficiency.
In order to play the game yourself, you move a tile by clicking the tile you want to slide. This will cause the tile to slide into the empty cell (which is gray), but only if it is possible for the tile to slide into that position (meaning, the tile is adjacent to the empty cell). 

