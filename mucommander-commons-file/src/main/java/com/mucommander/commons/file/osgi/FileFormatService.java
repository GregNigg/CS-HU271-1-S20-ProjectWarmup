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
@BUG LowPriority - wpzq (1 of 3) ->|
@BUG LowPriority - wpzq (1 of 3) ->|package com.mucommander.commons.file.osgi;
@BUG LowPriority - wpzq (1 of 3) ->|
import com.mucommander.commons.file.archive.ArchiveFormatProvider;

/**
 * @author Arik Hadas
 */
public interface FileFormatService {

    ArchiveFormatProvider getProvider();
}
