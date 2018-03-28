package appman.intern.bosstanayot.internappman.dataList.model

import com.beust.klaxon.Json

data class Languages(@Json(name = "th")var th:String, @Json(name = "en")var en:String) {
}