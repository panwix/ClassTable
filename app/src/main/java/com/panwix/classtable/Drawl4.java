package com.panwix.classtable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Drawl4 extends View {


	public Drawl4(Context context, AttributeSet attr) {

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
		canvas.drawLine(0, 0, 195, 224, paint);

		for (int i = 0; i <= 7; i++) {
			if (i < 2) {
				canvas.drawLine(0, i * 224, getWidth(), i * 224, paint);
			} else if (i == 3 || i == 5) {
				canvas.drawLine(0, (i - 1) * 176 + 224 - 2, x,
						(i - 1) * 176 + 224 - 2, paint);
				canvas.drawLine(0, (i - 1) * 176 + 224 + 2, x,
						(i - 1) * 176 + 224 + 2, paint);
			} else {
				canvas.drawLine(0, (i - 1) * 176 + 224, getWidth(),
						(i - 1) * 176 + 224, paint);
			}

		}

		for (int j = 0; j <= 8; j++) {
			if (j < 2) {
				canvas.drawLine(j * 195, 0, j * 195, getHeight(), paint);
			} else {

				canvas.drawLine((j - 1) * 105 + 195, 0, (j - 1) * 105 + 195,
						getHeight(), paint);
			}
		}

	}
}