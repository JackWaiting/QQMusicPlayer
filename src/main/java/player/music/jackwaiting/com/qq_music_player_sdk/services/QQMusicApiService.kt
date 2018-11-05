package player.music.jackwaiting.com.qq_music_player_sdk.services

import android.annotation.SuppressLint
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import com.tencent.qqmusic.third.api.contract.*
import player.music.jackwaiting.com.qq_music_player_sdk.utils.BuildConfig.qqMusicApiService
import player.music.jackwaiting.com.qq_music_player_sdk.utils.BuildConfig.qqMusicPackage
import player.music.jackwaiting.com.qq_music_player_sdk.listeners.OnQQMusicServiceConnectedChangeListener
import player.music.jackwaiting.com.qq_music_player_sdk.utils.LogManager

/**
 * Created by JackWaiting on 2018/10/30.
 */
open class QQMusicApiService constructor(var context: Context) : ServiceConnection {

    private var isConnected = false
    protected var qqMusicApi: IQQMusicApi? = null
    private var onQQMusicServiceConnectedChangeListener: OnQQMusicServiceConnectedChangeListener? = null

    companion object {

        @SuppressLint("StaticFieldLeak")
        private var instance: QQMusicApiService? = null

        fun getInstance(context: Context): QQMusicApiService {
            if (instance == null) {
                synchronized(QQMusicApiService::class) {
                    if (instance == null) {
                        instance = QQMusicApiService(context.applicationContext)
                    }
                }
            }
            return instance!!
        }
    }

    override fun onServiceDisconnected(name: ComponentName?) {
        isConnected = false
        onQQMusicServiceConnectedChangeListener?.onQQMusicServiceConnectedChangeListener(0)
    }

    override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
        isConnected = true
        qqMusicApi = IQQMusicApi.Stub.asInterface(service)
        onQQMusicServiceConnectedChangeListener?.onQQMusicServiceConnectedChangeListener(1)
    }

    /**
     * 返回连接状态
     * */
    fun getConnectedState(): Boolean {
        return isConnected
    }

    /**
     * 获取QQ音乐服务对象
     * */
    fun getQQMusicApi(): IQQMusicApi? {
        return qqMusicApi
    }

    /**
     * 绑定QQ音乐API服务
     */
    fun bindQQMusicApiService() {
        // 必须显式绑定
        val intent = Intent(qqMusicApiService).apply {
            `package` = qqMusicPackage
        }
        if(!context.bindService(intent, this, Context.BIND_AUTO_CREATE)){
            isConnected = false
            onQQMusicServiceConnectedChangeListener?.onQQMusicServiceConnectedChangeListener(0)
        }
    }
}