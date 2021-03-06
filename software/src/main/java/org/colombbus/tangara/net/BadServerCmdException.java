/**
 * Tangara is an educational platform to get started with programming.
 * Copyright (C) 2008 Colombbus (http://www.colombbus.org)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.colombbus.tangara.net;

/**
 * Exception thrown when the called server is not a tangara server
 * 
 * @author gwen
 */
@SuppressWarnings("serial")
public class BadServerCmdException extends CommandException {

	/**
	 * Create a new bad server command exception
	 * 
	 * @param url
	 *            the server address
	 * @param code
	 *            the error code
	 * @param message
	 *            a message describing the error
	 * @param cause
	 *            the original cause of the error
	 */
	public BadServerCmdException(String url, int code, String message,
			Throwable cause) {
		super(url, code, message, cause);
	}

	/**
	 * Create a new bad server command exception
	 * 
	 * @param url
	 *            the server address
	 * @param code
	 *            the error code
	 * @param message
	 *            a message describing the error
	 */
	public BadServerCmdException(String url, int code, String message) {
		super(url, code, message);
	}

}
