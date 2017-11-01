package vip.frendy.khttp

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * Created by frendy on 2017/11/1.
 */
class KHttpClient {

    companion object {
        private var client: OkHttpClient? = null

        fun getInstance(): OkHttpClient {
            if(client == null) {
                client = OkHttpClient.Builder()
                        .connectTimeout(10, TimeUnit.SECONDS)
                        .writeTimeout(15, TimeUnit.SECONDS)
                        .build()
            }
            return client!!
        }

        fun set(okHttpClient: OkHttpClient) {
            client = okHttpClient
        }
    }
}
