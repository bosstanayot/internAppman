package appman.intern.bosstanayot.internappman

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.TextView
import appman.intern.bosstanayot.internappman.dataList.DataAdapter
import appman.intern.bosstanayot.internappman.dataList.model.Datas
import appman.intern.bosstanayot.internappman.dataList.model.JsonDatas
import com.beust.klaxon.Klaxon

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var textView: TextView
    private lateinit var json: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindView()

        json = ConvertJson(this).getStringFromFile("intern.json")

        val result = Klaxon().parse<JsonDatas>(json)
        var id: String? = result?.id
        var name: String? = result?.firstName + " " + result?.lastName

        textView.text = "Id:$id Name: $name"
        setRecyclerAdapter(result?.data)


    }

    private fun bindView() {
        recyclerView = findViewById(R.id.data_list)
        textView = findViewById(R.id.text_on_top)
    }

    private fun setRecyclerAdapter(result: List<Datas>?) {
        val dataAdapter = DataAdapter(this, result)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = dataAdapter
    }

}
