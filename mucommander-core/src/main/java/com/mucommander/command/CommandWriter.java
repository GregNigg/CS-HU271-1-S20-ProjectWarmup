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
@BUG MediumPriority - xxbq (2 of 2) ->|
@BUG MediumPriority - xxbq (2 of 2) ->|package com.mucommander.command;

import com.mucommander.xml.XmlAttributes;
import com.mucommander.xml.XmlWriter;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Class used to write custom commands XML files.
 * <p>
 * <code>CommandWriter</code> is a {@link CommandBuilder} that will send
 * all build messages it receives into an XML stream (as defined in {@link CommandsXmlConstants}).
 * </p>
 * @author Nicolas Rinaudo
 */
@BUG LowPriority - orzr (1 of 3) ->|public class CommandWriter implements CommandsXmlConstants, CommandBuilder {
@BUG LowPriority - orzr (1 of 3) ->|    // - Instance variables --------------------------------------------------
@BUG LowPriority - orzr (1 of 3) ->|    // -----------------------------------------------------------------------
    /** Where to write the custom command associations to. */
    private XmlWriter out;



    // - Initialisation ------------------------------------------------------
    // -----------------------------------------------------------------------
    /**
     * Builds a new writer that will send data to the specified output stream.
     * @param  stream      where to write the XML data.
     * @throws IOException if an IO error occurs.
     */
    public CommandWriter(OutputStream stream) throws IOException {out = new XmlWriter(stream);}



    // - Builder methods ------------------------------------------------------
    // -----------------------------------------------------------------------
    /**
     * Opens the root XML element.
     */
    public void startBuilding() throws CommandException {
        try {
            out.startElement(ELEMENT_ROOT);
            out.println();
        }
        catch(IOException e) {throw new CommandException(e);}
    }

    /**
     * Closes the root XML element.
     */
    public void endBuilding() throws CommandException {
        try {out.endElement(ELEMENT_ROOT);}
        catch(IOException e) {throw new CommandException(e);}
    }

    /**
     * Writes the specified command's XML description.
     * @param  command          command that should be written.
     * @throws CommandException if an error occurs.
     */
    public void addCommand(Command command) throws CommandException {
        XmlAttributes attributes;

        // Builds the XML description of the command.
        attributes = new XmlAttributes();
        attributes.add(ATTRIBUTE_ALIAS, command.getAlias());
        attributes.add(ATTRIBUTE_VALUE, command.getCommand());
        if (command.getType().toString() != null)
        	attributes.add(ATTRIBUTE_TYPE, command.getType().toString());
        if(command.isDisplayNameSet())
            attributes.add(ATTRIBUTE_DISPLAY, command.getDisplayName());

        // Writes the XML description.
        try {out.writeStandAloneElement(ELEMENT_COMMAND, attributes);}
        catch(IOException e) {throw new CommandException(e);}
    }
}
