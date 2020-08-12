package cl.sulcansystem.ciclovias

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ciromine.ciclobike.Ciclovia

class CicloviaAdapter (var lista:MutableList<Ciclovia>): RecyclerView.Adapter<CicloviaViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CicloviaViewHolder {
var itemView =LayoutInflater.from(parent.context).inflate(R.layout.item_ciclovia, parent, false)
    return CicloviaViewHolder(itemView)}

    override fun getItemCount(): Int {
return lista.size   }

    override fun onBindViewHolder(holder: CicloviaViewHolder, position: Int) {
        holder.comuna.text = lista[position].comuna
        holder.ciclovia.text = lista[position].nombre

    }

}
class CicloviaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
var comuna: TextView
    var ciclovia : TextView

    init {
        ciclovia = itemView.findViewById(R.id.ciclovia)
        comuna = itemView.findViewById(R.id.comuna)
    }
}