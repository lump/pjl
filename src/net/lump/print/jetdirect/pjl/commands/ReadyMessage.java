package net.lump.print.jetdirect.pjl.commands;

import net.lump.print.jetdirect.pjl.enums.CommandNames;

/**
 * The RDYMSG command replaces the control panel's ?ready?
 * message with the specified message. Use the RDYMSG command to
 * modify the displayed message while keeping the printer online.
 * <p/>
 * Since the RDYMSG command leaves the printer online, it can be
 * used to display the name of the person printing the current job, or
 * other pertinent information, while a job is printing. It also can be used
 * in network environments to display the name of the printer.
 *
 * @author troy
 * @version $Id: ReadyMessage.java,v 1.2 2009/01/30 23:39:30 bowmant Alpha $
 */
public class ReadyMessage extends Message
{
   public ReadyMessage(String message)
   {
      super(CommandNames.RDYMSG, message);
   }
}
