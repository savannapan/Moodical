package main.java.Entities;
import java.util.ArrayList;

public class History{
    public ArrayList<ArrayList<Song>> previous_songs;
    // a list of playlists a playlist is a list of strings
    public History(){
        this.previous_songs = new ArrayList<ArrayList<Song>>();
    }


}
