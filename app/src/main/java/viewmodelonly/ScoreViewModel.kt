package viewmodelonly

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData

class ScoreViewModel(application: Application): AndroidViewModel(application){

    var mScoreData = MutableLiveData<Int>()
    init {
        mScoreData.value = 0
    }

    fun getScoreData(): MutableLiveData<Int>{
        return mScoreData
    }

    fun setScoreData(value: Int){
        mScoreData.value = mScoreData.value!! + value
    }

}