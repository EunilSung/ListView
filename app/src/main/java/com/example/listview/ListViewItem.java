package com.example.listview;

public class ListViewItem {

    private String ranking;
    private int imageTier;
    private String tier;
    private String rankName;
    private String leaguePoint;
    private String summerName;
    private int rankNumber;

    public void setRankNumber(int rankNumber) {
        this.rankNumber = rankNumber;
    }

    public void setSummerName(String summerName) {
        this.summerName = summerName;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public void setImageTier(int imageTier) {
        this.imageTier = imageTier;
    }

    public void setLeaguePoint(String leaguePoint) {
        this.leaguePoint = leaguePoint;
    }

    public void setRankName(String rank) {
        this.rankName = rank;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }


    public int getImageTier() {
        return imageTier;
    }

    public String getRankName() {
        return rankName;
    }

    public String getRanking() {
        return ranking;
    }

    public String getTier() {
        return tier;
    }

    public String getLeaguePoint() {
        return leaguePoint;
    }

    public String getSummerName() {
        return summerName;
    }

    public int getRankNumber() {
        return rankNumber;
    }
}
