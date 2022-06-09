# Tic-Tac-Toe

![Python projects](https://media.giphy.com/media/3oriNKQe0D6uQVjcIM/giphy.gif)

### About this project

Tic-tac-toe is a game played by two players on a 3x3 field where the duel takes place. One of the players plays as 'X', and the other player is 'O'. 'X' plays first, then the 'O' side plays, and so on.

The first player that writes 3 'X' or 3 'O' in a straight line (including diagonals) wins.

### Run

Requirements:
- Kotlin Compiler, or
- IntelliJ IDEA

`kotlin tictactoe.kt`



# Code It Yourself

## Welcome to the battlefield!


<h4 style="text-align: center;">Description</h4>

<p>Nowadays, this game is known all over the world. Each country may have its own version of the name, sometimes the rules are different, but the meaning of the game remains the same.</p>

<p>It is important to think about the interface and set boundaries for our field.</p>

<p>In addition to analyzing the field, it is equally important to add the ability to select a cell for your move. Now you need to implement human moves. Let's divide the field into cells.</p>

<p>Suppose the bottom left cell has the coordinates (1, 1) and the top right cell has the coordinates (3, 3) like in this table:<br>
<br>
(1, 3) (2, 3) (3, 3)<br>
(1, 2) (2, 2) (3, 2)<br>
(1, 1) (2, 1) (3, 1)</p>

<p>The program should ask to enter the coordinates where the user wants to make a move.</p>

<p><strong>Note</strong> Keep in mind that the first coordinate goes from left to right and the second coordinate goes from top to bottom. Also, notice that coordinates start with 1 and can be 1, 2 or 3.</p>

<p>But what if the user enters incorrect coordinates? The user could enter symbols instead of numbers or enter coordinates representing occupied cells. You need to prevent all of that by checking a user's input and catching possible exceptions.</p>
<p> </p>

<p>We are at the finish line! But playing alone is not so interesting, is it? Also add the ability to play from the beginning (empty field) to the result (win or draw).</p>

<p>In the last, make it so you can play a full game with a friend. First one of you moves as X, and then the other one moves as O.</p>


<h4 style="text-align: center;">Objectives</h4>

<p>You should write a program that:</p>

<ol>
	<li>Prints an empty 3x3 field at the beginning of the game. Elements of the field can contain only <code class="java">'X'</code>, <code class="java">'O'</code> and <code class="java">' '</code> symbols.</li>
	<li>Sets the field to a specific format, i.e. field should start and end with <code class="java">---------</code>, all lines in between should start and end with <code class="java">'|'</code> symbol and everything in the middle should be separated with a single space.  </li>
	<li>Creates a game loop where the program asks the user to enter the cell coordinates, analyzes the move for correctness and shows a field with the changes if everything is ok.</li>
	<li>Then the user should input 2 numbers that represent the cell on which user wants to make his X.</li>
	<li>Analyze user input and show messages in the following situations:<br>
	-<code class="java">"This cell is occupied! Choose another one!"</code> - if the cell is not empty;<br>
	-<code class="java">"You should enter numbers!"</code> - if the user enters other symbols;<br>
	-<code class="java">"Coordinates should be from 1 to 3!"</code> - if the user goes beyond the field.</li>
	<li> After 5 turns (including X turns and O turns), find the state in which the game is at the moment and print it. Possible states:</li>

<ul>
	<li><code class="java">"Draw"</code> - when no side has a three in a row and the field has no empty cells;</li>
	<li><code class="java">"X wins"</code> - when the field has three X in a row;</li>
	<li><code class="java">"O wins"</code> - when the field has three O in a row;</li>
</ul>
	<li>Ends the game when someone wins or there is a draw.</li>
</ol>

<p>You need to output the final result after the end of the game.</p>

<p>Good luck gaming!</p>
	

<h4 style="text-align: center;">Example</h4>

<p>The example below shows how your program should work.<br>
The greater-than symbol followed by space (<code class="java">&gt; </code>) represents the user input. Notice that it's not the part of the input.</p>

<pre><code class="language-no-highlight">

---------
|       |
|       |
|       |
---------
Enter the coordinates: &gt; 2 2
---------
|       |
|   X   |
|       |
---------
Enter the coordinates: &gt; 2 2
This cell is occupied! Choose another one!
Enter the coordinates: &gt; two two
You should enter numbers!
Enter the coordinates: &gt; 1 4
Coordinates should be from 1 to 3!
Enter the coordinates: &gt; 1 3
---------
| O     |
|   X   |
|       |
---------
Enter the coordinates: &gt; 3 1
---------
| O     |
|   X   |
|     X |
---------
Enter the coordinates: &gt; 1 2
---------
| O     |
| O X   |
|     X |
---------
Enter the coordinates: &gt; 1 1
---------
| O     |
| O X   |
| X   X |
---------
Enter the coordinates: &gt; 3 2
---------
| O     |
| O X O |
| X   X |
---------
Enter the coordinates: &gt; 2 1
---------
| O     |
| O X O |
| X X X |
---------
X wins
</code></pre>
