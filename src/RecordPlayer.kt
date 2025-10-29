class RecordPlayer {

    fun play(music: Music) : String {
        var messageString : String = ""

        var songs : List<Song> = music.getAllSongs()

        messageString = "Songs:"
        for(song in songs){
            messageString = "$messageString\n - $song (${song.playingTime})"
        }

        messageString = "$messageString\nTotal Playing Time = ${music.getPlayingTime()}"

        return messageString

    }

}