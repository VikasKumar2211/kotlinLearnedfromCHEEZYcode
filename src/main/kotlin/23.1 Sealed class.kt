fun main(){
    val tile = Red("Mushroom", 25)
    val tile2 = Red("Fire", 30)
    println("${tile.points} - ${tile.type}")

    val tile22 : Tile = Red("Gobi", 54)
    val points = when(tile22){
        is Blue -> tile22.points * 2
        is Red -> tile22.points * 8
    }
    println(points)
}

sealed class  Tile
class Red(val type: String, val points: Int) : Tile()
class Blue(val points: Int) : Tile()