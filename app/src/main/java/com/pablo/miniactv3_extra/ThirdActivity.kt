package com.pablo.miniactv3_extra

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pablo.miniactv3_extra.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.finishButton.setOnClickListener {
            val value = getResult()
            intent.putExtra("RESULT", value)
            setResult(RESULT_OK, intent)
            finish()
        }
    }

    private fun getResult(): String {
        if (binding.editText.text.isEmpty())
            return getText(R.string.default_text_edittext).toString()
        return binding.editText.text.toString()
    }
}