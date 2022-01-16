package com.library.gallerynativelib;

public class NativeLib {

    // Used to load the 'gallerynativelib' library on application startup.
    static {
        System.loadLibrary("gallerynativelib");
    }

    /**
     * A native method that is implemented by the 'gallerynativelib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}