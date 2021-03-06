/*
 *  RPGeneration - A role playing utility generate interesting things
 *  Copyright (C) 2002 Devon Jones
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * Created on November 1, 2002, 1:22 PM
 */
package pcgen.core.doomsdaybook;

/**
 * <code>variableException</code> is an exception raised when a problem 
 * occurs when processing a variable.
 *
 *
 * @author Devon D Jones
 */
public class variableException extends Exception
{
	/**
	 * Creates a new instance of <code>variableException</code> without detail message.
	 */
	public variableException()
	{
		// Empty Constructor
	}

	/**
	 * Constructs an instance of <code>variableException</code> with the specified detail message.
	 * @param msg the detail message.
	 */
	public variableException(String msg)
	{
		super(msg);
	}
}
