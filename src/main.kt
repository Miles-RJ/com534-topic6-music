fun main() {

    val song1 = Song("Song 1", "Artist 1", 3.2)
    val song2 = Song("Song 2", "Artist 2", 2.7)
    val song3 = Song("Song 3", "Artist 3", 3.0)
    val song4 = Song("Song 4", "Artist 4", 3.3)

    val single = Single(song1, song2)

    val songs : List<Song> = listOf(song1, song2, song3, song4)
    val album = Album(songs)

    val player = RecordPlayer()

    println(player.play(single))

    println("\n\n===============\n\n")

    println(player.play(album))
}