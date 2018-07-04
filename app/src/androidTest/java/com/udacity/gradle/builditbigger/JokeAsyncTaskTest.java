package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.asynctask.EndpointAsyncTask;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class JokeAsyncTaskTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyReturnOfNonEmptyString() {

        EndpointAsyncTask endpointsAsyncTask = new EndpointAsyncTask(null, null);
        endpointsAsyncTask.execute();

        String result = null;
        try {
            result = endpointsAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotNull(result);
    }
}
