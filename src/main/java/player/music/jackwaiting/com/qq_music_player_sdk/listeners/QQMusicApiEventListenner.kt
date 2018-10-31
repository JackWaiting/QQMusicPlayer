package player.music.jackwaiting.com.qq_music_player_sdk.listeners

import android.os.Bundle
import com.tencent.qqmusic.third.api.contract.Events
import com.tencent.qqmusic.third.api.contract.IQQMusicApiEventListener
import com.tencent.qqmusic.third.api.contract.Keys

/**
 * Created by JackWaiting on 2018/10/30.
 */
//QQ音乐事件回调
private val QQMusicApiEventListener = object : IQQMusicApiEventListener.Stub() {
    override fun onEvent(event: String, extra: Bundle) {
        when (event) {
            Events.API_EVENT_PLAY_SONG_CHANGED -> {
            }
            Events.API_EVENT_PLAY_LIST_CHANGED -> {
                var size = extra.getInt(Keys.API_EVENT_KEY_PLAY_LIST_SIZE)
            }
            Events.API_EVENT_PLAY_STATE_CHANGED -> {
            }
        }
    }

}