package com.example.contatosbootcamp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ContactsAdapter(val contactsList: ArrayList<Contact>): RecyclerView.Adapter<ContactsAdapter.ViewHolder>(){

    //Realiza a criação da view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapter.ViewHolder {

        /*É necessario instaciar um LayoutInflate passando o context atual (parent.context), assim realizando
        o inflate do layout criado (R.layout.contact_view) passando seu parent (tela atual)*/
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_view, parent, false)
        return ViewHolder(view)
    }

    //Realiza o Bind do Item selecionado da Lista
    override fun onBindViewHolder(holder: ContactsAdapter.ViewHolder, position: Int) {
        holder.bindItem(contactsList[position])
    }

    //Retorna o Tamanho da Lista
    override fun getItemCount(): Int = contactsList.size


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //Realiza o Bind dos valores para o item.
        fun bindItem(contact: Contact){
            val textName = itemView.findViewById<TextView>(R.id.contact_name)
            val textPhoneNumber = itemView.findViewById<TextView>(R.id.contact_number)

            textName.text = contact.name
            textPhoneNumber.text = contact.phoneNumber
        }

    }


}