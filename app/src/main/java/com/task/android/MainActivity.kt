package com.task.android

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.task.android.recyclerview.RecyclerViewAdapter
import com.task.basic.R
import com.task.basic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), RecyclerViewAdapter.OnClickListener {
    lateinit var binding: ActivityMainBinding

    var count: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        forConstraintLayout()
        forRelativeLayout()
        forFrameLayout()
    }

    private fun forConstraintLayout() {
        with(binding) {
            btnFromCL.setOnClickListener {
                if (count == 1) {
                    btnFromCL.text = resources.getString(R.string.changed_text)
                    count--
                } else {
                    btnFromCL.text = resources.getString(R.string.reverted_text)
                    count++
                }
            }
        }
    }

    private fun forRelativeLayout() {
        with(binding) {
            btnFromRL.setOnClickListener {
                val text = etFromRL.text.toString()
                if (text.isEmpty())
                    tvFromETRL.text = resources.getString(R.string.none)
                else
                    tvFromETRL.text = text
            }

            btnClearFromRL.setOnClickListener {
                etFromRL.setText("")
            }

            etFromRL.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    character: CharSequence?,
                    start: Int,
                    count: Int,
                    before: Int
                ) {

                }

                override fun onTextChanged(
                    character: CharSequence?,
                    start: Int,
                    before: Int,
                    count: Int
                ) {
                    if (character?.isEmpty() == true) {
                        btnClearFromRL.visibility = View.INVISIBLE
                    } else
                        btnClearFromRL.visibility = View.VISIBLE
                }

                override fun afterTextChanged(p0: Editable?) {

                }
            })
        }
    }

    private fun forFrameLayout() {
        with(binding) {
            val list = listOf(1, 2, 3, 4, 5)
            val adapter = RecyclerViewAdapter(this@MainActivity, list, this@MainActivity)
            rvFromFL.layoutManager = LinearLayoutManager(this@MainActivity)
            rvFromFL.adapter = adapter
        }
    }

    override fun onClearBtnClick(): String {
        return ""
    }
}
