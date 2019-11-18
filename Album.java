public class Album {
    private Song[] songs;
    private int count;
    private String name;

    private final int MAX = 20; // max array size

    public Album(String name){
        this.songs = new Song[MAX];
        this.name = name;
        count = 0;
    }

    /**
     * add a Song to the songs list and add count by 1
     * @param name type of String
     * @param artist type of String
     * @param length type of double
     * @param genre type of String
     */
    public void addSong(String name, String artist, double length, String genre){
        if(count >= MAX)
            return;
        songs[count] = new Song(name, artist, length, genre);
        count++;
    }

    /**
     * create a new AlbumIterator
     * @return a new AlbumIterator with songs
     */
    public AlbumIterator createIterator(){
        return new AlbumIterator(songs);
    }
}
