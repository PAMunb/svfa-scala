package br.unb.cic.android.specs

import br.unb.cic.android.AndroidTaintBenchTest

trait BeitaComBeitaContactSpec extends FlowdroidSpec {

  override val sourceList = List(
    "<org.json.JSONObject: int getInt(java.lang.String)>",
    "<android.content.Intent: java.lang.String getStringExtra(java.lang.String)>",
    "<android.location.Location: double getLatitude()>",
    "<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)>",
    "<org.json.JSONArray: java.lang.String getString(int)>",
    "<android.location.LocationManager: android.location.Location getLastKnownLocation(java.lang.String)>",
    "<java.io.ByteArrayOutputStream: byte[] toByteArray()>",
    "<android.os.HandlerThread: android.os.Looper getLooper()>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<java.util.Date: long getTime()>",
    "<android.net.wifi.WifiManager: android.net.wifi.WifiInfo getConnectionInfo()>",
    "<java.lang.Class: java.lang.String getSimpleName()>",
    "<java.text.DateFormat: java.lang.String format(java.util.Date)>",
    "<java.util.Calendar: java.util.TimeZone getTimeZone()>",
    "<android.os.Message: android.os.Bundle getData()>",
    "<android.app.AlertDialog$Builder: android.app.AlertDialog show()>",
    "<android.net.NetworkInfo: int getType()>",
    "<android.telephony.TelephonyManager: java.lang.String getDeviceId()>",
    "<java.lang.Thread: java.lang.ClassLoader getContextClassLoader()>",
    "<java.lang.reflect.Field: java.lang.Object get(java.lang.Object)>",
    "<org.json.JSONArray: org.json.JSONArray put(int,java.lang.Object)>",
    "<java.io.FileInputStream: void <init>",
    "<java.lang.ClassLoader: java.lang.ClassLoader getSystemClassLoader()>",
    "<java.util.ResourceBundle: java.util.ResourceBundle getBundle(java.lang.String,java.util.Locale,java.lang.ClassLoader)>",
    "<android.net.ConnectivityManager: android.net.NetworkInfo getNetworkInfo(int)>",
    "<java.lang.String: void getChars(int,int,char[],int)>",
    "<java.io.File: java.lang.String getName()>",
    "<org.json.JSONObject: java.lang.String getString(java.lang.String)>",
    "<android.database.Cursor: java.lang.String getString(int)>",
    "<android.os.Bundle: java.lang.String getString(java.lang.String)>",
    "<java.util.Locale: java.util.Locale getDefault()>",
    "<java.security.MessageDigest: java.security.MessageDigest getInstance(java.lang.String)>",
    "<java.lang.String: byte[] getBytes()>",
    "<android.net.ConnectivityManager: android.net.NetworkInfo getActiveNetworkInfo()>",
    "<android.telephony.TelephonyManager: java.lang.String getNetworkOperatorName()>",
    "<java.security.MessageDigest: byte[] digest()>",
    "<org.json.JSONArray: org.json.JSONArray getJSONArray(int)>",
    "<android.net.wifi.WifiInfo: java.lang.String getMacAddress()>",
    "<android.view.Display: void getMetrics(android.util.DisplayMetrics)>",
    "<java.util.Hashtable: java.lang.Object get(java.lang.Object)>",
    "<android.content.Intent: android.net.Uri getData()>",
    "<java.io.ObjectInputStream: java.lang.Object readObject()>",
    "<java.lang.System: java.lang.String getProperty(java.lang.String)>",
    "<java.io.File: java.lang.String getParent()>",
    "<java.io.BufferedReader: java.lang.String readLine()>",
    "<java.lang.String: byte[] getBytes(java.lang.String)>",
    "<android.net.NetworkInfo: java.lang.String getSubtypeName()>",
    "<android.net.NetworkInfo: android.net.NetworkInfo$State getState()>",
    "<java.lang.Runtime: java.lang.Runtime getRuntime()>",
    "<java.lang.Double: double parseDouble(java.lang.String)>",
    "<java.util.Calendar: java.util.Calendar getInstance(java.util.Locale)>",
    "<java.lang.Class: java.lang.String getName()>",
    "<android.content.Context: java.io.FileInputStream openFileInput(java.lang.String)>",
    "<android.os.Environment: java.io.File getExternalStorageDirectory()>",
    "<android.content.Intent: java.lang.String getAction()>",
    "<android.view.View: java.lang.Object getTag()>",
    "<android.net.NetworkInfo: java.lang.String getExtraInfo()>",
    "<org.apache.http.HttpEntity: java.io.InputStream getContent()>",
    "<java.util.Locale: java.lang.String getCountry()>",
    "<android.content.res.Resources: java.lang.String[] getStringArray(int)>",
    "<android.widget.EditText: android.text.Editable getText()>",
    "<android.content.Context: java.lang.Object getSystemService(java.lang.String)>",
    "<java.io.File: boolean delete()>",
    "<android.content.ContentResolver: android.net.Uri insert(android.net.Uri,android.content.ContentValues)>",
    "<android.os.Environment: java.lang.String getExternalStorageState()>",
    "<android.view.KeyEvent: int getRepeatCount()>",
    "<java.io.File: void <init>",
    "<java.io.File: java.lang.String getAbsolutePath()>",
    "<java.net.HttpURLConnection: java.io.InputStream getInputStream()>",
    "<java.lang.reflect.Field: java.lang.String getName()>",
    "<java.lang.Class: java.lang.reflect.Field getField(java.lang.String)>",
    "<android.app.PendingIntent: android.app.PendingIntent getActivity(android.content.Context,int,android.content.Intent,int)>",
    "<android.os.Bundle: java.lang.Object get(java.lang.String)>",
    "<android.database.sqlite.SQLiteQueryBuilder: android.database.Cursor query(android.database.sqlite.SQLiteDatabase,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,java.lang.String,java.lang.String)>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<android.content.res.Resources: android.content.res.Configuration getConfiguration()>",
    "<android.content.Context: java.lang.String getString(int)>",
    "<java.util.ResourceBundle: java.lang.String getString(java.lang.String)>",
    "<java.lang.ClassLoader: java.lang.Class loadClass(java.lang.String)>",
    "<android.location.Location: double getLongitude()>",
    "<org.json.JSONObject: org.json.JSONArray getJSONArray(java.lang.String)>",
    "<org.json.JSONArray: org.json.JSONObject getJSONObject(int)>",
  )

