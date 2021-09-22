package com.dragontwister.yondekiku.interfaces;

import android.os.Bundle;
import com.dragontwister.yondekiku.models.RecognitionStatus;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface RecognitionCallback {
//    void onPrepared(@NotNull RecognitionStatus status);
//
//    void onBeginningOfSpeech();
//
    void onKeywordDetected(String type);
//
//    void onReadyForSpeech(@NotNull Bundle params);
//
//    void onBufferReceived(@NotNull byte[] buffer);
//
    void onRmsChanged(float rmsdB);
//
//    void onPartialResults(@NotNull List <String> results);
//
    void onResults(@NotNull List <String> results);
//
//    void onError(int errorCode);
//
//    void onEvent(int eventType, @NotNull Bundle params);
//
//    void onEndOfSpeech();
}
