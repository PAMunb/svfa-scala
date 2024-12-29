package br.unb.cic.android.specs

import br.unb.cic.android.TaintBenchSpec

trait ProxySampSpec extends TaintBenchSpec {
//  URL https://github.com/TaintBench/proxy_samp/blob/master/README.md
  override val sourceList = List(
    "<android.content.Intent: java.lang.String getStringExtra(java.lang.String)>",
    "<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)>",
    "<android.telephony.SmsMessage: long getTimestampMillis()>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<android.net.wifi.WifiManager: android.net.wifi.WifiInfo getConnectionInfo()>",
    "<java.lang.Class: java.lang.reflect.Field getDeclaredField(java.lang.String)>",
    "<android.telephony.TelephonyManager: java.lang.String getDeviceId()>",
    "<android.telephony.TelephonyManager: java.lang.String getNetworkOperator()>",
    "<java.lang.reflect.Field: java.lang.Object get(java.lang.Object)>",
    "<android.telephony.gsm.GsmCellLocation: int getLac()>",
    "<android.accounts.AccountManager: android.accounts.Account[] getAccounts()>",
    "<java.util.Calendar: long getTimeInMillis()>",
    "<android.net.ConnectivityManager: android.net.NetworkInfo getNetworkInfo(int)>",
    "<android.telephony.TelephonyManager: android.telephony.CellLocation getCellLocation()>",
    "<org.json.JSONObject: java.lang.String getString(java.lang.String)>",
    "<android.app.KeyguardManager: android.app.KeyguardManager$KeyguardLock newKeyguardLock(java.lang.String)>",
    "<android.accounts.AccountManager: android.accounts.AccountManager get(android.content.Context)>",
    "<android.os.Bundle: java.lang.String getString(java.lang.String)>",
    "<android.database.Cursor: java.lang.String getString(int)>",
    "<java.util.Calendar: java.util.Calendar getInstance()>",
    "<android.telephony.SmsMessage: java.lang.String getDisplayOriginatingAddress()>",
    "<android.content.Intent: android.os.Bundle getExtras()>",
    "<android.telephony.gsm.GsmCellLocation: int getCid()>",
    "<java.io.BufferedReader: java.lang.String readLine()>",
    "<android.net.NetworkInfo: java.lang.String getSubtypeName()>",
    "<android.net.NetworkInfo: android.net.NetworkInfo$State getState()>",
    "<java.lang.Class: java.lang.reflect.Method getDeclaredMethod(java.lang.String,java.lang.Class[])>",
    "<java.lang.Class: java.lang.String getName()>",
    "<android.os.Bundle: android.os.Bundle getBundle(java.lang.String)>",
    "<android.app.PendingIntent: android.app.PendingIntent getBroadcast(android.content.Context,int,android.content.Intent,int)>",
    "<android.os.Environment: java.io.File getExternalStorageDirectory()>",
    "<android.content.Intent: java.lang.String getAction()>",
    "<java.util.Calendar: java.util.Date getTime()>",
    "<org.apache.http.HttpEntity: java.io.InputStream getContent()>",
    "<android.database.Cursor: long getLong(int)>",
    "<android.telephony.SmsMessage: android.telephony.SmsMessage createFromPdu(byte[])>",
    "<java.lang.reflect.Method: java.lang.Object invoke(java.lang.Object,java.lang.Object[])>",
    "<android.net.wifi.WifiInfo: java.lang.String getSSID()>",
    "<android.content.Context: java.lang.Object getSystemService(java.lang.String)>",
    "<java.io.File: boolean delete()>",
    "<java.io.File: void <init>",
    "<java.io.File: java.lang.String getAbsolutePath()>",
    "<android.content.Intent: android.os.Parcelable getParcelableExtra(java.lang.String)>",
    "<android.telephony.SmsMessage: java.lang.String getDisplayMessageBody()>",
    "<android.os.Bundle: java.lang.Object get(java.lang.String)>",
    "<android.os.PowerManager: android.os.PowerManager$WakeLock newWakeLock(int,java.lang.String)>",
    "<android.net.NetworkInfo: java.lang.String getTypeName()>",
    "<android.database.Cursor: int getInt(int)>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
  )

  override val sinkList = List(
    "<java.io.File: boolean delete()>",
    "<org.json.JSONObject: org.json.JSONObject put(java.lang.String,int)>",
    "<org.json.JSONObject: org.json.JSONObject put(java.lang.String,boolean)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,android.os.Bundle)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,java.lang.String)>",
    "<java.lang.StringBuffer: void setLength(int)>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<java.io.BufferedWriter: void write(java.lang.String)>",
    "<org.json.JSONObject: org.json.JSONObject put(java.lang.String,java.lang.Object)>",
    "<org.apache.http.impl.client.DefaultHttpClient: org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest)>",
    "<java.lang.String: java.lang.String substring(int,int)>",
    "<android.util.Log: int i(java.lang.String,java.lang.String)>",
    "<org.apache.http.client.HttpClient: org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest)>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<android.app.Activity: void onCreate(android.os.Bundle)>",
    "<android.os.Bundle: void putString(java.lang.String,java.lang.String)>",
    "<android.app.AlarmManager: void setRepeating(int,long,long,android.app.PendingIntent)>",
    "<android.content.Context: android.content.ComponentName startService(android.content.Intent)>",
    "<android.content.SharedPreferences$Editor: boolean commit()>",
    "<java.lang.reflect.Method: java.lang.Object invoke(java.lang.Object,java.lang.Object[])>",
    "<java.lang.Class: java.lang.Class forName(java.lang.String)>",
  )
}