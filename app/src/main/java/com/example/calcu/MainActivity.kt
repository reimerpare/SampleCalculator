package com.example.calcu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
/**
 * Main activity for calculator application.
 * @author Team Sheeshable
 */
class MainActivity() : AppCompatActivity(), Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    @SuppressLint("MissingInflatedId")
    /**
     * Responsible for behavior of UI in the Main Activity.
     * Also is responsible for the calculation of numerical values
     * placed within the UI.
     * @param savedInstanceState Bundle of saved instance state.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup);
        val num1 = findViewById<TextView>(R.id.num1);
        val num2 = findViewById<TextView>(R.id.num2);
        val answer = findViewById<TextView>(R.id.ans);

        radioGroup.setOnCheckedChangeListener { radioGroup, checkedID ->
            if (checkedID == R.id.add) {
                answer.text = (Integer.parseInt(num1.getText().toString()) + (Integer.parseInt(num2.getText().toString()))).toString();
            }
            if (checkedID == R.id.subtract) {
                answer.text = (Integer.parseInt(num1.getText().toString()) - (Integer.parseInt(num2.getText().toString()))).toString();
            }
            if (checkedID == R.id.multiply) {
                answer.text = (Integer.parseInt(num1.getText().toString()) * (Integer.parseInt(num2.getText().toString()))).toString();
            }
            if (checkedID == R.id.divide) {
                if (num1.getText().toString() == "0" || num2.getText().toString() == "0"){
                    answer.text = "0";
                } else {
                    answer.text = (Integer.parseInt(num1.getText().toString()) / (Integer.parseInt(num2.getText().toString()))).toString()
                }
            }


        }
    }

    /**
     * Empty placeholder function for override purposes.
     * @param parcel
     * @param flags
     */
    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    /**
     * Placeholder function for override purposes.
     * @return 0 int by default.
     */
    override fun describeContents(): Int {
        return 0
    }

    /**
     * Object creator for the Main Activity to create a Parcelable Creator object.
     */
    companion object CREATOR : Parcelable.Creator<MainActivity> {
        /**
         * Creates a Main Activity object from a Parcel object.package
         * @param parcel Parcel from which the main activity object will be created.
         * @return MainActivity Main activity that is created from the parcel object.
         */
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        /**
         * Function responsible for creating a new array from the Main Activity.
         * @param size Size of the new array.
         * return arrayOfNulls returns the size of the array.
         */
        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

}