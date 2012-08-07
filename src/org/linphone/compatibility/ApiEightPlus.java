package org.linphone.compatibility;

import android.annotation.TargetApi;
import android.media.AudioManager;
import android.view.Display;

/*
ApiEightPlus.java
Copyright (C) 2012  Belledonne Communications, Grenoble, France

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/
/**
 * @author Sylvain Berfini
 */
@TargetApi(8)
public class ApiEightPlus {
	
	public static int getRotation(Display display) {
		return display.getRotation();
	}
	
	public static boolean enableBluetoothHeadset(AudioManager mAudioManager) {
		if (mAudioManager.isBluetoothScoAvailableOffCall()){
			mAudioManager.setBluetoothScoOn(true);	
			mAudioManager.setMode(AudioManager.MODE_IN_CALL);
			mAudioManager.startBluetoothSco();
			return true;
		}
		return false;
	}
}
