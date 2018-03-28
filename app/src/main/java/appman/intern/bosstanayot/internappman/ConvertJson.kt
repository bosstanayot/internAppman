package appman.intern.bosstanayot.internappman

import android.content.Context
import java.io.InputStream
import java.nio.charset.Charset



class ConvertJson(val context: Context) {
    private fun InputStream.readTextAndClose(charset: Charset = Charsets.UTF_8): String {
        return this.bufferedReader(charset).use { it.readText() }
    }

    fun getStringFromFile(fileName: String): String {
        val assets = context.getAssets()
        val stream: InputStream = assets.open(fileName)
        val ret: String = stream.readTextAndClose()
        stream.close()
        return ret
    }
}