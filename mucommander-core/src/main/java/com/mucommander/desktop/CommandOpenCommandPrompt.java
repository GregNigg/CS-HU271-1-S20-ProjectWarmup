@BUG MediumPriority - kiuy (2 of 2) ->|package com.mucommander.desktop;
@BUG MediumPriority - kiuy (2 of 2) ->|
import java.io.IOException;
import com.mucommander.command.Command;
import com.mucommander.command.CommandManager;
import com.mucommander.commons.file.AbstractFile;
import com.mucommander.process.ProcessRunner;

class CommandOpenCommandPrompt extends LocalFileOperation {
    @Override
    public boolean isAvailable() {
        return CommandManager.getCommandForAlias(CommandManager.CMD_OPENER_ALIAS) != null;
    }

@BUG LowPriority - bwsh (1 of 3) ->|    @Override
@BUG LowPriority - bwsh (1 of 3) ->|    public void execute(AbstractFile file) throws IOException {
@BUG LowPriority - bwsh (1 of 3) ->|        Command command;
        if ((command = CommandManager.getCommandForAlias(CommandManager.CMD_OPENER_ALIAS)) == null)
            throw new UnsupportedOperationException();

        if(!file.isDirectory()) {
            file = file.getParent();
        }
        ProcessRunner.execute(command.getTokens(file), file);
    }

    @Override
    public String getName() {
        Command command;

        if ((command = CommandManager.getCommandForAlias(CommandManager.CMD_OPENER_ALIAS)) != null)
            return command.getDisplayName();
        return null;
    }
}