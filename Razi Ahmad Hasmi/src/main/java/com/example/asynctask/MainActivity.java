package com.example.asynctask;

import static android.os.Build.VERSION_CODES.O;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        TextView tv_lat, tv_lon;
        ImageView iv_map;
        private LocationManager lm;
        private double LAT;
        private double LON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lm = (LocationManager) getSystemService(LOCATION_SERVICE);

        LocationListener listener = new MyLocation();

        lm.requestLocationUpdates(lm.GPS_PROVIDER, O, O, LocationListener);
    }

    private class MyLocation implements LocationListener{

        public void onLocationChanged(Location location){

            LAT = location.getLatitude();
        }
    }
    private class GetMap extends AsyncTask<void, void, Bitmap>{

        @Override
        protected Bitmap doInBackground(Params... params) {
            return null;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
        }
    }
}