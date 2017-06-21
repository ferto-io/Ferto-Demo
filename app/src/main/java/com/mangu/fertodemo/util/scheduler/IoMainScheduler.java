package com.mangu.fertodemo.util.scheduler;


import com.mangu.fertodemo.R;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import rx.Observable;


public class IoMainScheduler<T> extends BaseScheduler<T>
        implements Observable.Transformer<String, R> {

    public IoMainScheduler() {
        super(Schedulers.io(), AndroidSchedulers.mainThread());
    }

    @Override
    public Observable<R> call(Observable<String> stringObservable) {
        return null;
    }
}
