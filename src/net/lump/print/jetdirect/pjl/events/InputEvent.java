package net.lump.print.jetdirect.pjl.events;

import java.io.Serializable;
import java.util.EventObject;

/**
 * This event is usually fired when an input event is received.
 *
 * @author troy
 * @version $Id: InputEvent.java,v 1.3 2009/04/02 03:27:41 bowmant Alpha $
 */
public class InputEvent extends EventObject implements Serializable
{
   public InputEvent(Object source)
   {
      super(source);
   }
}
