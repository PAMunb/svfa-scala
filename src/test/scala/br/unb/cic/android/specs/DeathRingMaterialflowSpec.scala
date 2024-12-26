package br.unb.cic.android.specs

import br.unb.cic.android.AndroidTaintBenchTest

trait DeathRingMaterialflowSpec extends FlowdroidSpec {
//  URL https://github.com/TaintBench/death_ring_materialflow/blob/master/README.md
  override val sourceList = List(
    "<android.content.Intent: java.lang.String getStringExtra(java.lang.String)>",
    "<java.io.ByteArrayOutputStream: byte[] toByteArray()>",
    "<android.net.wifi.WifiManager: android.net.wifi.WifiInfo getConnectionInfo()>",
    "<java.lang.Class: java.lang.reflect.Field getDeclaredField(java.lang.String)>",
    "<android.app.ActivityManager: java.util.List getRunningTasks(int)>",
    "<android.content.res.Resources: android.content.res.AssetManager getAssets()>",
    "<java.lang.Class: java.lang.reflect.Method getMethod(java.lang.String,java.lang.Class[])>",
    "<android.net.ConnectivityManager: android.net.NetworkInfo getNetworkInfo(int)>",
    "<android.os.StatFs: int getBlockSize()>",
    "<android.content.pm.PackageManager: java.util.List getInstalledPackages(int)>",
    "<android.os.StatFs: int getAvailableBlocks()>",
    "<android.app.KeyguardManager: android.app.KeyguardManager$KeyguardLock newKeyguardLock(java.lang.String)>",
    "<java.lang.String: byte[] getBytes()>",
    "<java.util.Calendar: java.util.Calendar getInstance()>",
    "<java.io.File: java.lang.String getPath()>",
    "<android.provider.Settings$System: int getInt(android.content.ContentResolver,java.lang.String,int)>",
    "<android.telephony.TelephonyManager: java.lang.String getLine1Number()>",
    "<org.json.JSONObject: long getLong(java.lang.String)>",
    "<android.app.Activity: android.view.WindowManager getWindowManager()>",
    "<android.telephony.gsm.SmsMessage: java.lang.String getDisplayOriginatingAddress()>",
    "<android.database.sqlite.SQLiteDatabase: android.database.Cursor rawQuery(java.lang.String,java.lang.String[])>",
    "<android.net.wifi.WifiInfo: java.lang.String getMacAddress()>",
    "<android.view.Display: void getMetrics(android.util.DisplayMetrics)>",
    "<android.telephony.TelephonyManager: java.lang.String getSimOperator()>",
    "<android.view.Display: int getWidth()>",
    "<java.io.BufferedReader: java.lang.String readLine()>",
    "<java.lang.Runtime: java.lang.Runtime getRuntime()>",
    "<java.lang.Double: double parseDouble(java.lang.String)>",
    "<android.content.Context: java.io.FileInputStream openFileInput(java.lang.String)>",
    "<android.app.PendingIntent: android.app.PendingIntent getBroadcast(android.content.Context,int,android.content.Intent,int)>",
    "<java.net.HttpURLConnection: int getResponseCode()>",
    "<android.content.Intent: java.lang.String getAction()>",
    "<android.net.NetworkInfo: java.lang.String getExtraInfo()>",
    "<android.telephony.gsm.SmsMessage: android.telephony.gsm.SmsMessage createFromPdu(byte[])>",
    "<java.security.SecureRandom: java.security.SecureRandom getInstance(java.lang.String)>",
    "<java.lang.Thread: java.lang.Thread$UncaughtExceptionHandler getDefaultUncaughtExceptionHandler()>",
    "<javax.crypto.Cipher: javax.crypto.Cipher getInstance(java.lang.String)>",
    "<android.content.Context: java.lang.Object getSystemService(java.lang.String)>",
    "<android.telephony.TelephonyManager: int getDataState()>",
    "<android.app.ActivityManager: java.util.List getRunningAppProcesses()>",
    "<android.content.ContentResolver: android.net.Uri insert(android.net.Uri,android.content.ContentValues)>",
    "<android.content.res.Resources: android.util.DisplayMetrics getDisplayMetrics()>",
    "<android.os.Environment: java.lang.String getExternalStorageState()>",
    "<android.content.res.Resources: int getIdentifier(java.lang.String,java.lang.String,java.lang.String)>",
    "<android.graphics.BitmapFactory: android.graphics.Bitmap decodeStream(java.io.InputStream)>",
    "<java.util.HashMap: java.lang.Object get(java.lang.Object)>",
    "<android.content.res.AssetManager: java.io.InputStream open(java.lang.String)>",
    "<java.lang.Throwable: java.lang.Throwable getCause()>",
    "<java.net.HttpURLConnection: java.io.InputStream getInputStream()>",
    "<java.lang.reflect.Field: java.lang.String getName()>",
    "<android.app.PendingIntent: android.app.PendingIntent getActivity(android.content.Context,int,android.content.Intent,int)>",
    "<android.os.Bundle: java.lang.Object get(java.lang.String)>",
    "<android.database.Cursor: int getInt(int)>",
    "<android.content.ComponentName: java.lang.String getPackageName()>",
    "<android.content.Context: java.lang.String getString(int)>",
    "<android.telephony.gsm.SmsMessage: java.lang.String getDisplayMessageBody()>",
    "<org.json.JSONObject: int getInt(java.lang.String)>",
    "<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<java.lang.Class: java.lang.String getSimpleName()>",
    "<java.text.DateFormat: java.lang.String format(java.util.Date)>",
    "<org.json.JSONObject: org.json.JSONObject getJSONObject(java.lang.String)>",
    "<android.content.ComponentName: java.lang.String getClassName()>",
    "<android.telephony.TelephonyManager: java.lang.String getDeviceId()>",
    "<java.lang.reflect.Field: java.lang.Object get(java.lang.Object)>",
    "<android.app.ActivityManager: java.util.List getRunningServices(int)>",
    "<java.io.FileInputStream: void <init>",
    "<javax.crypto.KeyGenerator: javax.crypto.KeyGenerator getInstance(java.lang.String)>",
    "<org.json.JSONObject: java.lang.String getString(java.lang.String)>",
    "<android.database.Cursor: java.lang.String getString(int)>",
    "<android.net.ConnectivityManager: android.net.NetworkInfo getActiveNetworkInfo()>",
    "<java.lang.Class: java.lang.reflect.Field[] getDeclaredFields()>",
    "<android.content.Intent: android.os.Bundle getExtras()>",
    "<android.content.Intent: java.lang.String getDataString()>",
    "<android.telephony.TelephonyManager: java.lang.String getSubscriberId()>",
    "<java.util.Hashtable: java.lang.Object get(java.lang.Object)>",
    "<android.content.res.Resources: android.graphics.drawable.Drawable getDrawable(int)>",
    "<java.util.Calendar: int get(int)>",
    "<android.database.sqlite.SQLiteDatabase: android.database.Cursor query(java.lang.String,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,java.lang.String,java.lang.String)>",
    "<javax.crypto.Cipher: byte[] doFinal(byte[])>",
    "<android.net.NetworkInfo: android.net.NetworkInfo$State getState()>",
    "<java.lang.Class: java.lang.reflect.Method getDeclaredMethod(java.lang.String,java.lang.Class[])>",
    "<java.lang.Class: java.lang.String getName()>",
    "<android.content.pm.ResolveInfo: java.lang.CharSequence loadLabel(android.content.pm.PackageManager)>",
    "<android.location.LocationManager: java.util.List getProviders(boolean)>",
    "<android.os.Environment: java.io.File getExternalStorageDirectory()>",
    "<android.telephony.gsm.SmsManager: android.telephony.gsm.SmsManager getDefault()>",
    "<java.lang.reflect.Method: java.lang.Object invoke(java.lang.Object,java.lang.Object[])>",
    "<android.provider.Settings$System: java.lang.String getString(android.content.ContentResolver,java.lang.String)>",
    "<java.io.File: boolean delete()>",
    "<java.io.LineNumberReader: java.lang.String readLine()>",
    "<android.media.AudioManager: int getRingerMode()>",
    "<android.content.Intent: int getIntExtra(java.lang.String,int)>",
    "<java.io.File: void <init>",
    "<java.io.File: java.lang.String getAbsolutePath()>",
    "<android.net.ConnectivityManager: android.net.NetworkInfo[] getAllNetworkInfo()>",
    "<android.os.PowerManager: android.os.PowerManager$WakeLock newWakeLock(int,java.lang.String)>",
    "<android.net.NetworkInfo: java.lang.String getTypeName()>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<org.json.JSONObject: org.json.JSONArray getJSONArray(java.lang.String)>",
    "<android.view.Display: int getHeight()>",
  )

