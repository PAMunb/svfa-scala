package br.unb.cic.android.specs

import br.unb.cic.android.AndroidTaintBenchTest

trait FakeplaySpec extends FlowdroidSpec {
//  URL https://github.com/TaintBench/fakeplay/blob/master/README.md
  override val sourceList = List(
    "<java.lang.System: java.lang.String getProperty(java.lang.String)>",
    "<java.lang.Float: float parseFloat(java.lang.String)>",
    "<java.lang.String: byte[] getBytes(java.lang.String)>",
    "<android.content.Intent: java.lang.String getStringExtra(java.lang.String)>",
    "<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)>",
    "<android.database.sqlite.SQLiteDatabase: android.database.Cursor query(java.lang.String,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,java.lang.String,java.lang.String)>",
    "<java.io.ByteArrayOutputStream: byte[] toByteArray()>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<java.lang.Class: java.lang.String getName()>",
    "<android.telephony.SmsMessage: java.lang.String getOriginatingAddress()>",
    "<android.app.PendingIntent: android.app.PendingIntent getBroadcast(android.content.Context,int,android.content.Intent,int)>",
    "<android.content.Intent: java.lang.String getAction()>",
    "<android.telephony.SmsMessage: java.lang.String getMessageBody()>",
    "<java.lang.Thread: java.lang.ClassLoader getContextClassLoader()>",
    "<android.app.admin.DevicePolicyManager: boolean isAdminActive(android.content.ComponentName)>",
    "<android.telephony.SmsMessage: android.telephony.SmsMessage createFromPdu(byte[])>",
    "<java.lang.ClassLoader: java.lang.ClassLoader getSystemClassLoader()>",
    "<android.content.Context: java.lang.Object getSystemService(java.lang.String)>",
    "<android.content.ContentResolver: android.net.Uri insert(android.net.Uri,android.content.ContentValues)>",
    "<java.util.ResourceBundle: java.util.ResourceBundle getBundle(java.lang.String,java.util.Locale,java.lang.ClassLoader)>",
    "<java.util.Calendar: long getTimeInMillis()>",
    "<java.lang.String: void getChars(int,int,char[],int)>",
    "<android.database.Cursor: java.lang.String getString(int)>",
    "<android.os.Bundle: java.lang.String getString(java.lang.String)>",
    "<android.app.PendingIntent: android.app.PendingIntent getService(android.content.Context,int,android.content.Intent,int)>",
    "<java.util.Locale: java.util.Locale getDefault()>",
    "<java.lang.String: byte[] getBytes()>",
    "<android.telephony.TelephonyManager: java.lang.String getSimOperatorName()>",
    "<java.util.Calendar: java.util.Calendar getInstance()>",
    "<android.telephony.TelephonyManager: java.lang.String getLine1Number()>",
    "<android.content.Intent: android.os.Bundle getExtras()>",
    "<android.os.Bundle: java.lang.Object get(java.lang.String)>",
    "<android.telephony.TelephonyManager: java.lang.String getNetworkOperatorName()>",
    "<android.os.PowerManager: android.os.PowerManager$WakeLock newWakeLock(int,java.lang.String)>",
    "<android.database.Cursor: int getInt(int)>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<java.util.ResourceBundle: java.lang.String getString(java.lang.String)>",
    "<java.util.Hashtable: java.lang.Object get(java.lang.Object)>",
    "<java.lang.ClassLoader: java.lang.Class loadClass(java.lang.String)>",
    "<android.webkit.WebView: android.webkit.WebSettings getSettings()>",
    "<android.telephony.TelephonyManager: java.lang.String getSimOperator()>",
    "<android.net.wifi.WifiManager: int getWifiState()>",
    "<java.io.ObjectInputStream: java.lang.Object readObject()>",
  )

  override val sinkList = List(
    "<java.lang.Float: float parseFloat(java.lang.String)>",
    "<java.lang.String: boolean startsWith(java.lang.String)>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<android.content.Intent: android.content.Intent setPackage(java.lang.String)>",
    "<android.webkit.WebSettings: void setAppCacheEnabled(boolean)>",
    "<java.util.Properties: java.lang.Object setProperty(java.lang.String,java.lang.String)>",
    "<java.lang.String: java.lang.String substring(int,int)>",
    "<android.webkit.WebSettings: void setCacheMode(int)>",
    "<android.database.sqlite.SQLiteDatabase: long insert(java.lang.String,java.lang.String,android.content.ContentValues)>",
    "<android.util.Log: int d(java.lang.String,java.lang.String)>",
    "<java.io.ObjectOutputStream: void writeObject(java.lang.Object)>",
    "<android.content.Intent: android.content.Intent setClassName(android.content.Context,java.lang.String)>",
    "<android.app.AlarmManager: void setRepeating(int,long,long,android.app.PendingIntent)>",
    "<android.content.Context: android.content.ComponentName startService(android.content.Intent)>",
    "<android.content.UriMatcher: void addURI(java.lang.String,java.lang.String,int)>",
    "<android.content.ContentValues: void put(java.lang.String,java.lang.String)>",
    "<android.app.AlarmManager: void set(int,long,android.app.PendingIntent)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,android.os.Parcelable)>",
    "<android.webkit.WebSettings: void setRenderPriority(android.webkit.WebSettings$RenderPriority)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,java.lang.String)>",
    "<java.net.URL: void <init>",
    "<android.webkit.WebSettings: void setJavaScriptEnabled(boolean)>",
    "<android.webkit.WebSettings: void setBuiltInZoomControls(boolean)>",
    "<android.content.IntentFilter: void setPriority(int)>",
    "<android.util.Log: int v(java.lang.String,java.lang.String)>",
    "<android.webkit.WebSettings: void setAllowFileAccess(boolean)>",
    "<android.database.sqlite.SQLiteDatabase: int update(java.lang.String,android.content.ContentValues,java.lang.String,java.lang.String[])>",
    "<android.content.ContentResolver: void notifyChange(android.net.Uri,android.database.ContentObserver)>",
    "<android.net.wifi.WifiManager: boolean setWifiEnabled(boolean)>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<android.app.Activity: void onCreate(android.os.Bundle)>",
    "<android.content.SharedPreferences$Editor: boolean commit()>",
    "<android.util.Log: int e(java.lang.String,java.lang.String)>",
    "<java.lang.Class: java.lang.Class forName(java.lang.String)>",
  )
}