package br.unb.cic.android.specs

import br.unb.cic.android.AndroidTaintBenchTest

trait SlockerAndroidSampSpec extends FlowdroidSpec {
//  URL https://github.com/TaintBench/slocker_android_samp/blob/master/README.md
  override val sourceList = List(
    "<java.io.BufferedReader: java.lang.String readLine()>",
    "<javax.crypto.Cipher: byte[] doFinal(byte[])>",
    "<java.util.Locale: java.lang.String getISO3Country()>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<java.security.SecureRandom: java.security.SecureRandom getInstance(java.lang.String,java.lang.String)>",
    "<android.app.ActivityManager: java.util.List getRunningTasks(int)>",
    "<android.os.Environment: java.io.File getExternalStorageDirectory()>",
    "<java.util.Date: int getYear()>",
    "<java.util.Date: int getDate()>",
    "<android.telephony.TelephonyManager: java.lang.String getDeviceId()>",
    "<org.apache.http.HttpEntity: java.io.InputStream getContent()>",
    "<java.io.FileInputStream: void <init>",
    "<javax.crypto.Cipher: javax.crypto.Cipher getInstance(java.lang.String)>",
    "<android.widget.EditText: android.text.Editable getText()>",
    "<android.content.Context: java.lang.Object getSystemService(java.lang.String)>",
    "<java.io.File: java.io.File[] listFiles()>",
    "<java.io.File: java.lang.String getName()>",
    "<javax.crypto.KeyGenerator: javax.crypto.KeyGenerator getInstance(java.lang.String)>",
    "<android.app.KeyguardManager: android.app.KeyguardManager$KeyguardLock newKeyguardLock(java.lang.String)>",
    "<java.util.Locale: java.util.Locale getDefault()>",
    "<java.io.File: void <init>",
    "<java.io.File: java.lang.String getAbsolutePath()>",
    "<java.lang.String: byte[] getBytes()>",
    "<android.net.ConnectivityManager: android.net.NetworkInfo getActiveNetworkInfo()>",
    "<android.os.PowerManager: android.os.PowerManager$WakeLock newWakeLock(int,java.lang.String)>",
    "<java.util.Date: int getMonth()>",
    "<android.view.KeyEvent: int getKeyCode()>",
    "<android.content.ComponentName: java.lang.String getPackageName()>",
    "<android.content.Context: java.lang.String getString(int)>",
    "<java.util.Calendar: int get(int)>",
  )

  override val sinkList = List(
    "<android.content.Intent: android.content.Intent setAction(java.lang.String)>",
    "<android.widget.ProgressBar: void setMax(int)>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<android.widget.Toast: void setGravity(int,int,int)>",
    "<android.app.ActivityManager: java.util.List getRunningTasks(int)>",
    "<android.view.Window: void setFlags(int,int)>",
    "<java.lang.String: java.lang.String substring(int,int)>",
    "<android.content.Intent: android.content.Intent setFlags(int)>",
    "<android.widget.Toast: android.widget.Toast makeText(android.content.Context,java.lang.CharSequence,int)>",
    "<android.content.Context: android.content.ComponentName startService(android.content.Intent)>",
    "<org.apache.http.entity.AbstractHttpEntity: void setContentEncoding(java.lang.String)>",
    "<java.security.SecureRandom: void setSeed(byte[])>",
    "<org.apache.http.entity.AbstractHttpEntity: void setContentType(java.lang.String)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,android.os.Parcelable)>",
    "<android.view.Window: void setType(int)>",
    "<android.widget.TextView: void setText(java.lang.CharSequence)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,java.lang.String)>",
    "<java.io.OutputStream: void write(byte[])>",
    "<android.widget.ProgressBar: void setProgress(int)>",
    "<android.util.Log: int v(java.lang.String,java.lang.String)>",
    "<java.io.FileOutputStream: void <init>",
    "<android.content.Context: void startActivity(android.content.Intent)>",
    "<org.apache.http.client.HttpClient: org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest)>",
    "<android.app.Activity: void onCreate(android.os.Bundle)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,int)>",
    "<android.util.Log: int e(java.lang.String,java.lang.String)>",
  )
}