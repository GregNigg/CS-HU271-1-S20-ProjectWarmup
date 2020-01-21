/*
 * This file is part of muCommander, http://www.mucommander.com
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
@BUG LowPriority - hxzm (3 of 3) ->|
@BUG LowPriority - hxzm (3 of 3) ->|package com.mucommander.commons.util.ui.button;
@BUG LowPriority - hxzm (3 of 3) ->|
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

/**
 * This class allows to add a rollover effect to a <code>JButton</code>. Rollover-enabled buttons have no borders
 * by default. It is only when the mouse cursor is over the button that the button's borders get painted.
 * This rollover effect gives the user a visual indication that the button can be pressed (in other words, that the
 * button is indeed a button), while not cluttering the interface with button borders.
 * Such buttons are particularly effective for toolbars, where a large number of buttons are usually present.
 *
 * <p>
 * To 'rollover-enable' a button, the {@link #setButtonDecoration(javax.swing.JButton)} method must first be called to
 * set decoration properties. Then, the button must register an instance of <code>RolloverButtonAdapter</code> as a
 * mouse listener. Note that a single <code>RolloverButtonAdapter</code> instance can be registered with several buttons.  
 * </p>
 *
 * @author Maxence Bernard
 */
@BUG HighPriority - tdeq (1 of 1) ->|public class RolloverButtonAdapter implements MouseListener {

    /**
     * Creates a new RolloverButtonAdapter.
     */
    public RolloverButtonAdapter() {
    }

    /**
     * Sets the decoration properties required to give the specified button a 'rollover' look and feel.
     *
     * @param button the button to 'rollover-enable'
     */
    public static void setButtonDecoration(JButton button) {
        // Set button decorations and rollover behavior
        button.setRolloverEnabled(true);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
    }


    ///////////////////////////
    // MouseListener methods //
    ///////////////////////////
@BUG MediumPriority - apel (1 of 2) ->|
@BUG MediumPriority - apel (1 of 2) ->|    public void mouseEntered(MouseEvent e) {
        ((JButton)e.getSource()).setBorderPainted(true);
    }

    public void mouseExited(MouseEvent e) {
        ((JButton)e.getSource()).setBorderPainted(false);
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }
}
