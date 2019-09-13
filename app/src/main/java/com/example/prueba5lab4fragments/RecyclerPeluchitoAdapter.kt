package com.example.prueba5lab4fragments


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.peluchitos_item.view.*

class PeluchitosAdapter : RecyclerView.Adapter<PeluchitosAdapter.PeluchitosViewHolder>{

    //Creo la lista d epeluchits a enviar
    private var listPeluchito:List<Peluchito>?=null
    private var context:Context?=null

    constructor(listPeluchito:List<Peluchito>,context: Context){
        this.listPeluchito = listPeluchito
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeluchitosViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.peluchitos_item,parent,false)
        return PeluchitosViewHolder(view)
    }

    override fun getItemCount(): Int { //Obtengo cuantos objetos tiene mi lista
        return listPeluchito?.size!!
    }

    override fun onBindViewHolder(holder: PeluchitosViewHolder, position: Int) {
        var peluchito = listPeluchito!![position]
        holder.loadItem(peluchito)
    }



    class PeluchitosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private var peluchito:Peluchito?= null


        fun loadItem(peluchito: Peluchito){
            itemView.tvID.text = peluchito.id
            itemView.tvNombre.text = peluchito.nombre
            itemView.tvCantidad.text = peluchito.cantidad
            itemView.tvPrecio.text = peluchito.precio
        }

    }
}