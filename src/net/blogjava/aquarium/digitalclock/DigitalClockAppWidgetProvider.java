package net.blogjava.aquarium.digitalclock;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;

public class DigitalClockAppWidgetProvider extends AppWidgetProvider {
	/**
	 * @see android.content.BroadcastReceiver#onReceive(Context,Intent)
	 */
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Put your code here
	}

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
		super.onUpdate(context, appWidgetManager, appWidgetIds);
		
//		context.startService(new Intent(context, UpdateService.class));
		
		UpdateService.updateAppWidget(context);
	}
	
	
}
