package russell.personal.demo.com.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import russell.personal.demo.com.coderswag.Model.Category
import russell.personal.demo.com.coderswag.R
import russell.personal.demo.com.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var  adaptor : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adaptor = ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                DataService.categories)
        categoryListView.adapter = adaptor
    }
}
