package br.unb.cic.android.specs

import br.unb.cic.android.AndroidTaintBenchTest

trait OverlayAndroidSampSpec extends AndroidTaintBenchTest {
//  URL https://github.com/TaintBench/overlay_android_samp/blob/master/README.md
  override val sourceList = List(
    "<android.view.View: int getWidth()>",
    "<android.content.Intent: java.lang.String getStringExtra(java.lang.String)>",
    "<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)>",
    "<android.content.res.Resources: int getInteger(int)>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<java.lang.Class: java.lang.reflect.Field getDeclaredField(java.lang.String)>",
    "<android.app.ActivityManager: java.util.List getRunningTasks(int)>",
    "<android.view.View: void getLocationOnScreen(int[])>",
    "<android.telephony.TelephonyManager: java.lang.String getDeviceId()>",
    "<android.telephony.TelephonyManager: int getPhoneType()>",
    "<java.util.logging.Logger: java.util.logging.Logger getLogger(java.lang.String)>",
    "<android.view.animation.AnimationUtils: android.view.animation.Animation loadAnimation(android.content.Context,int)>",
    "<android.view.MotionEvent: int getActionMasked()>",
    "<java.lang.Character: int getType(char)>",
    "<org.json.JSONObject: java.lang.String getString(java.lang.String)>",
    "<java.lang.Class: java.io.InputStream getResourceAsStream(java.lang.String)>",
    "<android.text.method.DigitsKeyListener: android.text.method.DigitsKeyListener getInstance(java.lang.String)>",
    "<android.database.Cursor: java.lang.String getString(int)>",
    "<android.content.Intent: int getFlags()>",
    "<android.content.Intent: android.os.Bundle getExtras()>",
    "<android.view.View: int getHeight()>",
    "<android.telephony.TelephonyManager: int getSimState()>",
    "<java.lang.Character: int getNumericValue(char)>",
    "<android.telephony.TelephonyManager: java.lang.String getSimOperator()>",
    "<android.view.View: android.os.IBinder getWindowToken()>",
    "<java.lang.Class: java.lang.String getName()>",
    "<android.content.Intent: android.content.Intent setClass(android.content.Context,java.lang.Class)>",
    "<android.telephony.SmsMessage: java.lang.String getOriginatingAddress()>",
    "<exts.whats.activities.Cards: android.view.View findViewById(int)>",
    "<java.lang.reflect.Field: int getInt(java.lang.Object)>",
    "<android.app.PendingIntent: android.app.PendingIntent getBroadcast(android.content.Context,int,android.content.Intent,int)>",
    "<android.provider.Settings$Secure: java.lang.String getString(android.content.ContentResolver,java.lang.String)>",
    "<android.content.Intent: java.lang.String getAction()>",
    "<android.telephony.SmsMessage: java.lang.String getMessageBody()>",
    "<android.content.res.Resources: int getColor(int)>",
    "<java.util.Locale: java.lang.String getCountry()>",
    "<android.app.admin.DevicePolicyManager: boolean isAdminActive(android.content.ComponentName)>",
    "<android.telephony.SmsMessage: android.telephony.SmsMessage createFromPdu(byte[])>",
    "<android.content.res.Resources: java.lang.String[] getStringArray(int)>",
    "<android.telephony.TelephonyManager: java.lang.String getSimCountryIso()>",
    "<android.widget.EditText: android.text.Editable getText()>",
    "<android.content.Context: java.lang.Object getSystemService(java.lang.String)>",
    "<android.app.ActivityManager: java.util.List getRunningAppProcesses()>",
    "<android.telephony.TelephonyManager: java.lang.String getNetworkCountryIso()>",
    "<java.util.LinkedHashMap: java.lang.Object get(java.lang.Object)>",
    "<android.os.Bundle: boolean getBoolean(java.lang.String)>",
    "<java.lang.Long: long parseLong(java.lang.String)>",
    "<android.os.Bundle: java.lang.Object get(java.lang.String)>",
    "<android.os.PowerManager: android.os.PowerManager$WakeLock newWakeLock(int,java.lang.String)>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<android.content.res.Resources: android.content.res.Configuration getConfiguration()>",
    "<android.content.ComponentName: java.lang.String getPackageName()>",
    "<android.content.Context: java.lang.String getString(int)>",
    "<android.net.wifi.WifiManager: android.net.wifi.WifiManager$WifiLock createWifiLock(int,java.lang.String)>",
    "<android.os.Looper: android.os.Looper getMainLooper()>",
  )

  override val sinkList = List(
    "<java.lang.String: boolean startsWith(java.lang.String)>",
    "<android.content.Intent: android.content.Intent setAction(java.lang.String)>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<org.apache.http.impl.client.DefaultHttpClient: org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest)>",
    "<android.app.ActivityManager: java.util.List getRunningTasks(int)>",
    "<android.content.Intent: android.content.Intent setClass(android.content.Context,java.lang.Class)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,boolean)>",
    "<java.lang.String: java.lang.String substring(int,int)>",
    "<android.view.animation.Animation: void setAnimationListener(android.view.animation.Animation$AnimationListener)>",
    "<android.media.AudioManager: void setRingerMode(int)>",
    "<android.content.Intent: android.content.Intent setFlags(int)>",
    "<android.app.AlarmManager: void setRepeating(int,long,long,android.app.PendingIntent)>",
    "<android.content.Context: android.content.ComponentName startService(android.content.Intent)>",
    "<android.widget.ImageView: void setImageResource(int)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,android.os.Parcelable)>",
    "<android.view.View: void setVisibility(int)>",
    "<java.lang.StringBuilder: void setLength(int)>",
    "<android.widget.TextView: void setText(java.lang.CharSequence)>",
    "<android.widget.ImageView: void setVisibility(int)>",
    "<org.json.JSONObject: org.json.JSONObject put(java.lang.String,boolean)>",
    "<java.util.regex.Matcher: java.lang.String replaceFirst(java.lang.String)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,java.lang.String)>",
    "<java.lang.StringBuilder: java.lang.StringBuilder replace(int,int,java.lang.String)>",
    "<org.json.JSONObject: org.json.JSONObject put(java.lang.String,java.lang.Object)>",
    "<java.util.logging.Logger: void log(java.util.logging.Level,java.lang.String)>",
    "<android.content.Context: void startActivity(android.content.Intent)>",
    "<java.lang.Long: long parseLong(java.lang.String)>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<android.app.Activity: void onCreate(android.os.Bundle)>",
    "<android.content.SharedPreferences$Editor: boolean commit()>",
    "<android.app.Activity: boolean onKeyDown(int,android.view.KeyEvent)>",
    "<java.util.logging.Logger: void log(java.util.logging.Level,java.lang.String,java.lang.Throwable)>",
    "<java.util.regex.Matcher: java.lang.String replaceAll(java.lang.String)>",
    "<exts.whats.activities.Cards: android.content.ComponentName startService(android.content.Intent)>",
    "<java.util.HashMap: java.lang.Object put(java.lang.Object,java.lang.Object)>",
  )
}