class Album(val songs: List<Song>) : Music {

    fun getSongsByArtist(artist: String): List<Song> {

        //return songs.filter {song -> song.artist == artist }
        return songs.filter { it.artist == artist }
    }

    override fun getAllSongs(): List<Song> {
        return songs
    }

    override fun getPlayingTime(): Double {
        var totalPlayTime = 0.0
        songs.forEach {song -> totalPlayTime += song.playingTime}

        return totalPlayTime
    }

}