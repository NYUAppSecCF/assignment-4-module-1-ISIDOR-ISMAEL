package com.example.giftcardsite.api.model

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.location.Location
import android.location.LocationListener

class Reporter(private val token: String) : LocationListener, SensorEventListener {
    override fun onLocationChanged(location: Location) {
        // Metric collection removed
    }

    override fun onSensorChanged(event: SensorEvent?) {
        // Metric collection removed
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        return
    }
}