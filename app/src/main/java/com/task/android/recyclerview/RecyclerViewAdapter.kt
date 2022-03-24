package com.task.android.recyclerview

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.task.basic.R
import com.task.basic.databinding.RecyclerLayoutBinding

class RecyclerViewAdapter(
    private val context: Context,
    private val list: List<Int>,
    private val listener: OnClickListener
) :
    RecyclerView.Adapter<RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val binding = RecyclerLayoutBinding.bind(
            LayoutInflater.from(context).inflate(R.layout.recycler_layout, parent, false)
        )
        return RecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        with(holder.binding) {
            btnClearFromRV.setOnClickListener {
                etFromRV.setText(listener.onClearBtnClick())
            }

            etFromRV.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    if (p0?.isEmpty() == true) {
                        btnClearFromRV.visibility = View.INVISIBLE
                    } else
                        btnClearFromRV.visibility = View.VISIBLE
                }

                override fun afterTextChanged(p0: Editable?) {
                }
            })

            btnFromRV.setOnClickListener {
                val text = etFromRV.text.toString()
                if (text.isEmpty())
                    tvNoneFromRV.text = context.resources.getString(R.string.none)
                else
                    tvNoneFromRV.text = text
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface OnClickListener {
        fun onClearBtnClick(): String
    }
}

class RecyclerViewHolder(itemView: RecyclerLayoutBinding) : RecyclerView.ViewHolder(itemView.root) {
    val binding = itemView
}


