  override val sinkList = List(
    "<android.content.Intent: android.content.Intent setData(android.net.Uri)>",
    "<javax.mail.Transport: void sendMessage(javax.mail.Message,javax.mail.Address[])>",
    "<org.json.JSONObject: org.json.JSONObject put(java.lang.String,int)>",
    "<android.util.Log: int e(java.lang.String,java.lang.String,java.lang.Throwable)>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<java.io.BufferedWriter: void write(java.lang.String)>",
    "<java.io.FileOutputStream: void write(byte[],int,int)>",
    "<org.apache.http.impl.client.DefaultHttpClient: org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest)>",
    "<java.lang.String: java.lang.String substring(int,int)>",
    "<android.database.sqlite.SQLiteDatabase: long insert(java.lang.String,java.lang.String,android.content.ContentValues)>",
    "<java.io.OutputStreamWriter: void <init>",
    "<android.util.Log: int w(java.lang.String,java.lang.String)>",
    "<android.util.Log: int i(java.lang.String,java.lang.String)>",
    "<android.os.Handler: boolean sendEmptyMessage(int)>",
    "<android.view.View: void setTag(java.lang.Object)>",
    "<org.apache.http.params.HttpConnectionParams: void setSoTimeout(org.apache.http.params.HttpParams,int)>",
    "<android.widget.RemoteViews: void setImageViewResource(int,int)>",
    "<android.widget.Toast: android.widget.Toast makeText(android.content.Context,java.lang.CharSequence,int)>",
    "<android.widget.LinearLayout: void setGravity(int)>",
    "<android.content.UriMatcher: void addURI(java.lang.String,java.lang.String,int)>",
    "<android.content.ContentValues: void put(java.lang.String,java.lang.String)>",
    "<android.content.Intent: android.content.Intent setDataAndType(android.net.Uri,java.lang.String)>",
    "<android.app.Notification: void setLatestEventInfo(android.content.Context,java.lang.CharSequence,java.lang.CharSequence,android.app.PendingIntent)>",
    "<java.net.URL: void <init>",
    "<java.net.URL: java.net.URLConnection openConnection()>",
    "<android.database.sqlite.SQLiteQueryBuilder: void setTables(java.lang.String)>",
    "<java.io.DataOutputStream: void writeBytes(java.lang.String)>",
    "<org.json.JSONObject: org.json.JSONObject put(java.lang.String,java.lang.Object)>",
    "<android.content.Context: void startActivity(android.content.Intent)>",
    "<org.apache.http.client.HttpClient: org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest)>",
    "<android.app.Activity: void onCreate(android.os.Bundle)>",
    "<java.util.zip.Deflater: void setInput(byte[])>",
    "<android.os.Bundle: void putString(java.lang.String,java.lang.String)>",
    "<android.util.Log: int i(java.lang.String,java.lang.String,java.lang.Throwable)>",
    "<android.widget.ArrayAdapter: void setDropDownViewResource(int)>",
    "<android.util.Log: int e(java.lang.String,java.lang.String)>",
    "<java.lang.Class: java.lang.Class forName(java.lang.String)>",
    "<android.widget.TextView: void setTextColor(int)>",
    "<android.app.NotificationManager: void notify(int,android.app.Notification)>",
    "<android.content.Intent: android.content.Intent setAction(java.lang.String)>",
    "<org.apache.http.params.HttpConnectionParams: void setConnectionTimeout(org.apache.http.params.HttpParams,int)>",
    "<java.lang.Double: double parseDouble(java.lang.String)>",
    "<android.os.Handler: boolean sendMessage(android.os.Message)>",
    "<org.apache.http.conn.params.ConnManagerParams: void setTimeout(org.apache.http.params.HttpParams,long)>",
    "<android.content.Intent: android.content.Intent setFlags(int)>",
    "<java.io.ObjectOutputStream: void writeObject(java.lang.Object)>",
    "<java.io.DataOutputStream: void write(byte[],int,int)>",
    "<java.io.DataOutputStream: void flush()>",
    "<org.json.JSONObject: org.json.JSONObject put(java.lang.String,double)>",
    "<java.net.HttpURLConnection: void connect()>",
    "<android.view.View: void setVisibility(int)>",
    "<org.json.JSONObject: org.json.JSONObject put(java.lang.String,long)>",
    "<java.io.File: boolean delete()>",
    "<android.widget.TextView: void setText(java.lang.CharSequence)>",
    "<android.widget.ImageView: void setVisibility(int)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,java.lang.String)>",
    "<android.widget.RemoteViews: void setTextViewText(int,java.lang.CharSequence)>",
    "<java.net.HttpURLConnection: java.io.InputStream getInputStream()>",
    "<java.io.FileOutputStream: void <init>",
    "<java.io.FileOutputStream: void write(byte[])>",
    "<android.os.Message: void setData(android.os.Bundle)>",
    "<android.database.sqlite.SQLiteDatabase: int update(java.lang.String,android.content.ContentValues,java.lang.String,java.lang.String[])>",
    "<android.content.ContentResolver: void notifyChange(android.net.Uri,android.database.ContentObserver)>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<android.os.AsyncTask: void onPostExecute(java.lang.Object)>",
    "<android.content.SharedPreferences$Editor: boolean commit()>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,int)>",
    "<java.net.HttpURLConnection: java.io.OutputStream getOutputStream()>",
    "<android.widget.RemoteViews: void setProgressBar(int,int,int,boolean)>",
    "<java.net.HttpURLConnection: void setRequestMethod(java.lang.String)>",
  )
}