package com.nm.esign.entities;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.webkit.CookieManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.apache.http.client.methods.HttpPost;

import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * Created by Lenovo5 on 12/21/2016.
 */

public class Entities {
    public class Server {

   

      public String url = "";
    

    }

    public class Splash {
        public SharedPreferences USER;

        public Thread splashThread;

        public int wait = 0;
        public final int TOTAL_WAIT = 2000, INCR = 100;
    }

    public class SharedValues {
        public SharedPreferences userPreferences;
    }

    public class Headers {
        public ImageView label, header_timer_img;
        public ImageButton btn_left, btn_right;
        public TextView header;
    }

    public class ShowDialogs {
        public EditText login_email, login_password;
        public Activity ctx;
    }

    public class Communicator {
        public ProgressDialog progressDialog;
        public HttpURLConnection connection;
        public URL urls;
        public HttpPost urls1;
        public int TIME_OUT = 120000;
        //public int TIME_OUT =5000;
        public boolean isConnectTimeout = false, isException = false,
                isError = false;
        public String message = "", param = "", response = "";;
        public CookieManager cookieManager = CookieManager.getInstance();
        public PrintWriter out;
        public Scanner inStream;
        public List<String> cookieList = new ArrayList<String>();

        public void trustAllHosts() {
            TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return new java.security.cert.X509Certificate[] {};
                }

                public void checkClientTrusted(X509Certificate[] chain,
                                               String authType) throws CertificateException {
                }

                public void checkServerTrusted(X509Certificate[] chain,
                                               String authType) throws CertificateException {
                }
            } };

            try {
                SSLContext sc = SSLContext.getInstance("TLS");
                sc.init(null, trustAllCerts, new java.security.SecureRandom());
                HttpsURLConnection.setDefaultSSLSocketFactory(sc
                        .getSocketFactory());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final HostnameVerifier DO_NOT_VERIFY = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
    }

    public class LoginObjects {
        public SharedPreferences USER;
        public float headerFont, largeFont, mediumFont, smallFont,
                verysmallFont;
        public int largePadding, smallPadding, Padding;

        public Activity ctx;
        public EditText user_url, user_email, user_password;
        public android.support.v7.widget.AppCompatButton btn_login;
        public RelativeLayout logo_layout, cust_support, remember_layout;
        public LinearLayout content, layout1, layout2, layout3, container;
        public ImageView rememberMe, logo;
        public TextView customer_support, forgot_password, remember, label,
                url, url2;
    }

    public class MainScreen {
        public SharedPreferences USER;

    }

    public class TemplatesObject{
        public Activity ctx;

    }

    public class ForgotPass {
        public Activity ctx;
        public EditText user_url, user_email;
        public ImageButton btn_submit, btn_cancel;
        public RelativeLayout logo_layout, layout_label;
        public LinearLayout container, content, layout1, layout, layout2;
        public ImageView logo;
        public TextView label, forgot_password, url_one, url_two;
    }

    public class HomeScreenObject {
        public android.support.v7.widget.AppCompatButton btn_send_document;

    }

}
