package player.music.jackwaiting.com.qq_music_player_sdk.managers

import android.annotation.SuppressLint
import android.content.Context
import player.music.jackwaiting.com.qq_music_player_sdk.services.QQMusicApiControlService

/**
 * Created by JackWaiting on 2018/10/30.
 */
class QQMusicApiManager constructor(context: Context) {

    private var qqMusicApiService: QQMusicApiControlService? = null

    companion object {
        @SuppressLint("StaticFieldLeak")
        var instance: QQMusicApiManager? = null

        fun getInstance(context: Context): QQMusicApiManager {
            if (instance == null) {
                synchronized(QQMusicApiManager::class) {
                    if (instance == null) {
                        instance = QQMusicApiManager(context.applicationContext)
                    }
                }
            }
            return instance!!
        }
    }

    init {
        qqMusicApiService = QQMusicApiControlService.getInstance(context)
    }

    fun bindQQMusicApiService() {
        qqMusicApiService?.bindQQMusicApiService()
    }

    fun onPlayPre() {
        qqMusicApiService?.onPlayPre()
    }

    fun onPlayNext() {
        qqMusicApiService?.onPlayNext()
    }

    /**
     * 获取连接状态
     * */
    fun getConnectedState(): Boolean {
        return qqMusicApiService?.getConnectedState()!!
    }
}