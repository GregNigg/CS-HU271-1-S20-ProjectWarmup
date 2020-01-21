/*
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
@BUG LowPriority - sptf (3 of 3) ->|
@BUG LowPriority - sptf (3 of 3) ->|package com.mucommander.commons.io;
@BUG LowPriority - sptf (3 of 3) ->|
import java.io.IOException;

/**
 * <code>FilterRandomAccessInputStream</code> implements {@link RandomAccessInputStream} by delegating all methods
 * to an existing <code>RandomAccessInputStream</code> instance. It allows to override selected methods and
 * filter the underlying <code>RandomAccessInputStream</code>.
 *
 * @see java.io.FilterInputStream
 * @author Maxence Bernard
 */
public class FilterRandomAccessInputStream extends RandomAccessInputStream {

    /** The RandomAccessInputStream instance to proxy */
@BUG HighPriority - xzbt (1 of 1) ->|    protected RandomAccessInputStream rais;

    public FilterRandomAccessInputStream(RandomAccessInputStream rais) {
        this.rais = rais;
    }


    ////////////////////////////////////////////
    // RandomAccessInputStream implementation //
    ////////////////////////////////////////////

    @Override
@BUG MediumPriority - keyi (1 of 2) ->|    public int read() throws IOException {
@BUG MediumPriority - keyi (1 of 2) ->|        return rais.read();
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return rais.read(b, off, len);
    }

    @Override
    public void close() throws IOException {
        rais.close();
    }

    public long getOffset() throws IOException {
        return rais.getOffset();
    }

    public long getLength() throws IOException {
        return rais.getLength();
    }

    public void seek(long offset) throws IOException {
        rais.seek(offset);
    }
}
