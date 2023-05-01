package control;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.Element;
import main.Game;
import main.HealthExc;
import main.LabelExc;

public class MouseControl extends MouseAdapter implements MouseMotionListener {
	private Element hovered;
	
	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		ArrayList<Element> elements;
		int x, y;
		elements = Game.elements;
		x = e.getX();
		y = e.getY();
		hovered = null;
		for (Element element: elements) {
			/*
			if (Math.abs(x - element.x) > Game.UNIT_SIZE ||
				Math.abs(y - element.y) > Game.UNIT_SIZE)
				continue;*/
			int right = element.screenX + Game.UNIT_SIZE;
			int below = element.screenY + Game.UNIT_SIZE;
			element.hovered = x >= element.screenX && x < right;
			element.hovered&= y >= element.screenY && y < below;
			if (element.hovered) hovered = element;
		}
		(Game.window).makeCursor(Objects.isNull(hovered) ? Cursor.DEFAULT_CURSOR:Cursor.HAND_CURSOR);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (Objects.isNull(hovered)) return;
            try {
                hovered.clicked();
            } catch (HealthExc | LabelExc ex) {
                Logger.getLogger(MouseControl.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
}
