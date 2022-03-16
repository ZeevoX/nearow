package net.zeevox.nearow.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import net.zeevox.nearow.R
import net.zeevox.nearow.databinding.ActivityMainBinding
import net.zeevox.nearow.ui.fragment.PerformanceMonitorFragment


class MainActivity : AppCompatActivity() {

    /** for accessing UI elements, bind this activity to the XML */
    private lateinit var binding: ActivityMainBinding

    /** the UI fragment currently displayed in this activity */
    private lateinit var fragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Nearow)

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            fragment = PerformanceMonitorFragment()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.main_content, fragment)
                .commit()
        }
    }
}
