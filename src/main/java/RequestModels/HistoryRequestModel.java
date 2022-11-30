package RequestModels;

import Entities.Account;
import Entities.Song;
import Processors.HistoryProcessor;

import java.util.ArrayList;

public class HistoryRequestModel {
    private Account userAccount;
    ArrayList<Song> recommendedPlaylist = HistoryProcessor.recommend(userAccount);

    ArrayList<Song> allSongs = HistoryProcessor.getAllSongs(userAccount);

    public ArrayList<Song> getAllSongs(){
        return allSongs;
    }
    public ArrayList<Song> getRecommendedPlaylist(){
        return recommendedPlaylist;
    }

    public void setAllSongs(ArrayList<Song> allSongs){
        this.allSongs = allSongs;
    }
    public void setRecommendedPlaylist(ArrayList<Song> recommendedPlaylist){
        this.recommendedPlaylist = recommendedPlaylist;
    }
}
