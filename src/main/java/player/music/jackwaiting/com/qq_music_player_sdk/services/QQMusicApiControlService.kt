package player.music.jackwaiting.com.qq_music_player_sdk.services

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import com.tencent.qqmusic.third.api.contract.*
import player.music.jackwaiting.com.qq_music_player_sdk.utils.LogManager

/**
 * Created by JackWaiting on 2018/10/30.
 */
class QQMusicApiControlService(mContext: Context) : QQMusicApiService(mContext) {

    companion object {
        @SuppressLint("StaticFieldLeak")
        private var instance: QQMusicApiControlService? = null

        fun getInstance(context: Context): QQMusicApiControlService {
            if (instance == null) {
                synchronized(QQMusicApiControlService::class) {
                    if (instance == null) {
                        instance = QQMusicApiControlService(context.applicationContext)
                    }
                }
            }
            return instance!!
        }
    }

    fun registerEventListener() {
        // 可选：注册事件回调
        qqMusicApi?.registerEventListener(arrayListOf(Events.API_EVENT_PLAY_SONG_CHANGED), eventListener)
        qqMusicApi?.registerEventListener(arrayListOf(Events.API_EVENT_PLAY_LIST_CHANGED), eventListener)
        qqMusicApi?.registerEventListener(arrayListOf(Events.API_EVENT_PLAY_STATE_CHANGED), eventListener)
    }

    fun onPlayPre() {
        val result = qqMusicApi?.execute("skipToPrevious", null)
        val errorCode = result?.getInt(Keys.API_RETURN_KEY_CODE) ?: 0
        if (errorCode != ErrorCodes.ERROR_OK) {
            LogManager.i("上一首失败($errorCode)")
        }
    }

    fun onPlayNext() {
        val result = qqMusicApi?.execute("skipToNext", null)
        val errorCode = result?.getInt(Keys.API_RETURN_KEY_CODE) ?: 0
        if (errorCode != ErrorCodes.ERROR_OK) {
            LogManager.i("下一首失败($errorCode)")
        }
    }

    //QQ音乐事件回调
    private val eventListener = object : IQQMusicApiEventListener.Stub() {
        override fun onEvent(event: String, extra: Bundle) {
            when (event) {
                Events.API_EVENT_PLAY_SONG_CHANGED -> {
                    //播放歌曲发生改变
                }
                Events.API_EVENT_PLAY_LIST_CHANGED -> {
                    //播放列表发生变化
                }
                Events.API_EVENT_PLAY_STATE_CHANGED -> {
                    //播放状态发生改变
                }
            }
        }
    }
}