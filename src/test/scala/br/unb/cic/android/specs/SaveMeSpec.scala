package br.unb.cic.android.specs

import br.unb.cic.android.AndroidTaintBenchTest

trait SaveMeSpec extends AndroidTaintBenchTest {
//  URL https://github.com/TaintBench/save_me/blob/master/README.md
  override val sourceList = List(
    "<android.content.Intent: java.lang.String getStringExtra(java.lang.String)>",
    "<android.net.Uri: java.lang.String getQueryParameter(java.lang.String)>",
    "<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)>",
    "<android.database.sqlite.SQLiteOpenHelper: android.database.sqlite.SQLiteDatabase getWritableDatabase()>",
    "<java.io.ByteArrayOutputStream: byte[] toByteArray()>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<android.net.wifi.WifiManager: android.net.wifi.WifiInfo getConnectionInfo()>",
    "<java.lang.Class: java.lang.String getSimpleName()>",
    "<java.net.URL: java.lang.String getPath()>",
    "<java.net.URL: java.lang.String getHost()>",
    "<java.lang.StackTraceElement: java.lang.String getClassName()>",
    "<java.util.Locale: java.lang.String getDisplayCountry()>",
    "<java.lang.Class: java.lang.ClassLoader getClassLoader()>",
    "<java.io.FileInputStream: void <init>",
    "<android.os.Parcel: java.util.ArrayList createTypedArrayList(android.os.Parcelable$Creator)>",
    "<java.lang.Class: java.lang.reflect.Method getMethod(java.lang.String,java.lang.Class[])>",
    "<android.webkit.WebView: void loadUrl(java.lang.String)>",
    "<android.database.sqlite.SQLiteDatabase: java.lang.String getPath()>",
    "<android.widget.ProgressBar: int getMax()>",
    "<android.database.sqlite.SQLiteDatabase: android.database.Cursor query(java.lang.String,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.lang.String)>",
    "<java.net.URL: java.lang.String getProtocol()>",
    "<java.net.HttpURLConnection: java.lang.String getResponseMessage()>",
    "<android.database.Cursor: java.lang.String getString(int)>",
    "<android.os.Bundle: java.lang.String getString(java.lang.String)>",
    "<java.util.Locale: java.util.Locale getDefault()>",
    "<java.security.MessageDigest: java.security.MessageDigest getInstance(java.lang.String)>",
    "<java.util.Calendar: java.util.Calendar getInstance()>",
    "<java.lang.String: byte[] getBytes()>",
    "<android.net.ConnectivityManager: android.net.NetworkInfo getActiveNetworkInfo()>",
    "<android.util.LruCache: java.lang.Object get(java.lang.Object)>",
    "<android.view.View: int getId()>",
    "<android.content.res.AssetFileDescriptor: long getDeclaredLength()>",
    "<java.lang.Class: java.lang.Class[] getClasses()>",
    "<android.telephony.TelephonyManager: java.lang.String getLine1Number()>",
    "<android.content.Intent: android.os.Bundle getExtras()>",
    "<android.telephony.TelephonyManager: java.lang.String getNetworkOperatorName()>",
    "<android.database.CursorWindow: int getNumRows()>",
    "<java.net.URL: java.io.InputStream openStream()>",
    "<java.security.MessageDigest: byte[] digest()>",
    "<android.net.wifi.WifiInfo: java.lang.String getMacAddress()>",
    "<android.database.sqlite.SQLiteDatabase: android.database.Cursor rawQuery(java.lang.String,java.lang.String[])>",
    "<android.view.Display: void getMetrics(android.util.DisplayMetrics)>",
    "<java.net.URISyntaxException: java.lang.String getMessage()>",
    "<android.content.Intent: android.net.Uri getData()>",
    "<java.util.Locale: java.lang.String getDisplayLanguage()>",
    "<java.nio.ByteBuffer: java.nio.ByteBuffer get(byte[])>",
    "<android.telephony.SmsManager: android.telephony.SmsManager getDefault()>",
    "<java.lang.Thread: java.lang.String getName()>",
    "<java.lang.String: byte[] getBytes(java.lang.String)>",
    "<java.io.BufferedReader: java.lang.String readLine()>",
    "<android.database.sqlite.SQLiteDatabase: android.database.Cursor query(java.lang.String,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,java.lang.String,java.lang.String)>",
    "<java.lang.StackTraceElement: int getLineNumber()>",
    "<java.lang.Double: double parseDouble(java.lang.String)>",
    "<java.lang.Class: java.lang.String getName()>",
    "<android.content.Context: java.io.FileInputStream openFileInput(java.lang.String)>",
    "<android.os.Environment: java.io.File getExternalStorageDirectory()>",
    "<java.net.HttpURLConnection: int getResponseCode()>",
    "<android.provider.Settings$Secure: java.lang.String getString(android.content.ContentResolver,java.lang.String)>",
    "<android.content.Intent: java.lang.String getAction()>",
    "<java.util.Calendar: java.util.Date getTime()>",
    "<org.apache.http.HttpEntity: java.io.InputStream getContent()>",
    "<android.database.Cursor: long getLong(int)>",
    "<java.util.Locale: java.lang.String getCountry()>",
    "<java.lang.reflect.Method: java.lang.Object invoke(java.lang.Object,java.lang.Object[])>",
    "<java.lang.Thread: java.lang.Thread$UncaughtExceptionHandler getDefaultUncaughtExceptionHandler()>",
    "<java.nio.ByteBuffer: java.nio.ByteBuffer get(byte[],int,int)>",
    "<android.telephony.TelephonyManager: java.lang.String getSimCountryIso()>",
    "<java.net.URLDecoder: java.lang.String decode(java.lang.String,java.lang.String)>",
    "<java.net.URL: int getPort()>",
    "<java.lang.Throwable: java.lang.StackTraceElement[] getStackTrace()>",
    "<android.widget.EditText: android.text.Editable getText()>",
    "<android.content.Context: java.lang.Object getSystemService(java.lang.String)>",
    "<java.io.File: boolean delete()>",
    "<android.content.ContentResolver: android.net.Uri insert(android.net.Uri,android.content.ContentValues)>",
    "<android.content.res.Resources: android.util.DisplayMetrics getDisplayMetrics()>",
    "<java.util.Locale: java.lang.String getLanguage()>",
    "<java.lang.Class: java.lang.String getCanonicalName()>",
    "<android.os.Bundle: boolean getBoolean(java.lang.String)>",
    "<android.content.res.Resources: int getIdentifier(java.lang.String,java.lang.String,java.lang.String)>",
    "<java.io.File: void <init>",
    "<java.util.concurrent.locks.ReentrantLock: int getHoldCount()>",
    "<android.content.res.AssetManager: java.io.InputStream open(java.lang.String)>",
    "<java.lang.Throwable: java.lang.Throwable getCause()>",
    "<java.lang.StackTraceElement: java.lang.String getMethodName()>",
    "<java.net.HttpURLConnection: java.io.InputStream getInputStream()>",
    "<java.lang.Long: long parseLong(java.lang.String)>",
    "<org.json.JSONObject: java.lang.Object get(java.lang.String)>",
    "<android.database.Cursor: int getInt(int)>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<android.content.res.Resources: android.content.res.Configuration getConfiguration()>",
    "<java.net.URLConnection: int getContentLength()>",
    "<android.content.Context: java.lang.String getString(int)>",
    "<java.lang.reflect.InvocationTargetException: java.lang.Throwable getCause()>",
  )

