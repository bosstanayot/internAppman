package appman.intern.bosstanayot.internappman.dataList.model

import com.beust.klaxon.Json

data class JsonDatas(@Json(name = "Id") var id: String, @Json(name = "firstName") var firstName: String,
                     @Json(name = "lastName") var lastName: String, @Json(name = "data")var data: List<Datas>) {
}