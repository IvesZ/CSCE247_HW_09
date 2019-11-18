public class AlbumIterator implements Iterator {

    private Song[] songs;
    private int position;

    public AlbumIterator(Song[] songs){
       this.songs = songs;
       position = 0;
    }

    /**
     * check if has more songs
     * @return true if has more else return false
     */
    @Override
    public boolean hasNext() {
        if(songs[position] == null || position >= songs.length-1){
            return false;
        }
        return true;
    }

    /**
     * get next Song
     * @return Song
     */
    @Override
    public Song next(){
        return songs[position++];

    }
}