  override val sinkList = List(
    "<android.app.Dialog: void setContentView(int)>",
    "<android.content.Intent: android.content.Intent setData(android.net.Uri)>",
    "<android.util.Log: int e(java.lang.String,java.lang.String,java.lang.Throwable)>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<java.lang.String: java.lang.String substring(int,int)>",
    "<android.database.sqlite.SQLiteDatabase: long insert(java.lang.String,java.lang.String,android.content.ContentValues)>",
    "<android.util.Log: int w(java.lang.String,java.lang.String)>",
    "<android.util.Log: int i(java.lang.String,java.lang.String)>",
    "<org.apache.http.params.HttpConnectionParams: void setSoTimeout(org.apache.http.params.HttpParams,int)>",
    "<android.widget.Toast: android.widget.Toast makeText(android.content.Context,java.lang.CharSequence,int)>",
    "<android.content.ContentProviderOperation$Builder: android.content.ContentProviderOperation$Builder withValue(java.lang.String,java.lang.Object)>",
    "<android.widget.ProgressBar: void setVisibility(int)>",
    "<android.content.Context: android.content.ComponentName startService(android.content.Intent)>",
    "<android.content.ContentValues: void put(java.lang.String,java.lang.String)>",
    "<android.content.Intent: android.content.Intent setDataAndType(android.net.Uri,java.lang.String)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,android.os.Parcelable)>",
    "<java.io.OutputStream: void write(byte[],int,int)>",
    "<java.net.URL: void <init>",
    "<java.net.URL: java.net.URLConnection openConnection()>",
    "<android.widget.ProgressBar: void setProgress(int)>",
    "<java.io.DataOutputStream: void writeBytes(java.lang.String)>",
    "<java.io.OutputStream: void write(byte[])>",
    "<java.io.File: boolean setWritable(boolean,boolean)>",
    "<android.content.Context: void startActivity(android.content.Intent)>",
    "<android.util.Log: int d(java.lang.String,java.lang.String,java.lang.Throwable)>",
    "<org.apache.http.client.HttpClient: org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest)>",
    "<android.app.Dialog: void setTitle(java.lang.CharSequence)>",
    "<android.os.Bundle: void putString(java.lang.String,java.lang.String)>",
    "<android.app.Activity: void onCreate(android.os.Bundle)>",
    "<android.util.Log: int i(java.lang.String,java.lang.String,java.lang.Throwable)>",
    "<android.util.Log: int e(java.lang.String,java.lang.String)>",
    "<android.content.ContentProviderOperation$Builder: android.content.ContentProviderOperation$Builder withValueBackReference(java.lang.String,int)>",
    "<java.util.concurrent.ConcurrentHashMap: java.lang.Object put(java.lang.Object,java.lang.Object)>",
    "<java.lang.Class: java.lang.Class forName(java.lang.String)>",
    "<java.util.TreeSet: boolean add(java.lang.Object)>",
    "<android.util.Log: int v(java.lang.String,java.lang.String,java.lang.Throwable)>",
    "<java.lang.String: boolean startsWith(java.lang.String)>",
    "<android.telephony.SmsManager: void sendTextMessage(java.lang.String,java.lang.String,java.lang.String,android.app.PendingIntent,android.app.PendingIntent)>",
    "<java.io.File: boolean setReadable(boolean,boolean)>",
    "<org.apache.http.params.HttpConnectionParams: void setConnectionTimeout(org.apache.http.params.HttpParams,int)>",
    "<android.content.Intent: android.content.Intent setAction(java.lang.String)>",
    "<java.lang.Double: double parseDouble(java.lang.String)>",
    "<android.os.Handler: boolean sendMessage(android.os.Message)>",
    "<android.content.ContentValues: void put(java.lang.String,java.lang.Integer)>",
    "<java.lang.Thread: void setDefaultUncaughtExceptionHandler(java.lang.Thread$UncaughtExceptionHandler)>",
    "<android.view.Window: void setFlags(int,int)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,boolean)>",
    "<android.util.Log: int d(java.lang.String,java.lang.String)>",
    "<java.io.DataOutputStream: void write(byte[],int,int)>",
    "<java.io.DataOutputStream: void flush()>",
    "<java.lang.reflect.Method: java.lang.Object invoke(java.lang.Object,java.lang.Object[])>",
    "<java.nio.ByteBuffer: java.nio.ByteBuffer put(byte[],int,int)>",
    "<java.net.HttpURLConnection: void connect()>",
    "<android.util.Log: int w(java.lang.String,java.lang.String,java.lang.Throwable)>",
    "<java.io.File: boolean delete()>",
    "<android.widget.TextView: void setText(java.lang.CharSequence)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,java.lang.String)>",
    "<android.util.Log: int v(java.lang.String,java.lang.String)>",
    "<android.content.res.AssetManager: java.io.InputStream open(java.lang.String)>",
    "<java.io.PrintStream: void println(java.lang.Object)>",
    "<java.io.FileOutputStream: void <init>",
    "<java.io.FileOutputStream: void write(byte[])>",
    "<java.net.HttpURLConnection: java.io.InputStream getInputStream()>",
    "<android.database.sqlite.SQLiteDatabase: int update(java.lang.String,android.content.ContentValues,java.lang.String,java.lang.String[])>",
    "<java.lang.Long: long parseLong(java.lang.String)>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<android.content.Intent: android.content.Intent setComponent(android.content.ComponentName)>",
    "<android.os.Handler: boolean sendMessageDelayed(android.os.Message,long)>",
    "<android.content.SharedPreferences$Editor: boolean commit()>",
    "<java.net.HttpURLConnection: java.io.OutputStream getOutputStream()>",
    "<android.content.Intent: android.content.Intent putExtras(android.os.Bundle)>",
    "<android.content.ContentValues: void put(java.lang.String,java.lang.Long)>",
    "<java.util.HashMap: java.lang.Object put(java.lang.Object,java.lang.Object)>",
    "<java.net.HttpURLConnection: void setRequestMethod(java.lang.String)>",
  )
}