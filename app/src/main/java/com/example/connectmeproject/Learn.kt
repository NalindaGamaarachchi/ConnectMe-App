package com.example.connectmeproject

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
//import com.example.connectmeproject.databinding.ActivityLearnBinding

    class Learn {
    var name: String? = null
    var info: String? = null
    var img: String? = null

    constructor() {}

    constructor(
        name: String?,
        info: String?,
        img : String?
    )
    {
        this.name=name
        this.info = info
        this.img = img
    }
}
