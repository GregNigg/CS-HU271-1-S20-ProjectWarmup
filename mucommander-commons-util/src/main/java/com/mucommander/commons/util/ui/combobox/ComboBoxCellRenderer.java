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
@BUG MediumPriority - apel (2 of 2) ->|
@BUG MediumPriority - apel (2 of 2) ->|package com.mucommander.commons.util.ui.combobox;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * @author Nicolas Rinaudo
 */
public class ComboBoxCellRenderer implements ListCellRenderer {
    private Color textColor;
    private Color backgroundColor;
    private Color selectedTextColor;
    private Color selectedBackgroundColor;
    private Font  font;
    private JLabel label;

    public ComboBoxCellRenderer() {
        label = new JLabel();
        label.setOpaque(true);
    }

    public void setForeground(Color color) {textColor = color;}
    public void setBackground(Color color) {backgroundColor = color;}
@BUG LowPriority - hhzu (1 of 3) ->|    public void setSelectionForeground(Color color) {selectedTextColor = color;}
@BUG LowPriority - hhzu (1 of 3) ->|    public void setSelectionBackground(Color color) {selectedBackgroundColor = color;}
@BUG LowPriority - hhzu (1 of 3) ->|    public void setFont(Font f) {font = f;}

    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean hasFocus) {
        if(value!=null)
            label.setText(value.toString());

        if(font == null)
            label.setFont(list.getFont());
        else
            label.setFont(font);

        if(isSelected) {
            if(selectedBackgroundColor == null)
                label.setBackground(list.getSelectionBackground());
            else
                label.setBackground(selectedBackgroundColor);
            if(selectedTextColor == null)
                label.setForeground(list.getSelectionForeground());
            else
                label.setForeground(selectedTextColor);
        }
        else {
            if(backgroundColor == null)
                label.setBackground(list.getBackground());
            else
                label.setBackground(backgroundColor);
            if(textColor == null)
                label.setForeground(list.getForeground());
            else
                label.setForeground(textColor);
        }
        return label;
    }
}
