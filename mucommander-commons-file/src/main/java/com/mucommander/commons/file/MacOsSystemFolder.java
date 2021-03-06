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
@BUG LowPriority - efyg (3 of 3) ->|package com.mucommander.commons.file;
@BUG LowPriority - efyg (3 of 3) ->|
@BUG LowPriority - efyg (3 of 3) ->|
/**
 * Top-level Mac OS X system folders hidden by Finder. For more info about those files:
 * http://www.westwind.com/reference/OS-X/invisibles.html
 * 
 * @author Arik Hadas. Maxence Bernard 
 */
public enum MacOsSystemFolder {
	// Mac OS X system folders
    TRASHES("/.Trashes"),
    VOL("/.vol"),
    DEV("/dev"),
    AUTOMOUNT("/automount"),
    BIN("/bin"),
    CORES("/cores"),
    ETC("/etc"),
    LOST_FOUND("/lost+found"),    
    NETWORK("/Network"),
    PRIVATE("/private"),
    SBIN("/sbin"),
    TMP("/tmp"),
    USR("/usr"),
@BUG HighPriority - ohni (1 of 1) ->|    VAR("/var"),
//    "/Volumes",
    MACH_SYM("/mach.sym"),
    MACH_KERNEL("/mach_kernel"),
    MACH("/mach"),
    DESKTOP_DB("/Desktop DB"),
    DESKTOP_DF("/Desktop DF"),
    FILE_TRANSFER_FOLDER("/File Transfer Folder"),
    HOTFILES_BTREE("/.hotfiles.btree"),
    SPOTLIGHT_V100("/.Spotlight-V100"),
    HIDDEN("/.hidden"),     // Used by Mac OS X up to 10.3, not in 10.4
    USER_TRASH(System.getProperty("user.home")+"/.Trash"),  // User trash folder
    // Mac OS 9 system folders 
    APPLESHARE_PDS("/AppleShare PDS"),
    CLEANUP_AT_STARTUP("/Cleanup At Startup"),
    DESKTOP_FOLDER("/Desktop Folder"),
    NETWORK_TRASH_FOLDER("/Network Trash Folder"),
@BUG MediumPriority - njjs (1 of 2) ->|    SHUTDOWN_CHECK("/Shutdown Check"),
@BUG MediumPriority - njjs (1 of 2) ->|    TEMPORARY_ITEMS("/Temporary Items"),
    USER_TEMPORARY_ITEMS(System.getProperty("user.home")+"/Temporary Items"),  // User trash folder
    THEFINDBYCONTENTFOLDER("/TheFindByContentFolder"),
    THEVOLUMESETTINGSFOLDER("/TheVolumeSettingsFolder"),
    TRASH("/Trash"),
    VM_STORAGE("/VM Storage");

    /** file path */
	String path;

	MacOsSystemFolder(String path) {
		this.path = path;
	}

	public static boolean isSystemFile(AbstractFile file) {
		for (MacOsSystemFolder folder : values())
			if (folder.path.equals(file.getAbsolutePath()))
				return true;
		return false;
	}
}
