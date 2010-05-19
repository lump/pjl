package net.lump.print.jetdirect.pjl.ustatustypes;

import net.lump.print.jetdirect.pjl.events.InputEvent;
import net.lump.print.jetdirect.pjl.events.InputEventListener;
import java.io.Serializable;

/**
 * An abstract Unsolicited Status type.
 *
 * @author troy
 * @version $Id: UnsolicitedType.java,v 1.4 2009/11/12 17:49:40 bowmant Alpha $
 */
public abstract class UnsolicitedType implements Serializable
{
   String inputVariable = null;
   net.lump.print.jetdirect.pjl.commands.UnsolicitedStatus unsolicitedStatusCommand;

   public String getInputVariable()
   {
      return inputVariable;
   }

   public net.lump.print.jetdirect.pjl.commands.UnsolicitedStatus getUnsolicitedStatusCommand()
   {
      return unsolicitedStatusCommand;
   }

   public void setUnsolicitedStatusCommand(net.lump.print.jetdirect.pjl.commands.UnsolicitedStatus unsolicitedStatusCommand)
   {
      this.unsolicitedStatusCommand = unsolicitedStatusCommand;
   }

   public void addUStatusListener(InputEventListener inputEventListener)
   {
      unsolicitedStatusCommand.addInputListener(inputEventListener);
   }

   public void fireEvent(InputEvent inputEvent)
   {
      if (unsolicitedStatusCommand != null)
      {
         unsolicitedStatusCommand.fireEvent(inputEvent);
      }
   }

   public abstract String getInputValueString();

   public abstract void readInput(String input);

   /**
    * This method sets variables so that if the printer receives a toString(), it will turn it off.
    */
   public abstract void setToOff();
}

