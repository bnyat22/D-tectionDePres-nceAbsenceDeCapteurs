package com.example.searchforindisponsibleseonsors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SensorManager sensorManager;
    private TextView textView;
    private StringBuffer buffer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        buffer = new StringBuffer();
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        checkSensors();
    }



    public void checkSensors()
    {

    if (sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) == null)
    {
        buffer.append("The accelerometer sensor is not available so you miss the orientation " +
                "as per the device position from horizontal to vertical and vice-versa. To provide a comfortable viewing experience to the users," +
                " it measures the position and orientation change of the screens " + "\r\n");
    }

    if (sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER_UNCALIBRATED) == null)
    {
     buffer.append("ACCELEROMETER_UNCALIBRATED sensor is not available so you miss the functionality that" +
             "An uncalibrated accelerometer sensor reports the acceleration of the device along the three " +
             "sensor axes without any bias correction" + "\r\n");
    }

        if (sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE) == null)
        {
            buffer.append("AMBIENT_TEMPERATURE sensor is not available " +
                    "so you can't measure the tempreature" + "\r\n");
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_GAME_ROTATION_VECTOR) == null)
        {
            buffer.append("GAME_ROTATION_VECTOR sensor is not available so you can't do the rotation " +
                    "vector component along the x axis (x * sin(θ/2))." + "\r\n");
        }

        if (sensorManager.getDefaultSensor(Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR) == null)
        {
            buffer.append("GEOMAGNETIC_ROTATION_VECTOR sensor is not available so you can't do " +
                    "the rotation vector component along the x axis (x * sin(θ/2))." + "\r\n");
        }

        if (sensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY) == null)
        {
            buffer.append("Gravity sensor is not available so you miss those functionalities like" +
                    " it allows your device to automatically switch between landscape and portrait modes," +
                    " count your daily steps, identify viewing orientation, use compass apps, and recognize " +
                    "motion gestures (such as picking up and flipping your device). For example," +
                    " you can use your device's gravity sensor to control a moving ball or" +
                    " steer a race car in games, shake to switch songs, flip to mute ringtones, and so on." + "\r\n");
        }

        if (sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY) == null)
        {
            buffer.append("Proxomity sensor is not available so you miss detecting the presence of nearby objects." +
                    " Equipped with a proximity sensor, your device automatically turns off the screen when it detects" +
                    " that it is close to your ear. This helps prevent possible misoperations." + "\r\n");
        }

        if (sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT) == null)
        {
            buffer.append("Light sensor is not available so you miss the functionality that " +
                    "automatically adjusts the screen brightness of your device according to the amount of ambient light," +
                    " making it more comfortable to look at the screen." +
                    " The sensor not only supports automatic white balance (AWB) when taking photos," +
                    " but also works with the proximity sensor to prevent misoperations when, " +
                    "for example, the device is in your pocket." + "\r\n");
        }

        if (sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE) == null)
        {
            buffer.append("DEVICE_PRIVATE_BASE sensor is not available which " +
                    "allows you to play somatic games with your device, move your device " +
                    "to switch the view in games, and navigate when GPS services are not available. " +
                    "The gyroscope is also used in VR activities, 3D photography, panoramic navigation," +
                    " and so on. (Some models do not have this sensor." + "\r\n");
        }

        if (sensorManager.getDefaultSensor(Sensor.TYPE_HEART_BEAT) == null)
        {
            buffer.append("heart_beat sensor is not available which indicates your heartbeat" + "\r\n");
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_LOW_LATENCY_OFFBODY_DETECT) == null)
        {
            buffer.append("Low latency sensor is not available which describes the law latency of  body detect sensor" + "\r\n");
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD) == null)
        {
            buffer.append("Magnetic field sensor is not available so you can't receive messages in " +
                    "the form of a varying magnetic field produced by a nearby electromagnet." + "\r\n");
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_MOTION_DETECT) == null)
        {
            buffer.append("Motion detect sensor is not available so you can't detect motions " + "\r\n");
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR) == null)
        {
            buffer.append("set detector sensor is not available you can't use those functionalities " +
                    "which would be useful for counting individual steps" + "\r\n");
        }

        if (sensorManager.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY) == null)
        {
            buffer.append("Relativ_Humidity sensor is not available you can't use those functionalities " +
                    "which would be useful for measuring humidity of your device" + "\r\n");
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_STATIONARY_DETECT) == null)
        {
            buffer.append("Statitionary detect sensor is not available you can't use those functionalities " +
                    "which would be useful for traffic data from a temporary deployment of stationary sensors to the Traffic Monitoring Centre (TMC) gateways. " +
                    "Such a temporary deployment is meant to support applications utilized " +
                    "for future planning decisions by local authorities." + "\r\n");
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_DEVICE_PRIVATE_BASE) == null)
        {
            buffer.append("DEVICE_PRIVATE_BASE sensor is not available " + "\r\n");
        }
textView.setText(buffer);
}


}
