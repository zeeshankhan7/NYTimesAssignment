package com.nytimes.fragment;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.nytimes.R;
import com.nytimes.utils.Constant;
import com.nytimes.utils.NewYorkTimesProgressDialog;

/**
 * Created by Zeeshan on 14-07-2021.
 */

public class ArticleDetailFragment extends Fragment {

    private View view;
    private WebView mWebview;
    private String mUrl;
    private NewYorkTimesProgressDialog newYorkTimesProgressDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.layout_fragment_detail, null);
        newYorkTimesProgressDialog = new NewYorkTimesProgressDialog(getActivity());

        mUrl = getArguments().getString(Constant.BUNDLE_ARTICLE_URL);

        initView(view);
        return view;
    }

    //initialize view objects.
    private void initView(View view) {
        mWebview = view.findViewById(R.id.webview);
        mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript
        mWebview.setWebViewClient(new WebViewController());
        mWebview.loadUrl(mUrl);
    }

    public class WebViewController extends WebViewClient {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
            newYorkTimesProgressDialog.showDialog();
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            newYorkTimesProgressDialog.dismissDialog();
            super.onPageFinished(view, url);

        }

        @Override
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            super.onReceivedError(view, request, error);
        }
    }
}
