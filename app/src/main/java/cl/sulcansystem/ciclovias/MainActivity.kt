package cl.sulcansystem.ciclovias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.ciromine.ciclobike.SetupCiclovias
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.adapter = CicloviaAdapter(SetupCiclovias().init())
    }

    fun SinFiltrar(){
        recycler.adapter = CicloviaAdapter(SetupCiclovias().init())

    }

    fun FiltrarLasCondes(){
        recycler.adapter = CicloviaAdapter(SetupCiclovias().condes())

    }
}