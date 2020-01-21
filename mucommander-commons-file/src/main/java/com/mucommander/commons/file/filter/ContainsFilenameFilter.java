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
@BUG MediumPriority - dghb (2 of 2) ->|
@BUG MediumPriority - dghb (2 of 2) ->|package com.mucommander.commons.file.filter;

/**
 * This {@link FilenameFilter} matches filenames that contain a specified string that can be located anywhere in the
 * filename.
 *
 * @author Maxence Bernard
 */
public class ContainsFilenameFilter extends AbstractContainsFilter implements FilenameFilter {

    /**
     * Creates a new case-insensitive <code>ContainsFilenameFilter</code> operating in non-inverted mode.
     *
     * @param s the string to compare filenames against
     */
    public ContainsFilenameFilter(String s) {
        this(s, false, false);
    }

    /**
     * Creates a new <code>ContainsFilenameFilter</code> operating in non-inverted mode.
     *
     * @param s the string to compare filenames against
     * @param caseSensitive if true, this FilenameFilter will be case-sensitive
     */
@BUG LowPriority - ikpf (1 of 3) ->|    public ContainsFilenameFilter(String s, boolean caseSensitive) {
@BUG LowPriority - ikpf (1 of 3) ->|        this(s, caseSensitive, false);
@BUG LowPriority - ikpf (1 of 3) ->|    }

    /**
     * Creates a new <code>ContainsFilenameFilter</code> operating in the specified mode.
     *
     * @param s the string to compare filenames against
     * @param caseSensitive if true, this FilenameFilter will be case-sensitive
     * @param inverted if true, this filter will operate in inverted mode.
     */
    public ContainsFilenameFilter(String s, boolean caseSensitive, boolean inverted) {
        super(new FilenameGenerator(), s, caseSensitive, inverted);
    }
}
