package ceui.lisa.adapters

import android.content.Context
import ceui.lisa.R
import ceui.lisa.databinding.RecyItemLiveBinding
import ceui.lisa.models.Live

class LiveAdapter(targetList: MutableList<Live>, context: Context) :
        BaseAdapter<Live, RecyItemLiveBinding>(targetList, context) {

    override fun bindData(target: Live?, bindView: ViewHolder<RecyItemLiveBinding>?, position: Int) {

    }

    override fun initLayout() {
        mLayoutID = R.layout.recy_item_live
    }
}