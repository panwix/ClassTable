package com.panwix.classtable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Drawl extends View {


	public Drawl(Context context, AttributeSet attr) {

		super(context, attr);

	}

	@Override
	protected void onDraw(Canvas canvas) {

		float x = getWidth();
		float y = getHeight();

		Paint paintBackground = new Paint();
		paintBackground.setColor(Color.alpha(0));
		canvas.drawRect(0, 0, x, y, paintBackground);

		Paint paint = new Paint();
		paint.setColor(Color.BLACK);
		canvas.drawLine(0, 0, 130, 140, paint);

		for (int i = 0; i <= 7; i++) {
			if (i < 2) {
				canvas.drawLine(0, i * 140, getWidth(), i * 140, paint);
			} else if (i == 3 || i == 5) {
				canvas.drawLine(0, (i - 1) * 110 + 140 - 2, x,
						(i - 1) * 110 + 140 - 2, paint);
				canvas.drawLine(0, (i - 1) * 110 + 140 + 2, x,
						(i - 1) * 110 + 140 + 2, paint);
			} else {
				canvas.drawLine(0, (i - 1) * 110 + 140, getWidth(),
						(i - 1) * 110 + 140, paint);
			}

		}

		for (int j = 0; j <= 8; j++) {
			if (j < 2) {
				canvas.drawLine(j * 130, 0, j * 130, getHeight(), paint);
			} else {

				canvas.drawLine((j - 1) * 70 + 130, 0, (j - 1) * 70 + 130,
						getHeight(), paint);
			}
		}

	}
}