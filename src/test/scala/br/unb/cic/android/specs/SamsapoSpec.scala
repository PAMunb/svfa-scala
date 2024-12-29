package br.unb.cic.android.specs

import br.unb.cic.android.TaintBenchSpec

trait SamsapoSpec extends TaintBenchSpec {
//  URL https://github.com/TaintBench/samsapo/blob/master/README.md
  override val sourceList = List(
    "<java.io.BufferedReader: java.lang.String readLine()>",
    "<android.content.Intent: java.lang.String getStringExtra(java.lang.String)>",
    "<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<java.lang.Runtime: java.lang.Runtime getRuntime()>",
    "<java.lang.Class: java.lang.reflect.Method getDeclaredMethod(java.lang.String,java.lang.Class[])>",
    "<java.lang.Class: java.lang.String getName()>",
    "<android.app.PendingIntent: android.app.PendingIntent getBroadcast(android.content.Context,int,android.content.Intent,int)>",
    "<android.content.ComponentName: java.lang.String getClassName()>",
    "<android.os.Environment: java.io.File getExternalStorageDirectory()>",
    "<android.content.Intent: java.lang.String getAction()>",
    "<android.telephony.gsm.SmsMessage: android.telephony.gsm.SmsMessage createFromPdu(byte[])>",
    "<java.lang.reflect.Method: java.lang.Object invoke(java.lang.Object,java.lang.Object[])>",
    "<java.lang.Throwable: java.lang.String getMessage()>",
    "<android.telephony.gsm.SmsManager: android.telephony.gsm.SmsManager getDefault()>",
    "<android.app.ActivityManager: java.util.List getRunningServices(int)>",
    "<android.telephony.TelephonyManager: java.lang.String getSimCountryIso()>",
    "<java.lang.Class: java.lang.reflect.Method getMethod(java.lang.String,java.lang.Class[])>",
    "<java.util.ArrayList: java.lang.Object get(int)>",
    "<android.content.Context: java.lang.Object getSystemService(java.lang.String)>",
    "<java.io.File: boolean delete()>",
    "<android.database.Cursor: java.lang.String getString(int)>",
    "<java.io.File: java.lang.String getAbsolutePath()>",
    "<java.io.File: void <init>",
    "<java.net.HttpURLConnection: java.io.InputStream getInputStream()>",
    "<android.telephony.TelephonyManager: java.lang.String getLine1Number()>",
    "<android.net.ConnectivityManager: android.net.NetworkInfo[] getAllNetworkInfo()>",
    "<android.content.Intent: android.os.Bundle getExtras()>",
    "<android.os.Bundle: java.lang.Object get(java.lang.String)>",
    "<android.telephony.TelephonyManager: java.lang.String getNetworkOperatorName()>",
    "<android.database.Cursor: int getInt(int)>",
    "<android.net.NetworkInfo: java.lang.String getTypeName()>",
    "<android.telephony.gsm.SmsMessage: java.lang.String getOriginatingAddress()>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<android.telephony.gsm.SmsMessage: java.lang.String getMessageBody()>",
  )

  override val sinkList = List(
    "<android.content.Intent: android.content.Intent setAction(java.lang.String)>",
    "<android.widget.ProgressBar: void setMax(int)>",
    "<android.content.Intent: android.content.Intent setPackage(java.lang.String)>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<java.io.FileOutputStream: void write(byte[],int,int)>",
    "<android.content.Intent: android.content.Intent setFlags(int)>",
    "<android.app.AlarmManager: void setRepeating(int,long,long,android.app.PendingIntent)>",
    "<java.lang.reflect.Method: java.lang.Object invoke(java.lang.Object,java.lang.Object[])>",
    "<android.content.Context: android.content.ComponentName startService(android.content.Intent)>",
    "<android.app.ActivityManager: java.util.List getRunningServices(int)>",
    "<android.content.Intent: android.content.Intent setDataAndType(android.net.Uri,java.lang.String)>",
    "<java.net.HttpURLConnection: void connect()>",
    "<java.io.File: boolean delete()>",
    "<android.widget.TextView: void setText(java.lang.CharSequence)>",
    "<java.net.URL: void <init>",
    "<java.net.URL: java.net.URLConnection openConnection()>",
    "<android.widget.ProgressBar: void setProgress(int)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,java.lang.String[])>",
    "<android.telephony.gsm.SmsManager: void sendTextMessage(java.lang.String,java.lang.String,java.lang.String,android.app.PendingIntent,android.app.PendingIntent)>",
    "<java.io.FileOutputStream: void <init>",
    "<java.net.HttpURLConnection: java.io.InputStream getInputStream()>",
    "<android.content.Context: void startActivity(android.content.Intent)>",
    "<com.android.tools.system.MyPostRequest: android.os.AsyncTask execute(java.lang.Object[])>",
    "<org.apache.http.client.HttpClient: org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest)>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<android.os.AsyncTask: void onPostExecute(java.lang.Object)>",
    "<android.app.Activity: void onCreate(android.os.Bundle)>",
    "<android.content.SharedPreferences$Editor: boolean commit()>",
    "<java.lang.Class: java.lang.Class forName(java.lang.String)>",
    "<java.net.HttpURLConnection: void setRequestMethod(java.lang.String)>",
  )
}