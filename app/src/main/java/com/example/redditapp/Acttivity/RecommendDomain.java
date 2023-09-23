package com.example.redditapp.Acttivity;

public class RecommendDomain {
    private String  tiltle;
    private String  pic;
    private Double  comment;
    private int voteno;

    public RecommendDomain(String tiltle, String pic, Double comment, int upvote) {
        this.tiltle = tiltle;
        this.pic = pic;
        this.comment = comment;
        this.voteno = upvote;
    }

    public String getTiltle() {
        return tiltle;
    }

    public void setTiltle(String tiltle) {
        this.tiltle = tiltle;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Double getComment() {
        return comment;
    }

    public void setComment(Double comment) {
        this.comment = comment;
    }

    public int getVoteno() {
        return voteno;
    }

    public void setVoteno(int upvote) {
        this.voteno = upvote;
    }
}
