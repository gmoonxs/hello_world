package com.gmoonxs.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo.State;
/**
 * Created by 威 on 2015/3/24.
 */
public class NetUtil {
    public static final int NETWORN_NONE = 0;
    public static final int NETWORN_WIFI = 1;
    public static final int NETWORN_MOBILE = 2;

    public static int getNetworkState(Context context) {
        ConnectivityManager connManger = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        //wifi
        State state=connManger.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState();
        if(state==State.CONNECTED||state==State.CONNECTING){
            return NETWORN_WIFI;
        }
        //Mobile
        state =connManger.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState();
        if(state==State.CONNECTED||state==State.CONNECTING){
            return NETWORN_MOBILE;
        }
        return NETWORN_NONE;

    }
}
