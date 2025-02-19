package MusicMaster

class Songs {



    fun playAll(songs :MutableList<String>)
    {
        for(song in songs)
        { println("Now playing: $song")}
    }

    fun addSong(songs: MutableList<String>, songTitle: String) {

        songs.add(songTitle)
        println("Added new song: $songTitle")
    }





}

fun main() {
    var songs : MutableListOf<String>

    songs.add("kuwait National Song")
    songs.add("hello")

    playAll(songs)
    addSong(songs, "Deep Focus Beats")
}