  override val sinkList = List(
    "<android.content.Intent: android.content.Intent setData(android.net.Uri)>",
    "<java.io.FileWriter: void write(java.lang.String)>",
    "<android.util.Log: int e(java.lang.String,java.lang.String,java.lang.Throwable)>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<android.content.Intent: android.content.Intent setPackage(java.lang.String)>",
    "<java.io.FileOutputStream: void write(byte[],int,int)>",
    "<org.apache.http.impl.client.DefaultHttpClient: org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest)>",
    "<android.app.ActivityManager: java.util.List getRunningTasks(int)>",
    "<java.lang.String: java.lang.String substring(int,int)>",
    "<java.io.OutputStreamWriter: void <init>",
    "<android.database.sqlite.SQLiteDatabase: long insert(java.lang.String,java.lang.String,android.content.ContentValues)>",
    "<android.util.Log: int w(java.lang.String,java.lang.String)>",
    "<android.util.Log: int i(java.lang.String,java.lang.String)>",
    "<android.os.Handler: boolean sendEmptyMessage(int)>",
    "<android.os.Handler: boolean sendEmptyMessageDelayed(int,long)>",
    "<org.apache.http.params.HttpConnectionParams: void setSoTimeout(org.apache.http.params.HttpParams,int)>",
    "<android.widget.RemoteViews: void setImageViewResource(int,int)>",
    "<android.widget.Toast: android.widget.Toast makeText(android.content.Context,java.lang.CharSequence,int)>",
    "<android.widget.RemoteViews: void setImageViewBitmap(int,android.graphics.Bitmap)>",
    "<android.content.Context: android.content.ComponentName startService(android.content.Intent)>",
    "<android.app.ActivityManager: java.util.List getRunningServices(int)>",
    "<android.content.ContentValues: void put(java.lang.String,java.lang.String)>",
    "<android.content.Intent: android.content.Intent setDataAndType(android.net.Uri,java.lang.String)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,android.os.Parcelable)>",
    "<android.app.Notification: void setLatestEventInfo(android.content.Context,java.lang.CharSequence,java.lang.CharSequence,android.app.PendingIntent)>",
    "<java.net.URL: void <init>",
    "<java.net.URL: java.net.URLConnection openConnection()>",
    "<android.media.AudioManager: void setVibrateSetting(int,int)>",
    "<java.io.OutputStream: void write(byte[])>",
    "<java.io.DataOutputStream: void writeBytes(java.lang.String)>",
    "<android.content.Context: void startActivity(android.content.Intent)>",
    "<java.lang.Thread: void setPriority(int)>",
    "<org.apache.http.client.HttpClient: org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest)>",
    "<android.os.Parcel: void writeFloatArray(float[])>",
    "<android.widget.ImageView: void setImageBitmap(android.graphics.Bitmap)>",
    "<android.app.Activity: void onCreate(android.os.Bundle)>",
    "<android.util.Log: int e(java.lang.String,java.lang.String)>",
    "<java.lang.Class: java.lang.Class forName(java.lang.String)>",
    "<java.lang.String: boolean startsWith(java.lang.String)>",
    "<android.app.NotificationManager: void notify(int,android.app.Notification)>",
    "<android.os.Parcel: void writeIntArray(int[])>",
    "<android.content.Intent: android.content.Intent setAction(java.lang.String)>",
    "<org.apache.http.params.HttpConnectionParams: void setConnectionTimeout(org.apache.http.params.HttpParams,int)>",
    "<android.os.Handler: boolean sendMessage(android.os.Message)>",
    "<java.lang.Double: double parseDouble(java.lang.String)>",
    "<android.content.ContentValues: void put(java.lang.String,java.lang.Integer)>",
    "<java.lang.Thread: void setDefaultUncaughtExceptionHandler(java.lang.Thread$UncaughtExceptionHandler)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,boolean)>",
    "<java.lang.ProcessBuilder: java.lang.Process start()>",
    "<android.util.Log: int d(java.lang.String,java.lang.String)>",
    "<android.content.Intent: android.content.Intent setFlags(int)>",
    "<android.media.AudioManager: void setRingerMode(int)>",
    "<android.app.AlarmManager: void setRepeating(int,long,long,android.app.PendingIntent)>",
    "<java.io.DataOutputStream: void flush()>",
    "<java.lang.reflect.Method: java.lang.Object invoke(java.lang.Object,java.lang.Object[])>",
    "<java.security.SecureRandom: void setSeed(byte[])>",
    "<android.app.AlarmManager: void set(int,long,android.app.PendingIntent)>",
    "<java.net.HttpURLConnection: void connect()>",
    "<android.util.Log: int w(java.lang.String,java.lang.String,java.lang.Throwable)>",
    "<java.io.File: boolean delete()>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,java.lang.String)>",
    "<android.widget.RemoteViews: void setTextViewText(int,java.lang.CharSequence)>",
    "<android.content.IntentFilter: void setPriority(int)>",
    "<android.telephony.gsm.SmsManager: void sendTextMessage(java.lang.String,java.lang.String,java.lang.String,android.app.PendingIntent,android.app.PendingIntent)>",
    "<android.content.res.AssetManager: java.io.InputStream open(java.lang.String)>",
    "<java.io.FileOutputStream: void <init>",
    "<java.io.FileOutputStream: void write(byte[])>",
    "<java.net.HttpURLConnection: java.io.InputStream getInputStream()>",
    "<android.widget.ImageView: void setImageDrawable(android.graphics.drawable.Drawable)>",
    "<java.lang.ProcessBuilder: java.lang.ProcessBuilder command(java.lang.String[])>",
    "<android.database.sqlite.SQLiteDatabase: int update(java.lang.String,android.content.ContentValues,java.lang.String,java.lang.String[])>",
    "<android.content.Intent: android.content.Intent setClassName(java.lang.String,java.lang.String)>",
    "<android.net.wifi.WifiManager: boolean setWifiEnabled(boolean)>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<android.os.AsyncTask: void onPostExecute(java.lang.Object)>",
    "<android.content.Intent: android.content.Intent setComponent(android.content.ComponentName)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,int)>",
    "<android.app.Activity: boolean onKeyDown(int,android.view.KeyEvent)>",
    "<android.content.SharedPreferences$Editor: boolean commit()>",
    "<java.util.HashMap: java.lang.Object put(java.lang.Object,java.lang.Object)>",
  )
}