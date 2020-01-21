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
@BUG LowPriority - wvnk (3 of 3) ->|
@BUG LowPriority - wvnk (3 of 3) ->|package com.mucommander.commons.io;
@BUG LowPriority - wvnk (3 of 3) ->|
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

/**
 * This class extends <code>java.security.DigestInputStream</code> and adds convenience methods that return the
 * digest/checksum expressed in various forms.
 *
 * @see com.mucommander.commons.io.ChecksumOutputStream
 * @author Maxence Bernard
 */
public class ChecksumInputStream extends DigestInputStream {

    public ChecksumInputStream(InputStream stream, MessageDigest digest) {
        super(stream, digest);
    }


    /**
     * Returns this stream's digest, expressed as a byte array.
     *
     * @return this stream's digest, expressed as a byte array
     */
    public byte[] getChecksumBytes() {
        return getMessageDigest().digest();
@BUG HighPriority - wijj (1 of 1) ->|    }

    /**
     * Returns this stream's digest, expressed as an hexadecimal string.
     *
     * @return this stream's digest, expressed as an hexadecimal string
     */
    public String getChecksumString() {
        return ByteUtils.toHexString(getChecksumBytes());
    }
}
