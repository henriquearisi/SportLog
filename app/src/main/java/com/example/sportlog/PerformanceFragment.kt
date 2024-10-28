package com.example.sportlog// com.example.sportlog.PerformanceFragment.kt
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class PerformanceFragment : Fragment() {

    private lateinit var etPerformance: EditText
    private lateinit var btnSavePerformance: Button
    private lateinit var tvSavedPerformance: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_performance, container, false)

        etPerformance = view.findViewById(R.id.et_performance)
        btnSavePerformance = view.findViewById(R.id.btn_save_performance)
        tvSavedPerformance = view.findViewById(R.id.tv_saved_performance)

        // Ao clicar no botão, exibir o texto salvo
        btnSavePerformance.setOnClickListener {
            val performanceText = etPerformance.text.toString()
            if (performanceText.isNotEmpty()) {
                tvSavedPerformance.text = "Desempenho Salvo: $performanceText"
            }
        }

        return view
    }
}
