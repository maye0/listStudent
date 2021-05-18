package com.example.studentlist

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.studentlist.databinding.StudentItemBinding
import com.xwray.groupie.ExpandableGroup
import com.xwray.groupie.ExpandableItem
import com.xwray.groupie.databinding.BindableItem

class StudentItem(val name: String): BindableItem<StudentItemBinding>(), ExpandableItem{

    lateinit var myExpandableGroup: ExpandableGroup

    override fun getLayout(): Int {
        return R.layout.student_item
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun bind(viewBinding: StudentItemBinding, position: Int) {
        viewBinding.nameStudent.text = name
        viewBinding.toggleButton.setOnClickListener {
            myExpandableGroup.onToggleExpanded()
            if(myExpandableGroup.isExpanded) {
                viewBinding.toggleButton.text = "Ocultar"
                viewBinding.root.setBackgroundColor(viewBinding.root.context.getColor(R.color.morado))
            } else {
                viewBinding.toggleButton.text = "Desplegar"
                viewBinding.root.setBackgroundColor(viewBinding.root.context.getColor(R.color.white))
            }
        }
    }

    override fun setExpandableGroup(onToggleListener: ExpandableGroup) {
        this.myExpandableGroup = onToggleListener
    }


}