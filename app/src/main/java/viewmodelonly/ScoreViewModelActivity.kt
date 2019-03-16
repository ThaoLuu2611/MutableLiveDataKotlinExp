package viewmodelonly

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.thao.livedatakotlinexp.R
import kotlinx.android.synthetic.main.viewmodel_main.*

class ScoreViewModelActivity: AppCompatActivity(), LifecycleOwner{
    lateinit var scoreViewModel: ScoreViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.viewmodel_main)
        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)
        scoreViewModel.getScoreData().observe(this, Observer{
            int -> tvMark.setText(int.toString())
        })

        btnAdd.setOnClickListener{view -> scoreViewModel.setScoreData(1)}
    }


}