package br.unb.cic.android.specs

import br.unb.cic.android.AndroidTaintBenchTest

trait JollyservSpec extends AndroidTaintBenchTest {
//  URL https://github.com/TaintBench/jollyserv/blob/master/README.md
  override val sourceList = List(
    "<java.lang.Class: java.lang.reflect.Field[] getFields()>",
    "<java.io.ByteArrayOutputStream: byte[] toByteArray()>",
    "<javax.net.ssl.SSLContext: javax.net.ssl.SSLContext getInstance(java.lang.String)>",
    "<java.net.URL: java.lang.String getHost()>",
    "<java.lang.StackTraceElement: java.lang.String getClassName()>",
    "<javax.xml.parsers.DocumentBuilder: org.w3c.dom.Document parse(java.io.InputStream)>",
    "<java.lang.Class: java.lang.reflect.Method getMethod(java.lang.String,java.lang.Class[])>",
    "<android.webkit.WebView: void loadUrl(java.lang.String)>",
    "<android.os.StatFs: int getBlockSize()>",
    "<java.io.File: java.lang.String getName()>",
    "<android.os.StatFs: int getAvailableBlocks()>",
    "<android.accounts.AccountManager: android.accounts.AccountManagerFuture getAuthToken(android.accounts.Account,java.lang.String,android.os.Bundle,android.app.Activity,android.accounts.AccountManagerCallback,android.os.Handler)>",
    "<java.util.Calendar: java.util.Calendar getInstance()>",
    "<java.lang.String: byte[] getBytes()>",
    "<java.io.File: java.lang.String getPath()>",
    "<java.lang.Thread: long getId()>",
    "<android.view.View: int getId()>",
    "<android.location.Location: float getAccuracy()>",
    "<android.database.sqlite.SQLiteDatabase: android.database.Cursor rawQuery(java.lang.String,java.lang.String[])>",
    "<android.widget.ExpandableListView: long getExpandableListPosition(int)>",
    "<android.view.View: android.view.ViewGroup$LayoutParams getLayoutParams()>",
    "<android.widget.AdapterView: int getFirstVisiblePosition()>",
    "<android.view.View: android.content.res.Resources getResources()>",
    "<android.app.ProgressDialog: int getMax()>",
    "<android.telephony.SmsManager: android.telephony.SmsManager getDefault()>",
    "<java.io.BufferedReader: java.lang.String readLine()>",
    "<java.lang.Thread: int getPriority()>",
    "<java.lang.reflect.Field: int getInt(java.lang.Object)>",
    "<java.lang.Thread: java.lang.ThreadGroup getThreadGroup()>",
    "<android.content.Intent: java.lang.String getAction()>",
    "<android.webkit.CookieSyncManager: android.webkit.CookieSyncManager createInstance(android.content.Context)>",
    "<java.net.URL: java.lang.Object getContent()>",
    "<java.lang.Throwable: java.lang.String getMessage()>",
    "<java.lang.Thread: java.lang.Thread$UncaughtExceptionHandler getDefaultUncaughtExceptionHandler()>",
    "<java.net.URLDecoder: java.lang.String decode(java.lang.String,java.lang.String)>",
    "<java.lang.Throwable: java.lang.StackTraceElement[] getStackTrace()>",
    "<android.preference.PreferenceManager: android.content.SharedPreferences getDefaultSharedPreferences(android.content.Context)>",
    "<android.view.View: java.lang.Object getTag(int)>",
    "<android.content.res.Resources: android.util.DisplayMetrics getDisplayMetrics()>",
    "<java.lang.Class: java.lang.String getCanonicalName()>",
    "<android.graphics.BitmapFactory: android.graphics.Bitmap decodeFileDescriptor(java.io.FileDescriptor,android.graphics.Rect,android.graphics.BitmapFactory$Options)>",
    "<java.util.HashMap: java.lang.Object get(java.lang.Object)>",
    "<java.lang.Throwable: java.lang.Throwable getCause()>",
    "<java.lang.StackTraceElement: java.lang.String getMethodName()>",
    "<java.net.HttpURLConnection: java.io.InputStream getInputStream()>",
    "<java.net.URL: java.lang.String getQuery()>",
    "<android.os.Bundle: java.lang.Object get(java.lang.String)>",
    "<java.lang.ThreadGroup: java.lang.String getName()>",
    "<android.database.Cursor: int getInt(int)>",
    "<android.graphics.Bitmap: android.graphics.Bitmap createBitmap(int,int,android.graphics.Bitmap$Config)>",
    "<android.webkit.WebView: void stopLoading()>",
    "<java.util.WeakHashMap: java.lang.Object get(java.lang.Object)>",
    "<android.os.Looper: android.os.Looper getMainLooper()>",
    "<android.location.LocationManager: android.location.Location getLastKnownLocation(java.lang.String)>",
    "<java.util.Date: long getTime()>",
    "<android.accounts.AccountManager: java.lang.String blockingGetAuthToken(android.accounts.Account,java.lang.String,boolean)>",
    "<java.util.EnumMap: java.lang.Object get(java.lang.Object)>",
    "<android.telephony.TelephonyManager: java.lang.String getDeviceId()>",
    "<java.lang.reflect.Field: java.lang.Object get(java.lang.Object)>",
    "<java.lang.Class: java.lang.ClassLoader getClassLoader()>",
    "<android.os.Parcel: java.util.ArrayList createTypedArrayList(android.os.Parcelable$Creator)>",
    "<android.database.sqlite.SQLiteDatabase: java.lang.String getPath()>",
    "<android.widget.ProgressBar: int getMax()>",
    "<java.lang.ref.SoftReference: java.lang.Object get()>",
    "<org.json.JSONObject: java.lang.String getString(java.lang.String)>",
    "<android.database.Cursor: java.lang.String getString(int)>",
    "<java.io.FileInputStream: java.nio.channels.FileChannel getChannel()>",
    "<android.net.ConnectivityManager: android.net.NetworkInfo getActiveNetworkInfo()>",
    "<android.webkit.CookieManager: android.webkit.CookieManager getInstance()>",
    "<android.util.Log: java.lang.String getStackTraceString(java.lang.Throwable)>",
    "<android.telephony.TelephonyManager: int getSimState()>",
    "<java.io.ObjectInputStream: java.lang.Object readObject()>",
    "<android.view.View: android.view.ViewParent getParent()>",
    "<java.util.Calendar: int get(int)>",
    "<android.graphics.Bitmap: int getHeight()>",
    "<android.view.Display: float getRefreshRate()>",
    "<java.lang.reflect.Method: java.lang.Class[] getParameterTypes()>",
    "<android.os.Environment: java.io.File getExternalStorageDirectory()>",
    "<android.graphics.Bitmap: int getWidth()>",
    "<java.lang.reflect.Method: java.lang.Object invoke(java.lang.Object,java.lang.Object[])>",
    "<android.telephony.SmsMessage: android.telephony.SmsMessage createFromPdu(byte[])>",
    "<android.widget.EditText: android.text.Editable getText()>",
    "<java.lang.reflect.Method: java.lang.String getName()>",
    "<android.provider.Settings$System: java.lang.String getString(android.content.ContentResolver,java.lang.String)>",
    "<java.lang.Class: java.lang.'annotation'.Annotation getAnnotation(java.lang.Class)>",
    "<java.io.File: java.io.File[] listFiles()>",
    "<java.util.Locale: java.lang.String getLanguage()>",
    "<java.net.HttpURLConnection: java.io.InputStream getErrorStream()>",
    "<android.app.Dialog: android.content.Context getContext()>",
    "<android.widget.ExpandableListView: long getPackedPositionForChild(int,int)>",
    "<java.io.File: java.lang.String getAbsolutePath()>",
    "<org.apache.http.HttpHost: java.lang.String getHostName()>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<android.location.Location: double getLongitude()>",
    "<android.app.Activity: android.view.Window getWindow()>",
    "<org.json.JSONArray: org.json.JSONObject getJSONObject(int)>",
    "<android.view.Display: int getHeight()>",
    "<android.content.Intent: java.lang.String getStringExtra(java.lang.String)>",
    "<android.database.sqlite.SQLiteOpenHelper: android.database.sqlite.SQLiteDatabase getWritableDatabase()>",
    "<android.util.Xml: org.xmlpull.v1.XmlPullParser newPullParser()>",
    "<java.lang.reflect.Field: int getModifiers()>",
    "<java.lang.ClassLoader: java.io.InputStream getResourceAsStream(java.lang.String)>",
    "<java.net.URL: java.lang.String getPath()>",
    "<org.apache.http.message.BasicNameValuePair: java.lang.String getValue()>",
    "<java.net.URL: java.lang.String getRef()>",
    "<android.view.animation.AnimationUtils: android.view.animation.Animation loadAnimation(android.content.Context,int)>",
    "<android.location.Location: java.lang.String getProvider()>",
    "<java.io.FileInputStream: java.io.FileDescriptor getFD()>",
    "<android.database.sqlite.SQLiteDatabase: android.database.Cursor query(java.lang.String,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.lang.String)>",
    "<android.accounts.AccountManager: android.accounts.AccountManager get(android.content.Context)>",
    "<android.widget.AdapterView: java.lang.Object getSelectedItem()>",
    "<java.util.Locale: java.util.Locale getDefault()>",
    "<java.security.MessageDigest: java.security.MessageDigest getInstance(java.lang.String)>",
    "<android.telephony.TelephonyManager: java.lang.String getLine1Number()>",
    "<android.view.View: android.content.Context getContext()>",
    "<android.view.Display: void getMetrics(android.util.DisplayMetrics)>",
    "<android.os.Environment: java.io.File getDataDirectory()>",
    "<android.view.Display: int getWidth()>",
    "<org.apache.http.conn.scheme.PlainSocketFactory: org.apache.http.conn.scheme.PlainSocketFactory getSocketFactory()>",
    "<org.apache.http.impl.client.AbstractHttpClient: org.apache.http.client.HttpRequestRetryHandler getHttpRequestRetryHandler()>",
    "<java.lang.Runtime: java.lang.Runtime getRuntime()>",
    "<java.lang.ref.Reference: java.lang.Object get()>",
    "<java.lang.Double: double parseDouble(java.lang.String)>",
    "<android.content.Context: java.io.FileInputStream openFileInput(java.lang.String)>",
    "<android.content.res.Resources: java.lang.String getString(int)>",
    "<android.view.Display: int getPixelFormat()>",
    "<android.provider.Settings$Secure: java.lang.String getString(android.content.ContentResolver,java.lang.String)>",
    "<java.net.HttpURLConnection: int getResponseCode()>",
    "<android.telephony.SmsMessage: java.lang.String getMessageBody()>",
    "<java.net.URL: int getPort()>",
    "<android.content.Context: java.lang.Object getSystemService(java.lang.String)>",
    "<android.app.ActivityManager: java.util.List getRunningAppProcesses()>",
    "<android.os.Environment: java.lang.String getExternalStorageState()>",
    "<javax.net.ssl.SSLContext: javax.net.ssl.SSLSocketFactory getSocketFactory()>",
    "<android.graphics.Bitmap: int getRowBytes()>",
    "<android.os.Bundle: boolean getBoolean(java.lang.String)>",
    "<android.content.res.Resources: int getIdentifier(java.lang.String,java.lang.String,java.lang.String)>",
    "<android.graphics.BitmapFactory: android.graphics.Bitmap decodeStream(java.io.InputStream)>",
    "<android.app.Activity: android.view.LayoutInflater getLayoutInflater()>",
    "<java.lang.reflect.Field: java.lang.String getName()>",
    "<java.lang.Class: java.lang.reflect.Field getField(java.lang.String)>",
    "<java.lang.Long: long parseLong(java.lang.String)>",
    "<android.app.PendingIntent: android.app.PendingIntent getActivity(android.content.Context,int,android.content.Intent,int)>",
    "<java.io.File: java.io.File getParentFile()>",
    "<android.content.res.Resources: android.content.res.Configuration getConfiguration()>",
    "<android.content.Context: java.lang.String getString(int)>",
    "<android.webkit.WebView: android.webkit.WebSettings getSettings()>",
    "<android.location.Location: double getLatitude()>",
    "<android.net.Uri: java.lang.String getQueryParameter(java.lang.String)>",
    "<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)>",
    "<java.io.FileOutputStream: java.nio.channels.FileChannel getChannel()>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<java.lang.Class: java.lang.String getSimpleName()>",
    "<android.view.View: int getVisibility()>",
    "<java.lang.Boolean: boolean parseBoolean(java.lang.String)>",
    "<android.widget.ExpandableListView: int getPackedPositionChild(long)>",
    "<android.app.Activity: android.content.ComponentName getComponentName()>",
    "<java.io.FileInputStream: void <init>",
    "<java.util.ArrayList: java.lang.Object get(int)>",
    "<android.widget.TextView: java.lang.CharSequence getText()>",
    "<android.accounts.AccountManager: android.accounts.Account[] getAccountsByType(java.lang.String)>",
    "<java.net.URL: java.lang.String getProtocol()>",
    "<java.net.HttpURLConnection: java.lang.String getResponseMessage()>",
    "<android.os.Bundle: java.lang.String getString(java.lang.String)>",
    "<android.telephony.TelephonyManager: java.lang.String getSimOperatorName()>",
    "<java.lang.Integer: java.lang.Integer getInteger(java.lang.String)>",
    "<android.webkit.WebView: void loadData(java.lang.String,java.lang.String,java.lang.String)>",
    "<android.content.Intent: android.os.Bundle getExtras()>",
    "<org.apache.http.HttpHost: int getPort()>",
    "<android.database.CursorWindow: int getNumRows()>",
    "<java.security.MessageDigest: byte[] digest()>",
    "<android.widget.AdapterView: int getSelectedItemPosition()>",
    "<android.content.Context: java.lang.CharSequence getText(int)>",
    "<android.content.Context: java.lang.String getString(int,java.lang.Object[])>",
    "<java.net.HttpURLConnection: java.lang.String getContentEncoding()>",
    "<java.lang.reflect.Field: java.lang.Class getType()>",
    "<java.lang.Thread: java.lang.String getName()>",
    "<java.lang.String: byte[] getBytes(java.lang.String)>",
    "<android.database.sqlite.SQLiteDatabase: android.database.Cursor query(java.lang.String,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,java.lang.String,java.lang.String)>",
    "<android.webkit.WebView: void loadDataWithBaseURL(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)>",
    "<java.lang.Class: java.lang.String getName()>",
    "<android.os.StatFs: int getBlockCount()>",
    "<android.location.Location: long getTime()>",
    "<android.view.View: java.lang.Object getTag()>",
    "<org.apache.http.HttpEntity: java.io.InputStream getContent()>",
    "<android.database.Cursor: long getLong(int)>",
    "<java.util.Locale: java.lang.String getCountry()>",
    "<android.view.ViewGroup: android.view.View getChildAt(int)>",
    "<java.io.File: boolean delete()>",
    "<org.apache.http.conn.ssl.SSLSocketFactory: org.apache.http.conn.ssl.SSLSocketFactory getSocketFactory()>",
    "<org.apache.http.params.HttpConnectionParams: int getSoTimeout(org.apache.http.params.HttpParams)>",
    "<android.widget.ExpandableListView: android.widget.ExpandableListAdapter getExpandableListAdapter()>",
    "<java.io.File: void <init>",
    "<android.location.LocationManager: boolean isProviderEnabled(java.lang.String)>",
    "<java.lang.Class: java.lang.reflect.Method[] getMethods()>",
    "<android.os.Looper: java.lang.Thread getThread()>",
    "<android.util.SparseArray: java.lang.Object get(int)>",
    "<java.lang.Class: java.lang.reflect.Constructor getConstructor(java.lang.Class[])>",
    "<org.apache.http.params.HttpConnectionParams: int getConnectionTimeout(org.apache.http.params.HttpParams)>",
    "<android.widget.ExpandableListView: int getPackedPositionGroup(long)>",
  )

