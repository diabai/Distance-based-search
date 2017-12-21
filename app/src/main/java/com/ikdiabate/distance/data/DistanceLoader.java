package com.ikdiabate.distance.data;

import android.content.AsyncTaskLoader;
import android.content.Context;

import com.ikdiabate.distance.QueryUtils;

import java.util.List;

/**
 * Performs asynchronous loading of data.
 *
 * @Author: Ibrahim Diabate
 * @Version: November 2017
 */

public class DistanceLoader extends AsyncTaskLoader<List<Distance>> {

    /** Tag for log messages */
    private static final String LOG_TAG = DistanceLoader.class.getName();
    /** Query URL */
    private String mUrl;

    // Constructor
    public DistanceLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        //Forces asynchronous load of the video
        forceLoad();
    }

    /**
     * Loads videos on a background thread.
     */
    @Override
    public List<Distance> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<Distance> distances = QueryUtils.fetchVideoData(mUrl);
        return distances;
    }
}
