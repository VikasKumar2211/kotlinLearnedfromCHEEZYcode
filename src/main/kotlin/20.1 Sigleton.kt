fun main(){
    SharingWidget.incrementFBLikes()
    SharingWidget.incrementFBLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.display()
}

object  SharingWidget{
    private var twitterLikes = 0
    private var fbLikes = 0

    fun incrementTwitterLikes() = twitterLikes++
    fun incrementFBLikes() = fbLikes++
    fun display () = println("Facebook - $fbLikes --Twitter - $twitterLikes, Total like - ${fbLikes + twitterLikes}")
}