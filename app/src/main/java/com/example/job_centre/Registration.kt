

package com.example.job_centre



import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

open class  A{
    open fun F() {

    }
}

class  B : A() {
     override fun F(){

    }
}

 class Registration : AppCompatActivity() {

     //var Pref: SharedPreferences? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        //Pref = getSharedPreferences("Applicant", Context.MODE_PRIVATE)
    }

    fun ApplicantMe(view: View) {
        //1. Создать базовый(: AppCompactActivity()) класс твоих всех активити
        //2. Этот класс имеет метод abstract Initialization, где все твои виджеты появляются
        //3. В базовом классе:
            //обработка жизненных циклов активити(virtual/open)

        val email = findViewById<EditText>(R.id.editText1)
        val password1 = findViewById<EditText>(R.id.editText2)
        val password2 = findViewById<EditText>(R.id.editText3)
        val f_name = findViewById<EditText>(R.id.editText4)
        val m_name = findViewById<EditText>(R.id.editText5)
        val s_name = findViewById<EditText>(R.id.editText6)
        val d_birth = findViewById<EditText>(R.id.editText7)
        val phone = findViewById<EditText>(R.id.editText8)

        if (password1.text.toString() == password2.text.toString()) {

            // првоерка логина на уникальность

            val man: IRegistrationManager = ArrayRegistrationManager()
            man.PutData(email.text.toString(), password1.text.toString(), f_name.text.toString())
            val ApplicantIntent = Intent(this, Applicant::class.java)
            startActivity(ApplicantIntent)
            this.finish()
        }
        else {
            Toast.makeText(this, "Введенные пароли не совпадают", Toast.LENGTH_LONG).show()
            password1?.setText("")
            password2?.setText("")
        }
    }

    /*fun Save(res: ){
        val Edit = Pref?.edit()
        Edit
    }*/
}