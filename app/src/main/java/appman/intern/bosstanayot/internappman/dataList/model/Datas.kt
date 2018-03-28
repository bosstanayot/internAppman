package appman.intern.bosstanayot.internappman.dataList.model

import com.beust.klaxon.Json

data class Datas(@Json(name = "docType")var docType: String, @Json(name = "description") var description: Languages){
}