  override val sinkList = List(
    "<android.view.View: void setOnLongClickListener(android.view.View$OnLongClickListener)>",
    "<android.widget.Gallery: void setCallbackDuringFling(boolean)>",
    "<android.app.Activity: void setProgressBarVisibility(boolean)>",
    "<org.apache.http.impl.cookie.BasicClientCookie: void setPath(java.lang.String)>",
    "<javax.xml.parsers.DocumentBuilder: org.w3c.dom.Document parse(java.io.InputStream)>",
    "<java.lang.String: java.lang.String substring(int,int)>",
    "<android.widget.AdapterView: void setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>",
    "<android.view.View: void setTag(java.lang.Object)>",
    "<android.view.View: void setEnabled(boolean)>",
    "<org.apache.http.params.HttpConnectionParams: void setSoTimeout(org.apache.http.params.HttpParams,int)>",
    "<android.content.Intent: android.content.Intent setType(java.lang.String)>",
    "<android.content.ContentValues: void put(java.lang.String,java.lang.String)>",
    "<java.io.DataOutputStream: void write(byte[])>",
    "<android.widget.ListView: void setAdapter(android.widget.ListAdapter)>",
    "<android.widget.ImageView: void setImageMatrix(android.graphics.Matrix)>",
    "<java.io.OutputStream: void write(byte[],int,int)>",
    "<org.apache.http.conn.params.ConnManagerParams: void setMaxTotalConnections(org.apache.http.params.HttpParams,int)>",
    "<android.app.Notification: void setLatestEventInfo(android.content.Context,java.lang.CharSequence,java.lang.CharSequence,android.app.PendingIntent)>",
    "<android.app.Activity: void setProgressBarIndeterminateVisibility(boolean)>",
    "<android.webkit.WebView: void setBackgroundColor(int)>",
    "<android.graphics.drawable.TransitionDrawable: void setCrossFadeEnabled(boolean)>",
    "<java.net.URL: java.net.URLConnection openConnection()>",
    "<android.webkit.WebSettings: void setJavaScriptEnabled(boolean)>",
    "<android.widget.ProgressBar: void setProgress(int)>",
    "<android.webkit.WebSettings: void setBuiltInZoomControls(boolean)>",
    "<android.widget.ImageView: void setScaleType(android.widget.ImageView$ScaleType)>",
    "<android.util.Log: int d(java.lang.String,java.lang.String,java.lang.Throwable)>",
    "<android.widget.RatingBar: void setRating(float)>",
    "<org.apache.http.params.HttpConnectionParams: void setTcpNoDelay(org.apache.http.params.HttpParams,boolean)>",
    "<android.app.Activity: void onCreate(android.os.Bundle)>",
    "<android.os.Bundle: void putString(java.lang.String,java.lang.String)>",
    "<android.widget.ImageView: void setImageBitmap(android.graphics.Bitmap)>",
    "<android.util.Log: int i(java.lang.String,java.lang.String,java.lang.Throwable)>",
    "<org.apache.http.params.HttpConnectionParams: void setSocketBufferSize(org.apache.http.params.HttpParams,int)>",
    "<android.widget.MediaController: void setAnchorView(android.view.View)>",
    "<android.util.Log: int e(java.lang.String,java.lang.String)>",
    "<java.util.concurrent.ConcurrentHashMap: java.lang.Object put(java.lang.Object,java.lang.Object)>",
    "<org.apache.http.params.HttpProtocolParams: void setVersion(org.apache.http.params.HttpParams,org.apache.http.ProtocolVersion)>",
    "<android.app.ProgressDialog: void setMax(int)>",
    "<java.util.TreeSet: boolean add(java.lang.Object)>",
    "<android.widget.ExpandableListView: void setAdapter(android.widget.ExpandableListAdapter)>",
    "<android.widget.AbsListView: void setOnScrollListener(android.widget.AbsListView$OnScrollListener)>",
    "<org.apache.http.params.HttpConnectionParams: void setConnectionTimeout(org.apache.http.params.HttpParams,int)>",
    "<android.os.Bundle: void putAll(android.os.Bundle)>",
    "<android.widget.VideoView: void setOnPreparedListener(android.media.MediaPlayer$OnPreparedListener)>",
    "<java.lang.Double: double parseDouble(java.lang.String)>",
    "<org.apache.http.impl.client.AbstractHttpClient: org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest,org.apache.http.protocol.HttpContext)>",
    "<java.lang.Thread: void setDefaultUncaughtExceptionHandler(java.lang.Thread$UncaughtExceptionHandler)>",
    "<org.apache.http.conn.params.ConnManagerParams: void setTimeout(org.apache.http.params.HttpParams,long)>",
    "<android.util.Log: int d(java.lang.String,java.lang.String)>",
    "<android.content.Intent: android.content.Intent setFlags(int)>",
    "<android.widget.GridView: void setAdapter(android.widget.ListAdapter)>",
    "<android.accounts.AccountManager: void invalidateAuthToken(java.lang.String,java.lang.String)>",
    "<java.io.OutputStreamWriter: void write(java.lang.String)>",
    "<java.net.HttpURLConnection: void connect()>",
    "<android.util.Log: int w(java.lang.String,java.lang.String,java.lang.Throwable)>",
    "<android.view.View: void setLayoutParams(android.view.ViewGroup$LayoutParams)>",
    "<android.widget.TextView: void setText(java.lang.CharSequence)>",
    "<org.apache.http.impl.cookie.BasicClientCookie: void setDomain(java.lang.String)>",
    "<android.webkit.WebSettings: void setSupportZoom(boolean)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,java.lang.String[])>",
    "<java.io.ObjectOutputStream: void writeInt(int)>",
    "<android.util.Log: int v(java.lang.String,java.lang.String)>",
    "<java.net.HttpURLConnection: java.io.InputStream getInputStream()>",
    "<java.lang.Long: long parseLong(java.lang.String)>",
    "<android.content.Intent: android.content.Intent setClassName(java.lang.String,java.lang.String)>",
    "<android.widget.CompoundButton: void setChecked(boolean)>",
    "<android.content.SharedPreferences$Editor: boolean commit()>",
    "<org.apache.http.conn.scheme.SchemeRegistry: org.apache.http.conn.scheme.Scheme register(org.apache.http.conn.scheme.Scheme)>",
    "<android.content.ContentValues: void put(java.lang.String,java.lang.Long)>",
    "<android.widget.VideoView: void setVideoURI(android.net.Uri)>",
    "<android.app.Activity: void startActivityForResult(android.content.Intent,int)>",
    "<java.util.concurrent.ThreadPoolExecutor: java.util.concurrent.Future submit(java.lang.Runnable)>",
    "<java.net.HttpURLConnection: void setRequestMethod(java.lang.String)>",
    "<android.util.Log: int e(java.lang.String,java.lang.String,java.lang.Throwable)>",
    "<android.widget.ProgressBar: void setMax(int)>",
    "<android.net.Uri: android.net.Uri parse(java.lang.String)>",
    "<java.io.File: boolean setLastModified(long)>",
    "<android.view.View: void setBackgroundColor(int)>",
    "<org.apache.http.impl.client.DefaultHttpClient: org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest)>",
    "<java.io.OutputStreamWriter: void <init>",
    "<android.database.sqlite.SQLiteDatabase: long insert(java.lang.String,java.lang.String,android.content.ContentValues)>",
    "<java.lang.Boolean: boolean parseBoolean(java.lang.String)>",
    "<android.view.View: void setBackgroundResource(int)>",
    "<android.util.Log: int w(java.lang.String,java.lang.String)>",
    "<android.util.Log: int i(java.lang.String,java.lang.String)>",
    "<android.view.View: void setBackgroundDrawable(android.graphics.drawable.Drawable)>",
    "<java.util.HashSet: boolean add(java.lang.Object)>",
    "<android.widget.Toast: android.widget.Toast makeText(android.content.Context,java.lang.CharSequence,int)>",
    "<android.widget.ProgressBar: void setVisibility(int)>",
    "<android.content.Context: android.content.ComponentName startService(android.content.Intent)>",
    "<android.app.Activity: void startActivity(android.content.Intent)>",
    "<java.lang.String: java.lang.String replace(char,char)>",
    "<android.widget.TextView: void setTypeface(android.graphics.Typeface)>",
    "<android.view.View: void setClickable(boolean)>",
    "<org.apache.http.client.methods.HttpEntityEnclosingRequestBase: void setEntity(org.apache.http.HttpEntity)>",
    "<android.app.Activity: void setProgress(int)>",
    "<java.net.URL: void <init>",
    "<java.io.DataOutputStream: void writeBytes(java.lang.String)>",
    "<java.io.OutputStream: void write(byte[])>",
    "<java.io.ObjectOutputStream: void writeBoolean(boolean)>",
    "<android.widget.TextView: void setText(int)>",
    "<java.io.File: boolean setWritable(boolean,boolean)>",
    "<android.content.Context: void startActivity(android.content.Intent)>",
    "<org.apache.http.client.HttpClient: org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest)>",
    "<android.util.Log: int w(java.lang.String,java.lang.Throwable)>",
    "<android.widget.VideoView: void setOnErrorListener(android.media.MediaPlayer$OnErrorListener)>",
    "<android.view.View: void setTag(int,java.lang.Object)>",
    "<java.lang.Class: java.lang.Class forName(java.lang.String)>",
    "<android.widget.TextView: void setTextColor(int)>",
    "<android.util.Log: int v(java.lang.String,java.lang.String,java.lang.Throwable)>",
    "<java.lang.String: boolean startsWith(java.lang.String)>",
    "<android.app.NotificationManager: void notify(int,android.app.Notification)>",
    "<android.telephony.SmsManager: void sendTextMessage(java.lang.String,java.lang.String,java.lang.String,android.app.PendingIntent,android.app.PendingIntent)>",
    "<java.io.File: boolean setReadable(boolean,boolean)>",
    "<android.os.Handler: boolean sendMessage(android.os.Message)>",
    "<android.webkit.WebView: void setPictureListener(android.webkit.WebView$PictureListener)>",
    "<android.widget.Toast: void setGravity(int,int,int)>",
    "<android.view.animation.Animation: void setInterpolator(android.view.animation.Interpolator)>",
    "<android.app.AlertDialog: void setMessage(java.lang.CharSequence)>",
    "<android.view.Window: void setFlags(int,int)>",
    "<android.location.LocationManager: void requestLocationUpdates(java.lang.String,long,float,android.location.LocationListener,android.os.Looper)>",
    "<android.widget.TextView: void setTextSize(float)>",
    "<android.view.animation.Animation: void setAnimationListener(android.view.animation.Animation$AnimationListener)>",
    "<android.view.View: void setOnClickListener(android.view.View$OnClickListener)>",
    "<java.io.ObjectOutputStream: void writeObject(java.lang.Object)>",
    "<android.widget.VideoView: void setMediaController(android.widget.MediaController)>",
    "<android.graphics.Matrix: void setScale(float,float)>",
    "<java.io.DataOutputStream: void flush()>",
    "<java.lang.reflect.Method: java.lang.Object invoke(java.lang.Object,java.lang.Object[])>",
    "<org.apache.http.conn.params.ConnManagerParams: void setMaxConnectionsPerRoute(org.apache.http.params.HttpParams,org.apache.http.conn.params.ConnPerRoute)>",
    "<android.widget.ImageView: void setImageResource(int)>",
    "<org.apache.http.impl.cookie.BasicClientCookie: void setVersion(int)>",
    "<android.widget.AdapterView: void setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>",
    "<android.view.View: void setVisibility(int)>",
    "<java.io.File: boolean delete()>",
    "<java.lang.StringBuilder: void setLength(int)>",
    "<android.view.Window: void setFormat(int)>",
    "<android.content.Intent: android.content.Intent putExtra(java.lang.String,java.lang.String)>",
    "<org.apache.http.impl.cookie.BasicClientCookie: void setExpiryDate(java.util.Date)>",
    "<org.apache.http.impl.cookie.BasicClientCookie: void setComment(java.lang.String)>",
    "<org.apache.http.impl.cookie.BasicClientCookie: void setSecure(boolean)>",
    "<android.webkit.WebView: void setWebViewClient(android.webkit.WebViewClient)>",
    "<android.view.animation.Animation: void setStartTime(long)>",
    "<java.io.FileOutputStream: void write(byte[])>",
    "<java.io.FileOutputStream: void <init>",
    "<android.widget.ImageView: void setImageDrawable(android.graphics.drawable.Drawable)>",
    "<android.view.animation.Animation: void setDuration(long)>",
    "<org.apache.http.params.HttpProtocolParams: void setUserAgent(org.apache.http.params.HttpParams,java.lang.String)>",
    "<java.net.HttpURLConnection: void setInstanceFollowRedirects(boolean)>",
    "<android.app.ProgressDialog: void setProgress(int)>",
    "<android.widget.LinearLayout: void setOrientation(int)>",
    "<java.lang.Integer: int parseInt(java.lang.String)>",
    "<android.graphics.Paint: android.graphics.Xfermode setXfermode(android.graphics.Xfermode)>",
    "<android.widget.TextView: void setPadding(int,int,int,int)>",
    "<android.os.Handler: boolean sendMessageDelayed(android.os.Message,long)>",
    "<java.net.HttpURLConnection: java.io.OutputStream getOutputStream()>",
    "<android.location.LocationManager: void removeUpdates(android.location.LocationListener)>",
    "<java.util.HashMap: java.lang.Object put(java.lang.Object,java.lang.Object)>",
  )
}