package net.blogjava.aquarium.digitalclock;

import java.util.Arrays;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.util.Log;
import android.widget.RemoteViews;

public class ClockAppWidgetProvider extends AppWidgetProvider {

	private static final String TAG = ClockAppWidgetProvider.class.getSimpleName();

	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		// TODO Auto-generated method stub
		super.onDeleted(context, appWidgetIds);
	}

	@Override
	public void onDisabled(Context context) {
		// TODO Auto-generated method stub
		super.onDisabled(context);
	}

	@Override
	public void onEnabled(Context context) {
		// TODO Auto-generated method stub
		super.onEnabled(context);
	}

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		
		Log.d(TAG, "[onUpdate] ** appWidgetIds -- " + Arrays.toString(appWidgetIds));
		
		RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.main_transparent);
	
		
        views.setTextViewText(R.id.time, "23:26");
        
        views.setTextViewText(R.id.date, "2010-10-12");
        
        appWidgetManager.updateAppWidget(appWidgetIds, views);
	}
	
	
}
