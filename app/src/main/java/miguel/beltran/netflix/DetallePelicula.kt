package miguel.beltran.netflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*

class DetallePelicula : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        var bundle=intent.extras
        if(bundle!=null){
            detalle_imagen.setImageResource(bundle.getInt("header"))
            detalle_sinopsis.setText(bundle.getString("sinopsis"))
            detalle_titulo.setText(bundle.getString("titulo"))
        }
    }
}
