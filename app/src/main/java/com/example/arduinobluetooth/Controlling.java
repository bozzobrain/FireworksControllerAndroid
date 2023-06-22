package com.example.arduinobluetooth;


import android.app.Activity;
import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.AsyncTask;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.UUID;

public class Controlling extends Activity {
    private static final String TAG = "BlueTest5-Controlling";
    private int mMaxChars = 50000;//Default//change this to string..........
    private UUID mDeviceUUID;
    private BluetoothSocket mBTSocket;
    private ReadInput mReadThread = null;

    private boolean mIsUserInitiatedDisconnect = false;
    private boolean mIsBluetoothConnected = false;


    private Button mBtnDisconnect;
    private BluetoothDevice mDevice;

    //final static String on="9";//on
    //final static String off="12";//off
    final static String[] on={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L"};//on


    private ProgressDialog progressDialog;
    Button Mortor1;
    Button Mortor2;
    Button Mortor3;
    Button Mortor4;
    Button Mortor5;
    Button Mortor6;
    Button Mortor7;
    Button Mortor8;
    Button Mortor9;
    Button Mortor10;
    Button Mortor11;
    Button Mortor12;
    Button Aux1;
    Button Aux2;
    Button Aux3;
    Button ms_100;
    Button ms_250;
    Button ms_500;
    Button ms_1000;
    Button ms_2000;
    Button ms_5000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controlling);

        ActivityHelper.initialize(this);
        // mBtnDisconnect = (Button) findViewById(R.id.btnDisconnect);
        Mortor1=(Button)findViewById(R.id.Mortor1);
        Mortor2=(Button)findViewById(R.id.Mortor2);
        Mortor3=(Button)findViewById(R.id.Mortor3);
        Mortor4=(Button)findViewById(R.id.Mortor4);
        Mortor5=(Button)findViewById(R.id.Mortor5);
        Mortor6=(Button)findViewById(R.id.Mortor6);
        Mortor7=(Button)findViewById(R.id.Mortor7);
        Mortor8=(Button)findViewById(R.id.Mortor8);
        Mortor9=(Button)findViewById(R.id.Mortor9);
        Mortor10=(Button)findViewById(R.id.Mortor10);
        Mortor11=(Button)findViewById(R.id.Mortor11);
        Mortor12=(Button)findViewById(R.id.Mortor12);

        ms_100=(Button)findViewById(R.id.ms_100);
        ms_250=(Button)findViewById(R.id.ms_250);
        ms_500=(Button)findViewById(R.id.ms_500);
        ms_1000=(Button)findViewById(R.id.ms_1000);
        ms_2000=(Button)findViewById(R.id.ms_2000);
        ms_5000=(Button)findViewById(R.id.ms_5000);

        Aux1=(Button)findViewById(R.id.Aux1);
        Aux2=(Button)findViewById(R.id.Aux2);
        Aux3=(Button)findViewById(R.id.Aux3);


        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        mDevice = b.getParcelable(MainActivity.DEVICE_EXTRA);
        mDeviceUUID = UUID.fromString(b.getString(MainActivity.DEVICE_UUID));
        mMaxChars = b.getInt(MainActivity.BUFFER_SIZE);

        Log.d(TAG, "Ready");
        Mortor1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[1].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Mortor2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[2].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        Mortor3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[3].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Mortor4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[4].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Mortor5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[5].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Mortor6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[6].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Mortor7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[7].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Mortor8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[8].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Mortor9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[9].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Mortor10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[10].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Mortor11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[11].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Mortor12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[12].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        ms_100.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[16].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        ms_250.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[17].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        ms_500.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[18].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        ms_1000.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[19].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        ms_2000.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[20].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        ms_5000.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[21].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        Aux1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[13].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        Aux2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[14].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        Aux3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    mBTSocket.getOutputStream().write(on[15].getBytes());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });


    }

    private class ReadInput implements Runnable {

        private boolean bStop = false;
        private Thread t;

        public ReadInput() {
            t = new Thread(this, "Input Thread");
            t.start();
        }

        public boolean isRunning() {
            return t.isAlive();
        }

        @Override
        public void run() {
            InputStream inputStream;

            try {
                inputStream = mBTSocket.getInputStream();
                while (!bStop) {
                    byte[] buffer = new byte[256];
                    if (inputStream.available() > 0) {
                        inputStream.read(buffer);
                        int i = 0;
                        /*
                         * This is needed because new String(buffer) is taking the entire buffer i.e. 256 chars on Android 2.3.4 http://stackoverflow.com/a/8843462/1287554
                         */
                        for (i = 0; i < buffer.length && buffer[i] != 0; i++) {
                        }
                        final String strInput = new String(buffer, 0, i);

                        /*
                         * If checked then receive text, better design would probably be to stop thread if unchecked and free resources, but this is a quick fix
                         */



                    }
                    Thread.sleep(500);
                }
            } catch (IOException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InterruptedException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

        public void stop() {
            bStop = true;
        }

    }

    private class DisConnectBT extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
        }

        @Override
        protected Void doInBackground(Void... params) {//cant inderstand these dotss

            if (mReadThread != null) {
                mReadThread.stop();
                while (mReadThread.isRunning())
                    ; // Wait until it stops
                mReadThread = null;

            }

            try {
                mBTSocket.close();
            } catch (IOException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            mIsBluetoothConnected = false;
            if (mIsUserInitiatedDisconnect) {
                finish();
            }
        }

    }

    private void msg(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        if (mBTSocket != null && mIsBluetoothConnected) {
            new DisConnectBT().execute();
        }
        Log.d(TAG, "Paused");
        super.onPause();
    }

    @Override
    protected void onResume() {
        if (mBTSocket == null || !mIsBluetoothConnected) {
            new ConnectBT().execute();
        }
        Log.d(TAG, "Resumed");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "Stopped");
        super.onStop();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
// TODO Auto-generated method stub
        super.onSaveInstanceState(outState);
    }

    private class ConnectBT extends AsyncTask<Void, Void, Void> {
        private boolean mConnectSuccessful = true;

        @Override
        protected void onPreExecute() {

            progressDialog = ProgressDialog.show(Controlling.this, "Hold on", "Connecting");// http://stackoverflow.com/a/11130220/1287554

        }

        @Override
        protected Void doInBackground(Void... devices) {

            try {
                if (mBTSocket == null || !mIsBluetoothConnected) {
                    mBTSocket = mDevice.createInsecureRfcommSocketToServiceRecord(mDeviceUUID);
                    BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
                    mBTSocket.connect();
                }
            } catch (IOException e) {
// Unable to connect to device`
                // e.printStackTrace();
                mConnectSuccessful = false;



            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);

            if (!mConnectSuccessful) {
                Toast.makeText(getApplicationContext(), "Could not connect to device.Please turn on your Hardware", Toast.LENGTH_LONG).show();
                finish();
            } else {
                msg("Connected to device");
                mIsBluetoothConnected = true;
                mReadThread = new ReadInput(); // Kick off input reader
            }

            progressDialog.dismiss();
        }

    }
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
    }
}