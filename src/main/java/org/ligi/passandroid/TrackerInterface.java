package org.ligi.passandroid;


public interface TrackerInterface {

    public final static String EVENT_CATEGORY_UI_ACTION = "ui_event";

    void trackException(String s, Exception e, boolean fatal);

    void trackException(String s, boolean fatal);

    void trackEvent(String category, String action, String label, Long val);

}
