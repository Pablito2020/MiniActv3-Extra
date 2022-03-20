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
            val value = if (binding.editText.text.isEmpty()) {
                getText(R.string.default_text_edittext)
            } else {
                binding.editText.text
            }
            intent.putExtra(ACTION_PICK_KEYS.RESULT.name, value)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}