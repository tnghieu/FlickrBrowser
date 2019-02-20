package tnghieu.flickrbrowser;

import java.io.Serializable;

public class Photo implements Serializable {
    private String mTitle;
    private String mAuthor;
    private String mAuthorId;
    private String mLink;
    private String mTag;
    private String mImage;

    public Photo(String title, String author, String authorId, String link, String tag, String image) {
        mTitle = title;
        mAuthor = author;
        mAuthorId = authorId;
        mLink = link;
        mTag = tag;
        mImage = image;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getAuthorId() {
        return mAuthorId;
    }

    public String getLink() {
        return mLink;
    }

    public String getTag() {
        return mTag;
    }

    public String getImage() {
        return mImage;
    }
}
