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
@BUG LowPriority - ltno (3 of 3) ->|
@BUG LowPriority - ltno (3 of 3) ->|package com.mucommander.commons.file.filter;
@BUG LowPriority - ltno (3 of 3) ->|
import com.mucommander.commons.util.StringUtils;

/**
 * This filter matches files whose string criterion values end with a specified string.
 *
 * @author Maxence Bernard
 */
public class AbstractEndsWithFilter extends AbstractStringCriterionFilter {

    /** The string to compare criterion values against */
    private String s;

    /**
     * Creates a new <code>AbstractEndsWithFilter</code> using the specified generator and string, and operating in the 
     * specified mode.
     *
     * @param generator generates criterion values for files as requested
     * @param s the string to compare criterion values against
     * @param caseSensitive if true, this filter will be case-sensitive
     * @param inverted if true, this filter will operate in inverted mode.
     */
    public AbstractEndsWithFilter(CriterionValueGenerator<String> generator, String s, boolean caseSensitive, boolean inverted) {
        super(generator, caseSensitive, inverted);
        this.s = s;
    }


    //////////////////////////////////////////////////
    // AbstractStringCriterionFilter implementation //
    //////////////////////////////////////////////////
@BUG HighPriority - fybk (1 of 1) ->|
    public boolean accept(String value) {
        if(isCaseSensitive())
            return value.endsWith(s);
        return StringUtils.endsWithIgnoreCase(value, s);
    }
}
