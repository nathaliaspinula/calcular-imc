package br.com.nat.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Calculate(v: View) {
        val height = inputHeight.text.toString().toDoubleOrNull()
        val weight = inputWeight.text.toString().toDoubleOrNull()

        if (height != null && weight != null) {
            val imc = weight/(height*height)

            if(imc < 18.5){
                txtResult.setText("Resultado: ${imc} - Abaixo do Peso")
            } else if (imc >= 18.5 && imc <= 24.9) {
                txtResult.setText("Resultado: ${imc} - Peso Normal")
            } else if (imc >= 25 && imc <= 29.9) {
                txtResult.setText("Resultado: ${imc} - Sobrepeso")
            } else if (imc >= 30 && imc <= 34.9) {
                txtResult.setText("Resultado: ${imc} - Obesidade Grau 1")
            } else if (imc >= 35 && imc <= 39.9){
                txtResult.setText("Resultado: ${imc} - Obesidade Grau 2")
            } else if (imc >= 40){
                txtResult.setText("Resultado: ${imc} - Obesidade Grau 3")
            }
        } else {
            txtResult.setText("É necessário preencher o valor do peso e da altura.")
        }
    }
}
