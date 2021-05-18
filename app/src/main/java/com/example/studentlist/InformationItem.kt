package com.example.studentlist


import com.example.studentlist.databinding.InformationItemBinding
import com.xwray.groupie.databinding.BindableItem


class InformationItem (val name: String, val surname: String, val code: String,val phone: String): BindableItem<InformationItemBinding>() {
    override fun getLayout(): Int {
        return R.layout.information_item
    }

    override fun bind(viewBinding: InformationItemBinding, position: Int) {
        viewBinding.nameStudentInfo.text = name
        viewBinding.surnameStudentInfo.text = surname
        viewBinding.codeStudentInfo.text = code
        viewBinding.phoneStudentInfo.text = phone
    }
}