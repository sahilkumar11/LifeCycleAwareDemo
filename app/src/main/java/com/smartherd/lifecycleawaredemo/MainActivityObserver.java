package com.smartherd.lifecycleawaredemo;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import java.lang.annotation.Target;

// Life Cycle observer
public class MainActivityObserver implements LifecycleObserver { //this class implements lifecycle observer class
    private String TAG = this.getClass().getSimpleName();

    // The observer class uses the annotation to keep track of the event
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void OnCreateEvent(){
        Log.i(TAG,"Observer ON_CREATE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void OnSTARTEvent(){
        Log.i(TAG,"Observer ON_S");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void OnPEvent(){
        Log.i(TAG,"Observer ON_P");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void OnRESUMEEvent(){
        Log.i(TAG,"Observer ON_RESUME");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void OnSTOPEvent(){
        Log.i(TAG,"Observer ON_STOP");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void OnDEStroryEvent(){
        Log.i(TAG,"Observer ON_DESTROY");
    }


}
