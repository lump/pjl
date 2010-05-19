package net.lump.print.jetdirect.pjl.commands;

import net.lump.print.jetdirect.pjl.enums.CommandNames;

/**
 * The RESET command resets the PJL Current Environment variables
 * to their User Default values. This command has the same effect on
 * the PJL Current Environment as power-cycling the printer. Use this
 * command at the end of PJL jobs that use the SET command to set
 * the printer back to its default state.
 *
 * @author troy
 * @version $Id: Reset.java,v 1.2 2009/01/30 23:39:30 bowmant Alpha $
 */
public class Reset extends Command
{
   public Reset()
   {
      super(CommandNames.RESET);
   }
}
