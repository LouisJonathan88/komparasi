// Terakhir dikerjakan: Senin, 12 Mei 2025
// NIM: 10122362
// Nama: Louis Jonathan Susanto Putra
// Kelas: Pemrograman Android 4

package com.example.viewbindingproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.viewbindingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var mahasiswa: Mahasiswa = Mahasiswa()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btnSimpan.setOnClickListener {
            mahasiswa.nim = binding.edtNim.text.toString()
            mahasiswa.nama = binding.edtNama.text.toString()
            binding.mahasiswa = mahasiswa
            Toast.makeText(this, "Data Berhasil Disimpan", Toast.LENGTH_SHORT).show()
        }

        }

    }
