package com.example.redditapp.Acttivity;

public class CategoryDomain {
    String  tiltle;
    String  pic;

    public CategoryDomain(String tiltle, String pic) {
        this.tiltle = tiltle;
        this.pic = pic;
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


}
