package com.example.project_1_komparasi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project_1_komparasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var edtValueNim: EditText
//    private lateinit var edtValueNama: EditText
//    private lateinit var btnValueSimpan: Button
//    private lateinit var txtValuenim: TextView
//    private lateinit var txtValuenama: TextView

    private lateinit var binding: ActivityMainBinding

    var nim: String = ""
    var nama: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSimpan.setOnClickListener {
            nim = binding.edtNim.text.toString()
            nama = binding.edtNama.text.toString()

            binding.txtNim.text = "NIM : " + nim
            binding.txtNama.text = "NAMA : " + nama

            Toast.makeText(this, "Data Berhasil Disimpan", Toast.LENGTH_SHORT).show()
        }

//        (Manual pke findviewbyId)
//        setContentView(R.layout.activity_main)

//        edtValueNim = findViewById(R.id.edt_nim)
//        edtValueNama = findViewById(R.id.edt_nama)
//        btnValueSimpan = findViewById(R.id.btn_simpan)
//        txtValuenim = findViewById(R.id.txt_nim)
//        txtValuenama = findViewById(R.id.txt_nama)

//        btnValueSimpan.setOnClickListener {
//            nim = edtValueNim.text.toString()
//            nama = edtValueNama.text.toString()
//            txtValuenim.text = "NIM :" + nim
//            txtValuenama.text = "NAMA : " + nama
//            Toast.makeText(this, "Data Berhasil Disimpan", Toast.LENGTH_SHORT).show()
//        }


    }
}