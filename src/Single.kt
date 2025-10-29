class Single(val aSide: Song, val bSide: Song) : Music {

    override fun getPlayingTime(): Double {
        return aSide.playingTime + bSide.playingTime
    }

    override fun getAllSongs(): List<Song> {

        val songs : List<Song> = listOf(aSide, bSide)
        return songs

    }


}