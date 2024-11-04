package com.example.bottomnavbar_travelapp

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.Html
import android.text.Spannable
import android.text.SpannableString
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavbar_travelapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.purple)))
        supportActionBar?.title = Html.fromHtml("<font color='#FFFFFF'><b>TravelApp</b></font>", HtmlCompat.FROM_HTML_MODE_LEGACY)
        with(binding){
            val navController = findNavController(R.id.nav_host_frament)
            bottomNavigationView.setupWithNavController(navController)
        }
    }
}