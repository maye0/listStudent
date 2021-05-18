package com.example.studentlist

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.studentlist.databinding.ActivityMainBinding
import com.xwray.groupie.ExpandableGroup
import com.xwray.groupie.GroupieAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.countriesRecyclerView.layoutManager = LinearLayoutManager(this)

        val student1 = ExpandableGroup(StudentItem("Mayerly"))
        student1.add(InformationItem("Mayerly", "Moreno", "68074", "301 000 00 00"))

        val student2 = ExpandableGroup(StudentItem("Juan"))
        student2.add(InformationItem("Juan Pablo", "Rodriguez", "77849", "315 555 66 99"))

        val adapter = GroupieAdapter()
        binding.countriesRecyclerView.adapter = adapter
        adapter.add(student1)
        adapter.add(student2)
    }
}