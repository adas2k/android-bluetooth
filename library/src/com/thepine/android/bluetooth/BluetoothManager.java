package com.thepine.android.bluetooth;

import android.content.Context;

public class BluetoothManager{
	
	private static BluetoothManager mInstance = null;
	
	private Context mContext = null;
	
	private BluetoothManager(Context context) {
		this.mContext = context;
	}
	
	public synchronized BluetoothManager getInstance(Context context) {
		if(mInstance == null) {
			mInstance = new BluetoothManager(context);
		}
		return mInstance;
	}
	
	
	
}