/**
 * This file is part of muCommander, http://www.mucommander.com
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
@BUG MediumPriority - bqdh (2 of 2) ->|
@BUG MediumPriority - bqdh (2 of 2) ->|package com.mucommander.commons.file.compat;

import com.mucommander.commons.file.AbstractFile;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;


/**
 * @author Maxence Bernard
 */
public class CompatURLStreamHandler extends URLStreamHandler {

    protected AbstractFile file;

@BUG LowPriority - xmzo (1 of 3) ->|    public CompatURLStreamHandler() {
@BUG LowPriority - xmzo (1 of 3) ->|    }
@BUG LowPriority - xmzo (1 of 3) ->|
    public CompatURLStreamHandler(AbstractFile file) {
        this.file = file;
    }

    
    /////////////////////////////////////
    // URLStreamHandler implementation //
    /////////////////////////////////////

    @Override
    protected URLConnection openConnection(URL url) throws IOException {
        return new CompatURLConnection(url, file);      // Note: file may be null
    }
}
