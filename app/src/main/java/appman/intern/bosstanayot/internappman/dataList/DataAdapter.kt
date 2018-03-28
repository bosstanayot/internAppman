package appman.intern.bosstanayot.internappman.dataList

import android.content.Context
import android.support.v7.app.AlertDialog
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import appman.intern.bosstanayot.internappman.R
import appman.intern.bosstanayot.internappman.dataList.model.Datas

class DataAdapter(val context: Context, val dataList: List<Datas>): RecyclerView.Adapter<DataAdapter.Holder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item, null, false)
        return Holder(inflater)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.textView.setText(dataList[position].docType)
        holder.cardView.setOnClickListener {
             AlertDialog.Builder(context)
                     .setMessage(dataList[position].description.th + "/" + dataList[position].description.en)
                     .setCancelable(true)
                     .show()
        }
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView = itemView.findViewById<TextView>(R.id.doc_type)
        var cardView = itemView.findViewById<CardView>(R.id.card_view)
    }

}


