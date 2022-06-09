fun initialize(str: String): MutableList<MutableList<Char>> {

    val list = mutableListOf(mutableListOf('\u0000'), mutableListOf('\u0000'), mutableListOf('\u0000'))
    var c = 0

    for (i in 0 until list.size) {

        val innerList = mutableListOf('\u0000', '\u0000', '\u0000')

        for(j in 0 until innerList.size) {
            innerList[j] = str[c++]
        }

        list[i] = innerList
    }

    printGrid(list)
    return list
}

fun printGrid(list: MutableList<MutableList<Char>>) {

    println("---------")

    for(i in list) {
        println("| ${i.joinToString(" ")} |")
    }

    println("---------")
}

fun userInput(list: MutableList<MutableList<Char>>){
    val range = 'a'..'z'
    var flag = 'X'
    var count = 0

    while (true) {
        print("Enter the coordinates: ")
        val str = readln()

        if(!str.contains(" ")) {
            println("You should enter numbers!")
            continue
        }

        val (i, j) = str.split(" ")

        if (i.first() in range || j.first() in range) {
            println("You should enter numbers!")
            continue
        }

        val x = i.toInt()
        val y = j.toInt()

        if (x - 1 > 2 || y - 1 > 2) {
            println("Coordinates should be from 1 to 3!")
            continue
        }

        if (list[x - 1][y - 1] != ' ') {
            println("This cell is occupied! Choose another one!")
            continue
        }

        if (flag == 'X') {
            list[x - 1][y - 1] = flag
            count++
            flag = 'O'
            printGrid(list)
        } else {
            list[x - 1][y - 1] = flag
            count++
            flag = 'X'
            printGrid(list)
        }

        if(count >= 5) {
            val ans = check(list, count)

            if (ans == "") continue
            else {
                println(ans)
                break
            }
        }
    }
}

fun check(list: MutableList<MutableList<Char>>, count: Int): String {

    val ansHori = checkHorizontal(list)

    return if (ansHori == "X wins" || ansHori == "O wins") ansHori
    else {
        val ansVerti = checkVertical(list)

        if (ansVerti == "X wins" || ansVerti == "O wins") ansVerti
        else {
            val ansDio = checkDiagonal(list)

            if (ansDio == "X wins" || ansDio == "O wins") ansDio
            else {
                if (count == 9) "Draw"
                else ""
            }
        }
    }
}

fun checkHorizontal(list: MutableList<MutableList<Char>>): String {
    var flag = 0

    for (i in list.indices) {
        for (j in list.indices step 3) {
            if (list[i][j] == 'X' && list[i][j + 1] == 'X' && list[i][j + 2] == 'X') {
                flag = 1
                break
            } else if (list[i][j] == 'O' && list[i][j + 1] == 'O' && list[i][j + 2] == 'O') {
                flag = 2
                break
            }
        }

        if (flag != 0) break
    }

    return flagChecker(flag)
}

fun checkVertical(list: MutableList<MutableList<Char>>): String {
    var flag = 0

    for (i in 0..2 step 3) {
        for (j in 0..2) {
            if (list[i][j] == 'X' && list[i + 1][j] == 'X' && list[i + 2][j] == 'X') {
                flag = 1
                break
            } else if (list[i][j] == 'O' && list[i + 1][j] == 'O' && list[i + 2][j] == 'O') {
                flag = 2
                break
            }
        }
    }

    return flagChecker(flag)
}

fun checkDiagonal(list: MutableList<MutableList<Char>>): String {
    var flag = 0

    if (list[0][0] == 'X' && list[1][1] == 'X' && list[2][2] == 'X') {
        flag =  1
    } else if (list[0][0] == 'O' && list[1][1] == 'O' && list[2][2] == 'O') {
        flag = 2
    }

    if (list[0][2] == 'X' && list[1][1] == 'X' && list[2][0] == 'X') {
        flag =  1
    } else if (list[0][2] == 'O' && list[1][1] == 'O' && list[2][0] == 'O') {
        flag = 2
    }

    return flagChecker(flag)
}

fun flagChecker(flag: Int): String {
    return when (flag) {
        1 -> "X wins"
        2 -> "O wins"
        else -> ""
    }
}

fun main() {
    var str = ""
    str += " ".repeat(9)

    val list = initialize(str)
    userInput(list)
}
