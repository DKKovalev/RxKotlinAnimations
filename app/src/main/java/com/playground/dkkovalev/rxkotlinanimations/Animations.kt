package com.playground.dkkovalev.rxkotlinanimations

import android.support.v4.view.ViewCompat
import android.view.View
import android.view.animation.Interpolator
import io.reactivex.Completable
import io.reactivex.subjects.CompletableSubject

fun View.fadeIn(duration: Long = 1000L): Completable {
    val animationSubject = CompletableSubject.create()
    return animationSubject.doOnSubscribe {
        ViewCompat.animate(this)
                .setDuration(duration)
                .alpha(1f)
                .withEndAction {
                    animationSubject.onComplete()
                }
    }
}

fun View.fadeOut(duration: Long = 1000L): Completable {
    val animationSubject = CompletableSubject.create()
    return animationSubject.doOnSubscribe {
        ViewCompat.animate(this)
                .setDuration(duration)
                .alpha(0f)
                .withEndAction {
                    animationSubject.onComplete()
                }
    }
}

fun View.slideX(translationX: Float, duration: Long = 1000L, interpolator: Interpolator): Completable {
    val animationSubject = CompletableSubject.create()
    return animationSubject.doOnSubscribe {
        ViewCompat.animate(this)
                .setDuration(duration)
                .translationX(translationX)
                .withEndAction {
                    animationSubject.onComplete()
                }
    }
}

fun View.slideY(translationY: Float, duration: Long = 1000L, interpolator: Interpolator): Completable {
    val animationSubject = CompletableSubject.create()
    return animationSubject.doOnSubscribe {
        ViewCompat.animate(this)
                .setDuration(duration)
                .translationY(translationY)
                .withEndAction {
                    animationSubject.onComplete()
                }
    }
}