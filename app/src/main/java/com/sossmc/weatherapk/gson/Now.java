package com.sossmc.weatherapk.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")
    public String tempeture;
    public class More {
        @SerializedName("txt")
        public String info;
    }
    @SerializedName("cond")
    public More more;
}