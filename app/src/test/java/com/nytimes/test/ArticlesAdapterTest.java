package com.nytimes.test;

import android.app.FragmentManager;
import android.content.Context;
import android.content.res.AssetManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nytimes.activity.MainActivity;
import com.nytimes.adapter.ArticlesAdapter;
import com.nytimes.fragment.ArticlesFragment;
import com.nytimes.model.Response;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.spy;

/**
 * Created by Zeeshan on 14-07-2022.
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest({Context.class, AssetManager.class, MainActivity.class})
public class ArticlesAdapterTest {
    @Mock
    private ViewGroup viewGroup;
    private ArticlesAdapter articlesAdapter;
    private MainActivity spyMainActivity;
    @Mock
    private LayoutInflater mockLayoutInflater;
    @Mock
    private View mockInflatedView;

    private ArticlesFragment spyArticlesFragment;
    @Mock
    private Context context;
    @Mock
    private FragmentManager fragmentManager;
    @Mock
    Response response;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        spyArticlesFragment = spy(ArticlesFragment.class);
        spyMainActivity = spy(new MainActivity());
    }
}
