package com.ikdiabate.distance.data;

/**
 * Model class for video retrieval.
 *
 * @Author: Ibrahim Diabate
 * @Version: November 2017
 */
public class Distance {

    //Video id
    private String mvideoid;
    // Title of the video
    private String mtitle;
    //Description of the video
    private String mdescription;
    // Date video was published
    private String mPublisheDate;
    // Video thumbnail
    private String mthumbnail;
    //Title of video's channel
    private String mChannelTitle;

    // Constructor
    public Distance(String videoid, String title, String description, String publisheDate, String thumbnail, String channelTitle) {
        mvideoid = videoid;
        mtitle = title;
        mdescription = description;
        mPublisheDate = publisheDate;
        mthumbnail = thumbnail;
        mChannelTitle = channelTitle;
    }

    //Getters and setters
    public  String getVideoid(){
        return mvideoid;
    }
    public String getTitle() {return mtitle;}
    public String getDescription() {
        return mdescription;
    }
    public String getPublishedDate() {return mPublisheDate;}
    public String getThumbnail() {return mthumbnail;}
    public String getChannelTitle() {
        return mChannelTitle;
    }
}
