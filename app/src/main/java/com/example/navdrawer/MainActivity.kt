package com.example.navdrawer

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.navdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        setSupportActionBar(binding.mainToolbar)
        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this@MainActivity,
            binding.drawerLayout,
            binding.mainToolbar,
            R.string.openNavDrawer,
            R.string.closeNavDrawer
        )

        binding.drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        binding.navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.folder -> {
                    toast("Folder clicked")
                    true
                }
                R.id.people -> {
                    toast("People clicked")
                    true
                }
                R.id.star -> {
                    toast("Star clicked")
                    true
                }
                R.id.access_time -> {
                    toast("Access clicked")
                    true
                }
                R.id.backup -> {
                    toast("Backup clicked")
                    true
                }
                R.id.settings_app -> {
                    toast("Settings app clicked")
                    true
                }
                R.id.power -> {
                    toast("Power clicked")
                    true
                }
                else -> false
            }
        }
    }

    private fun toast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}



















