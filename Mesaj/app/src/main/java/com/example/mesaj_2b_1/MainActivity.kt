package com.example.mesaj_2b_1

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Toast.makeText(this, "Uygulama Başlatıldı", Toast.LENGTH_LONG).show()
        Toast.makeText(this,"2.Mesaj Gösterildi",Toast.LENGTH_SHORT).show()
    }
    fun mesajGoster(view: View)
    {
        AlertDialog.Builder(this)
            .setTitle("UYARI!!!")
            .setMessage("Uygulamayı Kapatmak İstediğinizden Eminmisiniz?")
            .setPositiveButton("EVET") {_,_,->
                Toast.makeText(this,"Uygulama Kapatılacak",Toast.LENGTH_LONG).show()
                finish() //Uygulama Kapatılıyor
            }
            .setNegativeButton("HAYIR") {_,_,->
                Toast.makeText(this, "Kapatılma İşlemi İptal Edildi",Toast.LENGTH_LONG).show()
            }
                .show()
    }
}