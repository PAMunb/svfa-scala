package br.unb.cic.android.specs

import br.unb.cic.android.FlowdroidSpec

trait RoidSecSpec extends FlowdroidSpec {

  override val sourceList = List(
    "<android.telephony.SmsManager: android.telephony.SmsManager getDefault()>",
    "<android.os.Environment: java.io.File getDataDirectory()>",
    "<java.lang.String: byte[] getBytes(java.lang.String)>",
    "<java.io.BufferedReader: java.lang.String readLine()>",
    "<android.location.Location: double getLatitude()>",
    "<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)>",
    "<android.location.LocationManager: android.location.Location getLastKnownLocation(java.lang.String)>",
    "<java.io.ByteArrayOutputStream: byte[] toByteArray()>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<java.net.InetAddress: java.net.InetAddress getByName(java.lang.String)>",
    "<android.os.StatFs: int getBlockCount()>",
    "<android.content.Intent: android.content.Intent setClass(android.content.Context,java.lang.Class)>",
    "<android.app.PendingIntent: android.app.PendingIntent getBroadcast(android.content.Context,int,android.content.Intent,int)>",
    "<android.os.Environment: java.io.File getExternalStorageDirectory()>",
    "<android.telephony.TelephonyManager: java.lang.String getDeviceId()>",
    "<java.net.Socket: java.io.OutputStream getOutputStream()>",
    "<java.net.Socket: java.io.InputStream getInputStream()>",
    "<android.location.LocationManager: java.lang.String getBestProvider(android.location.Criteria,boolean)>",
    "<android.net.wifi.WifiManager: java.util.List getScanResults()>",
    "<android.telephony.SmsManager: java.util.ArrayList divideMessage(java.lang.String)>",
    "<java.io.File: boolean delete()>",
    "<android.os.StatFs: int getBlockSize()>",
    "<java.io.File: java.io.File[] listFiles()>",
    "<android.os.Environment: java.lang.String getExternalStorageState()>",
    "<java.io.File: java.lang.String getName()>",
    "<android.content.pm.PackageManager: java.util.List getInstalledPackages(int)>",
    "<android.os.StatFs: int getAvailableBlocks()>",
    "<android.database.Cursor: java.lang.String getString(int)>",
    "<java.io.File: void <init>",
    "<java.io.File: java.lang.String getAbsolutePath()>",
    "<java.lang.String: byte[] getBytes()>",
    "<android.location.LocationManager: boolean isProviderEnabled(java.lang.String)>",
    "<java.io.File: java.lang.String getPath()>",
    "<java.lang.Long: long parseLong(java.lang.String)>",
    "<android.telephony.TelephonyManager: java.lang.String getLine1Number()>",
    "<android.os.PowerManager: android.os.PowerManager$WakeLock newWakeLock(int,java.lang.String)>",
    "<android.telephony.TelephonyManager: java.lang.String getNetworkOperatorName()>",
    "<android.database.Cursor: int getInt(int)>",
    "<android.location.Location: double getLongitude()>",
    "<android.net.wifi.WifiManager: int getWifiState()>",
  )

  override val sinkList = List(
    "<java.io.File: boolean delete()>",
    "<android.media.MediaRecorder: void setOutputFile(java.lang.String)>",
    "<android.telephony.SmsManager: void sendTextMessage(java.lang.String,java.lang.String,java.lang.String,android.app.PendingIntent,android.app.PendingIntent)>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<java.io.OutputStream: void write(byte[])>",
    "<android.location.Criteria: void setAltitudeRequired(boolean)>",
    "<java.io.FileOutputStream: void <init>",
    "<java.io.FileOutputStream: void write(byte[])>",
    "<android.content.Intent: android.content.Intent setClass(android.content.Context,java.lang.Class)>",
    "<android.location.Criteria: void setBearingRequired(boolean)>",
    "<android.location.Criteria: void setPowerRequirement(int)>",
    "<java.lang.Long: long parseLong(java.lang.String)>",
    "<android.util.Log: int i(java.lang.String,java.lang.String)>",
    "<java.lang.ProcessBuilder: java.lang.Process start()>",
    "<android.util.Log: int d(java.lang.String,java.lang.String)>",
    "<android.content.Intent: android.content.Intent setFlags(int)>",
    "<android.location.Criteria: void setCostAllowed(boolean)>",
    "<android.net.wifi.WifiManager: boolean setWifiEnabled(boolean)>",
    "<android.content.Context: android.content.ComponentName startService(android.content.Intent)>",
    "<android.location.Criteria: void setAccuracy(int)>",
    "<android.util.Log: int e(java.lang.String,java.lang.String)>",
    "<java.io.OutputStream: void write(byte[],int,int)>",
  )
}