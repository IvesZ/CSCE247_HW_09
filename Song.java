public class Song {
    private String name;
    private String artist;
    private double length;
    private String genre;

    public Song(String name, String artist, double length, String genre){
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    /**
     * print Song info in format name, artist, genre, and length of a song
     */
    public void print(){
        System.out.printf("%s by %s %s: pop length: %s min\n",
                this.name,this.artist,this.genre,this.length);
    }
}
