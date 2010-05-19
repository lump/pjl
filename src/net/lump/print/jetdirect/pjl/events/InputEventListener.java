package net.lump.print.jetdirect.pjl.events;

import java.util.EventListener;

/**
 * This is a listener which listens for input events.
 *
 * @author troy
 * @version $Id: InputEventListener.java,v 1.2 2009/01/30 23:39:34 bowmant Alpha $
 */
public abstract interface InputEventListener extends EventListener
{
   public void inputEventOccurred(InputEvent event);
}
