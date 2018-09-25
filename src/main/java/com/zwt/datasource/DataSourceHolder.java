package com.zwt.datasource;

public class DataSourceHolder {

    private static ThreadLocal<String> holder = new ThreadLocal<>();

    public static String get() {
        return holder.get();
    }

    public static void set(String dataSourceKey) {
        holder.set(dataSourceKey);
    }

}
